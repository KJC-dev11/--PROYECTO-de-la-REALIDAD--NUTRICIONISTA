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
import javax.swing.JOptionPane;
/**
 *
 * @author MOON
 */
public class PacienteData {
    
    private Connection conn = null;
    
    public PacienteData(){
        conn = Conexion.getConexion();
    }
    
public void guardarPaciente(Paciente paciente) {
    String sql = "INSERT INTO pacientes (edad, altura, pesoActual, pesoBuscado, dni, apellido, nombre, activo) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
    try (PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
        ps.setInt(1, paciente.getEdad());
        ps.setDouble(2, paciente.getAltura());
        ps.setDouble(3, paciente.getPesoActual());
        ps.setDouble(4, paciente.getPesoBuscado());
        ps.setInt(5, paciente.getDni());
        ps.setString(6, paciente.getApellido());
        ps.setString(7, paciente.getNombre());
        ps.setBoolean(8, paciente.isActivo());

        System.out.println("Ejecutando consulta: " + ps.toString());

        int rowsAffected = ps.executeUpdate();
        if (rowsAffected == 0) {
            throw new SQLException("No se pudo guardar el paciente, no se insertaron filas.");
        }

        try (ResultSet rs = ps.getGeneratedKeys()) {
            if (rs.next()) {
                paciente.setIdPaciente(rs.getInt(1));
                System.out.println("ID generado: " + rs.getInt(1));
            } else {
                throw new SQLException("No se pudo obtener el ID del paciente.");
            }
        }
    } catch (SQLException ex) {
        System.err.println("Error al guardar el paciente: " + ex.getMessage());
        throw new RuntimeException("Error al guardar el paciente: " + ex.getMessage(), ex);
    }
}
     
       public void actualizarPaciente(Paciente paciente) {
        String sql = "UPDATE pacientes SET edad = ?, altura = ?, pesoActual = ?, pesoBuscado = ?, dni = ?, apellido = ?, nombre = ?, activo = ? WHERE idPaciente = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, paciente.getEdad());
            ps.setDouble(2, paciente.getAltura());
            ps.setDouble(3, paciente.getPesoActual());
            ps.setDouble(4, paciente.getPesoBuscado());
            ps.setInt(5, paciente.getDni());
            ps.setString(6, paciente.getApellido());
            ps.setString(7, paciente.getNombre());
            ps.setBoolean(8, paciente.isActivo());
            ps.setInt(9, paciente.getIdPaciente());

            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
                throw new RuntimeException("Error al actualizar el paciente: " + e.getMessage(), e);
        }
    }
       
public void borrarPaciente(int idPaciente) {
    String sql = "DELETE FROM pacientes WHERE idPaciente = ?";
    try (PreparedStatement ps = conn.prepareStatement(sql)) {
        ps.setInt(1, idPaciente);
        ps.executeUpdate();
    } catch (SQLException e) {
        throw new RuntimeException("Error al borrar el paciente: " + e.getMessage(), e);
    }
}

         public List<Paciente> obtenerTodosLosPacientes() {
        List<Paciente> pacientes = new ArrayList<>();
        String sql = "SELECT * FROM pacientes";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
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

                pacientes.add(paciente);
            }
            ps.close();
        } catch (SQLException e) {
        }
        return pacientes;
    }
         
   public List<Paciente> obtenerPacientes() {
    List<Paciente> pacientes = new ArrayList<>();
    String sql = "SELECT idPaciente, nombre, apellido FROM pacientes";

    try (PreparedStatement ps = conn.prepareStatement(sql);
         ResultSet rs = ps.executeQuery()) {

        while (rs.next()) {
            Paciente paciente = new Paciente();
            paciente.setIdPaciente(rs.getInt("idPaciente"));
            paciente.setNombre(rs.getString("nombre"));
            paciente.setApellido(rs.getString("apellido"));
            pacientes.add(paciente);
        }

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al obtener pacientes: " + e.getMessage());
    }

    return pacientes;
}
   
   public Paciente buscarPacientePorDni(int dni) {
    String sql = "SELECT * FROM pacientes WHERE dni = ?";
    Paciente paciente = null;

    try (PreparedStatement ps = conn.prepareStatement(sql)) {
        ps.setInt(1, dni);
        try (ResultSet rs = ps.executeQuery()) {
            if (rs.next()) {
                paciente = new Paciente();
                paciente.setIdPaciente(rs.getInt("idPaciente"));
                paciente.setEdad(rs.getInt("edad"));
                paciente.setAltura(rs.getDouble("altura"));
                paciente.setPesoActual(rs.getDouble("pesoActual"));
                paciente.setPesoBuscado(rs.getDouble("pesoBuscado"));
                paciente.setDni(rs.getInt("dni"));
                paciente.setApellido(rs.getString("apellido"));
                paciente.setNombre(rs.getString("nombre"));
                paciente.setActivo(rs.getBoolean("activo"));
            }
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al buscar paciente por DNI: " + ex.getMessage());
    }

    return paciente;
}

public List<Paciente> buscarPacientesPorApellido(String apellido) {
    List<Paciente> pacientes = new ArrayList<>();
    String sql = "SELECT * FROM pacientes WHERE apellido LIKE ?";

    try (PreparedStatement ps = conn.prepareStatement(sql)) {
        ps.setString(1, "%" + apellido + "%");
        try (ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
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

                pacientes.add(paciente);
            }
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al buscar pacientes por apellido: " + ex.getMessage());
    }

    return pacientes;
}

public Paciente buscarPacientePorId(int idPaciente) {
    String sql = "SELECT * FROM pacientes WHERE idPaciente = ?";
    try (PreparedStatement ps = conn.prepareStatement(sql)) {
        ps.setInt(1, idPaciente);
        try (ResultSet rs = ps.executeQuery()) {
            if (rs.next()) {
                return mapearPaciente(rs);
            }
        }
    } catch (SQLException ex) {
        throw new RuntimeException("Error al buscar paciente por ID: " + ex.getMessage(), ex);
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

public List<Paciente> obtenerPacientesActivos() {
    List<Paciente> pacientes = new ArrayList<>();
    String sql = "SELECT * FROM pacientes WHERE activo = 1";

    try (PreparedStatement ps = conn.prepareStatement(sql);
         ResultSet rs = ps.executeQuery()) {

        while (rs.next()) {
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

            pacientes.add(paciente);
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al obtener pacientes activos: " + e.getMessage());
    }

    return pacientes;
}

public List<Paciente> obtenerPacientesInactivos() {
    List<Paciente> pacientes = new ArrayList<>();
    String sql = "SELECT * FROM pacientes WHERE activo = 0";

    try (PreparedStatement ps = conn.prepareStatement(sql);
         ResultSet rs = ps.executeQuery()) {

        while (rs.next()) {
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

            pacientes.add(paciente);
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al obtener pacientes inactivos: " + e.getMessage());
    }

    return pacientes;
}

}
