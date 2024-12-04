/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Modelo.Paciente;
import Modelo.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author MOON
 */
public class PacienteData {
    
 private static final Logger LOGGER = Logger.getLogger(PacienteData.class.getName());
    private Connection conn;

    // Consultas SQL como constantes
    private static final String SQL_INSERT = "INSERT INTO pacientes (edad, altura, pesoActual, pesoBuscado, dni, apellido, nombre, activo) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
    private static final String SQL_UPDATE = "UPDATE pacientes SET edad = ?, altura = ?, pesoActual = ?, pesoBuscado = ?, dni = ?, apellido = ?, nombre = ?, activo = ? WHERE idPaciente = ?";
    private static final String SQL_DELETE = "DELETE FROM pacientes WHERE idPaciente = ?";
    private static final String SQL_SELECT_ALL = "SELECT * FROM pacientes";
    private static final String SQL_SELECT_BY_ID = "SELECT * FROM pacientes WHERE idPaciente = ?";
    private static final String SQL_SELECT_BY_DNI = "SELECT * FROM pacientes WHERE dni = ?";
    private static final String SQL_SELECT_BY_APELLIDO = "SELECT * FROM pacientes WHERE apellido LIKE ?";
    private static final String SQL_SELECT_ACTIVE = "SELECT * FROM pacientes WHERE activo = 1";
    private static final String SQL_SELECT_INACTIVE = "SELECT * FROM pacientes WHERE activo = 0";
    private static final String SQL_SELECT_SIMPLE = "SELECT idPaciente, nombre, apellido FROM pacientes";

    public PacienteData() {
        conn = Conexion.getConexion();
    }
    
    private void validarPaciente(Paciente paciente) {
        if (paciente == null || paciente.getNombre() == null || paciente.getApellido() == null || paciente.getDni() <= 0) {
            throw new IllegalArgumentException("El paciente o sus datos esenciales no pueden ser nulos o inválidos.");
        }
    }
    
        private List<Paciente> ejecutarConsulta(String sql, SQLConsumer<PreparedStatement> configurador) {
        List<Paciente> pacientes = new ArrayList<>();
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            configurador.accept(ps);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    pacientes.add(mapearPaciente(rs));
                }
            }
        } catch (SQLException ex) {
            LOGGER.log(Level.SEVERE, "Error al ejecutar consulta", ex);
            throw new RuntimeException("Error al ejecutar consulta: " + ex.getMessage(), ex);
        }
        return pacientes;
    }
        
        private Paciente ejecutarConsultaUnica(String sql, SQLConsumer<PreparedStatement> configurador) {
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            configurador.accept(ps);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return mapearPaciente(rs);
                }
            }
        } catch (SQLException ex) {
            LOGGER.log(Level.SEVERE, "Error al ejecutar consulta única", ex);
            throw new RuntimeException("Error al ejecutar consulta única: " + ex.getMessage(), ex);
        }
        return null;
    }

    private Paciente mapearPaciente(ResultSet rs) throws SQLException {
        Paciente paciente = new Paciente();
        paciente.setIdPaciente(rs.getInt("idPaciente"));
        paciente.setEdad(rs.getInt("edad"));
        paciente.setAltura(rs.getDouble("altura"));
        paciente.setPesoActual(rs.getDouble("pesoActual"));
        paciente.setPesoBuscado(rs.getDouble("pesoBuscado"));
        paciente.setDni(rs.getInt("dni"));
        paciente.setApellido(rs.getString("apellido"));
        paciente.setNombre(rs.getString("nombre"));
        paciente.setActivo(rs.getBoolean("activo"));
        return paciente;
    }
    
    private void setPreparedStatement(PreparedStatement ps, Paciente paciente) throws SQLException {
    ps.setInt(1, paciente.getEdad());
    ps.setDouble(2, paciente.getAltura());
    ps.setDouble(3, paciente.getPesoActual());
    ps.setDouble(4, paciente.getPesoBuscado());
    ps.setInt(5, paciente.getDni());
    ps.setString(6, paciente.getApellido());
    ps.setString(7, paciente.getNombre());
}

    
public void guardarPaciente(Paciente paciente) {
        validarPaciente(paciente);

        try (PreparedStatement ps = conn.prepareStatement(SQL_INSERT, Statement.RETURN_GENERATED_KEYS)) {
            setPreparedStatement(ps, paciente);
            ps.setBoolean(8, paciente.isActivo());

            int rowsAffected = ps.executeUpdate();
            if (rowsAffected == 0) {
                throw new SQLException("No se pudo guardar el paciente, no se insertaron filas.");
            }

            try (ResultSet rs = ps.getGeneratedKeys()) {
                if (rs.next()) {
                    paciente.setIdPaciente(rs.getInt(1));
                }
            }
        } catch (SQLException ex) {
            LOGGER.log(Level.SEVERE, "Error al guardar el paciente", ex);
            throw new RuntimeException("Error al guardar el paciente: " + ex.getMessage(), ex);
        }
    }

    public void actualizarPaciente(Paciente paciente) {
        validarPaciente(paciente);

        try (PreparedStatement ps = conn.prepareStatement(SQL_UPDATE)) {
            setPreparedStatement(ps, paciente);
            ps.setBoolean(8, paciente.isActivo());
            ps.setInt(9, paciente.getIdPaciente());

            int rowsAffected = ps.executeUpdate();
            if (rowsAffected == 0) {
                throw new SQLException("No se pudo actualizar el paciente.");
            }
        } catch (SQLException ex) {
            LOGGER.log(Level.SEVERE, "Error al actualizar el paciente", ex);
            throw new RuntimeException("Error al actualizar el paciente: " + ex.getMessage(), ex);
        }
    }

    public void borrarPaciente(int idPaciente) {
        try (PreparedStatement ps = conn.prepareStatement(SQL_DELETE)) {
            ps.setInt(1, idPaciente);
            ps.executeUpdate();
        } catch (SQLException ex) {
            LOGGER.log(Level.SEVERE, "Error al borrar el paciente", ex);
            throw new RuntimeException("Error al borrar el paciente: " + ex.getMessage(), ex);
        }
    }

    public List<Paciente> obtenerTodosLosPacientes() {
        return ejecutarConsulta(SQL_SELECT_ALL, ps -> {});
    }

    public List<Paciente> obtenerPacientes() {
        return ejecutarConsulta(SQL_SELECT_SIMPLE, ps -> {});
    }

    public Paciente buscarPacientePorId(int idPaciente) {
        return ejecutarConsultaUnica(SQL_SELECT_BY_ID, ps -> ps.setInt(1, idPaciente));
    }

    public Paciente buscarPacientePorDni(int dni) {
        return ejecutarConsultaUnica(SQL_SELECT_BY_DNI, ps -> ps.setInt(1, dni));
    }

    public List<Paciente> buscarPacientesPorApellido(String apellido) {
        return ejecutarConsulta(SQL_SELECT_BY_APELLIDO, ps -> ps.setString(1, "%" + apellido + "%"));
    }

    public List<Paciente> obtenerPacientesActivos() {
        return ejecutarConsulta(SQL_SELECT_ACTIVE, ps -> {});
    }

    public List<Paciente> obtenerPacientesInactivos() {
        return ejecutarConsulta(SQL_SELECT_INACTIVE, ps -> {});
    }
    
        @FunctionalInterface
    private interface SQLConsumer<T> {
        void accept(T t) throws SQLException;
    }
}
