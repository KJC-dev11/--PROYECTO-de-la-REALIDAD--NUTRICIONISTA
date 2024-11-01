/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vista;

import Modelo.Paciente;
import Persistencia.PacienteData;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MOON
 */
public class NewJInternalFrameAltaPaciente extends javax.swing.JInternalFrame {
    
    private PacienteData pacienteData;
    private DefaultTableModel modelo;
    private ArrayList<Paciente> listaPacientes;

    /**
     * Creates new form NewJInternalFrameAltaPaciente
     */
    public NewJInternalFrameAltaPaciente() {
        initComponents();
        pacienteData = new PacienteData();
        modelo = new DefaultTableModel();
        listaPacientes = (ArrayList<Paciente>) pacienteData.obtenerTodosLosPacientes();
        configurarTabla();
        cargarPacientes();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButtonActualizar = new javax.swing.JButton();
        txtApellido = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        txtAltura = new javax.swing.JTextField();
        txtPesoBuscado = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jButtonGuardar = new javax.swing.JButton();
        Borrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPacientes = new javax.swing.JTable();
        jRBEstado = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        txtPesoActual = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        jButtonNuevo = new javax.swing.JButton();
        jBuscar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jLabel1.setText("Apellido");

        jLabel2.setText("Edad: ");

        jLabel3.setText("Altura (cm)");

        jLabel4.setText("Peso Buscado (kg):");

        jButtonActualizar.setBackground(new java.awt.Color(102, 102, 102));
        jButtonActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/editar.png"))); // NOI18N
        jButtonActualizar.setText("Actualizar");
        jButtonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualizarActionPerformed(evt);
            }
        });

        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/paciente.png"))); // NOI18N
        jLabel5.setText("PACIENTE");

        jButtonGuardar.setBackground(new java.awt.Color(102, 102, 102));
        jButtonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar.png"))); // NOI18N
        jButtonGuardar.setText("Guardar");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });

        Borrar.setBackground(new java.awt.Color(102, 102, 102));
        Borrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/tacho.png"))); // NOI18N
        Borrar.setText("Borrar");
        Borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarActionPerformed(evt);
            }
        });

        tblPacientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Apellido", "DNI"
            }
        ));
        jScrollPane1.setViewportView(tblPacientes);

        jRBEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBEstadoActionPerformed(evt);
            }
        });

        jLabel6.setText("ESTADO");

        jLabel7.setText("Peso Actual (kg):");

        jLabel8.setText("Nombre: ");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        jLabel9.setText("DNI");

        jButtonNuevo.setBackground(new java.awt.Color(102, 102, 102));
        jButtonNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nuevo.png"))); // NOI18N
        jButtonNuevo.setText("Nuevo");
        jButtonNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNuevoActionPerformed(evt);
            }
        });

        jBuscar.setBackground(new java.awt.Color(102, 102, 102));
        jBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/persona buscar.png"))); // NOI18N
        jBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 715, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(275, 275, 275))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonNuevo)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonGuardar)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonActualizar)
                        .addGap(18, 18, 18)
                        .addComponent(Borrar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtPesoBuscado, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRBEstado)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel3))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtPesoActual, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel9))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtEdad)
                                                .addGap(48, 48, 48)))
                                        .addComponent(jBuscar))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE)
                                            .addComponent(txtApellido))
                                        .addGap(0, 0, Short.MAX_VALUE)))))))
                .addGap(65, 65, 65))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txtPesoActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtPesoBuscado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jRBEstado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonActualizar)
                    .addComponent(jButtonGuardar)
                    .addComponent(Borrar)
                    .addComponent(jButtonNuevo))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizarActionPerformed
        // TODO add your handling code here:
        actualizarPaciente();
    }//GEN-LAST:event_jButtonActualizarActionPerformed

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void jButtonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNuevoActionPerformed
        // TODO add your handling code here:
        limpiarCampos();
    }//GEN-LAST:event_jButtonNuevoActionPerformed

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        // TODO add your handling code here:
        guardarPaciente();
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void BorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarActionPerformed
        // TODO add your handling code here:
        eliminarPaciente();
    }//GEN-LAST:event_BorrarActionPerformed

    private void jRBEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBEstadoActionPerformed
        // TODO add your handling code here:
        cambiarEstadoPaciente();
    }//GEN-LAST:event_jRBEstadoActionPerformed

    private void jBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuscarActionPerformed
        // TODO add your handling code here:
        buscarPaciente();
    }//GEN-LAST:event_jBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Borrar;
    private javax.swing.JButton jBuscar;
    private javax.swing.JButton jButtonActualizar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRBEstado;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tblPacientes;
    private javax.swing.JTextField txtAltura;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPesoActual;
    private javax.swing.JTextField txtPesoBuscado;
    // End of variables declaration//GEN-END:variables

    private void cargarPacientes() {
        modelo.setRowCount(0);
        for (Paciente paciente : listaPacientes) {
            modelo.addRow(new Object[]{
                paciente.getIdPaciente(), 
                paciente.getDni(), 
                paciente.getApellido(), 
                paciente.getNombre(), 
                paciente.isActivo() ? "Activo" : "Inactivo"
            });
        }
    }
    
        private void limpiarCampos() {
        txtNombre.setText("");
        txtApellido.setText("");
        txtEdad.setText("");
        txtDni.setText("");
        txtAltura.setText("");
        txtPesoActual.setText("");
        txtPesoBuscado.setText("");
        jRBEstado.setSelected(false);
    }
        
            private void guardarPaciente() {
    try {
        String nombre = txtNombre.getText();
        String apellido = txtApellido.getText();
        int edad = Integer.parseInt(txtEdad.getText());
        int dni = Integer.parseInt(txtDni.getText());
        double altura = Double.parseDouble(txtAltura.getText());
        double pesoActual = Double.parseDouble(txtPesoActual.getText());
        double pesoBuscado = Double.parseDouble(txtPesoBuscado.getText());
        boolean activo = jRBEstado.isSelected();

        Paciente paciente = new Paciente(edad, altura, pesoActual, pesoBuscado, dni, apellido, nombre, activo);
        pacienteData.guardarPaciente(paciente);
        listaPacientes.add(paciente);
        cargarPacientes();
        
        JOptionPane.showMessageDialog(this, "Paciente guardado exitosamente.");
        limpiarCampos();
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Error en los datos ingresados. Verifica los valores numéricos.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }
            
             private void actualizarPaciente() {
     int fila = tblPacientes.getSelectedRow();
    if (fila == -1) {
        JOptionPane.showMessageDialog(this, "Seleccione un paciente para actualizar.");
        return;
    }
    try {
        int id = (int) modelo.getValueAt(fila, 0);
        String nombre = txtNombre.getText();
        String apellido = txtApellido.getText();
        int edad = Integer.parseInt(txtEdad.getText());
        int dni = Integer.parseInt(txtDni.getText());
        double altura = Double.parseDouble(txtAltura.getText());
        double pesoActual = Double.parseDouble(txtPesoActual.getText());
        double pesoBuscado = Double.parseDouble(txtPesoBuscado.getText());
        boolean activo = jRBEstado.isSelected();
        Paciente paciente = new Paciente(id, edad, altura, pesoActual, pesoBuscado, dni, apellido, nombre, activo);
        pacienteData.actualizarPaciente(paciente);
        listaPacientes.set(fila, paciente);
        cargarPacientes();
        
        JOptionPane.showMessageDialog(this, "Paciente actualizado exitosamente.");
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Error en los datos ingresados. Verifica los valores numéricos.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }
             
              private void eliminarPaciente() {
  int fila = tblPacientes.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione un paciente para eliminar.");
            return;
        }
        int id = (int) modelo.getValueAt(fila, 0);
        pacienteData.borrarPaciente(id);
        listaPacientes.remove(fila); // Actualiza la lista
        cargarPacientes();
        JOptionPane.showMessageDialog(this, "Paciente eliminado correctamente.");
    }

    private void configurarTabla() {
        modelo.addColumn("ID");
        modelo.addColumn("DNI");
        modelo.addColumn("Apellido");
        modelo.addColumn("Nombre");
        modelo.addColumn("Estado");
        tblPacientes.setModel(modelo);
    }
    
    private void actualizarTabla(List<Paciente> pacientes) {
   modelo.setRowCount(0);
    for (Paciente paciente : pacientes) {
        modelo.addRow(new Object[]{
            paciente.getIdPaciente(),
            paciente.getNombre(),
            paciente.getApellido(),
            paciente.getDni(),
            paciente.getEdad(),
            paciente.getAltura(),
            paciente.getPesoActual(),
            paciente.getPesoBuscado(),
            paciente.isActivo() ? "Activo" : "Inactivo"
        });
    }
}

    private void buscarPaciente() {
    String dniTexto = txtDni.getText().trim();
    String apellido = txtApellido.getText().trim();
    
    List<Paciente> resultados = new ArrayList<>();

    if (!dniTexto.isEmpty()) {
        try {
            int dni = Integer.parseInt(dniTexto);
            Paciente paciente = pacienteData.buscarPacientePorDni(dni);
            if (paciente != null) {
                resultados.add(paciente);
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró ningún paciente con ese DNI.", "Sin resultados", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El DNI debe ser un número.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
    } else if (!apellido.isEmpty()) {
        resultados = pacienteData.buscarPacientesPorApellido(apellido);
        if (resultados.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No se encontraron pacientes con ese apellido.", "Sin resultados", JOptionPane.INFORMATION_MESSAGE);
        }
    } else {
        JOptionPane.showMessageDialog(this, "Ingrese un DNI o Apellido para buscar.", "Error", JOptionPane.WARNING_MESSAGE);
        return;
    }

    if (!resultados.isEmpty()) {
        actualizarTabla(resultados);
    }
}
    private void cambiarEstadoPaciente() {
    int fila = tblPacientes.getSelectedRow();
    if (fila == -1) {
        JOptionPane.showMessageDialog(this, "Seleccione un paciente para cambiar su estado.");
        return;
    }

    int id = (int) modelo.getValueAt(fila, 0);
    boolean estadoActual = modelo.getValueAt(fila, 8).equals("Activo");

    boolean nuevoEstado = !estadoActual;
    
    Paciente paciente = pacienteData.buscarPacientePorId(id);
    if (paciente != null) {
        paciente.setActivo(nuevoEstado);
        pacienteData.actualizarPaciente(paciente);
        cargarPacientes();
        JOptionPane.showMessageDialog(this, "Estado del paciente actualizado a " + (nuevoEstado ? "Activo" : "Inactivo") + ".");
    } else {
        JOptionPane.showMessageDialog(this, "Error al obtener el paciente.");
    }
}


}
