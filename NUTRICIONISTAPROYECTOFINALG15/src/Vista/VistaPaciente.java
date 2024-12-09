/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
 * @author FrancoPC
 */
public class VistaPaciente extends javax.swing.JPanel {
    
    private PacienteData pacienteData;
    private DefaultTableModel modelo;
    private ArrayList<Modelo.Paciente> listaPacientes;

    /**
     * Creates new form Paciente
     */
    public VistaPaciente() {
        initComponents();
        pacienteData = new PacienteData();
        modelo = new DefaultTableModel();
        listaPacientes = (ArrayList<Modelo.Paciente>) pacienteData.obtenerTodosLosPacientes();
        configurarTabla();
        cargarPacientes(true);
        agregarOyentes();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jbGuardar = new javax.swing.JButton();
        jbNuevo = new javax.swing.JButton();
        jbBorrar = new javax.swing.JButton();
        jbEditar = new javax.swing.JButton();
        jbBuscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jtfNombre = new javax.swing.JTextField();
        jtfApellido = new javax.swing.JTextField();
        jtfEdad = new javax.swing.JTextField();
        jtfDNI = new javax.swing.JTextField();
        jtfAltura = new javax.swing.JTextField();
        jtfPesoA = new javax.swing.JTextField();
        jtfPesoO = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtPacientes = new javax.swing.JTable();
        jrbEstado = new javax.swing.JRadioButton();

        setMaximumSize(new java.awt.Dimension(750, 430));
        setMinimumSize(new java.awt.Dimension(750, 430));
        setPreferredSize(new java.awt.Dimension(750, 430));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(750, 430));
        jPanel1.setMinimumSize(new java.awt.Dimension(750, 430));
        jPanel1.setPreferredSize(new java.awt.Dimension(750, 430));

        jbGuardar.setBackground(new java.awt.Color(51, 153, 0));
        jbGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar.png"))); // NOI18N
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbNuevo.setBackground(new java.awt.Color(51, 153, 0));
        jbNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nuevo.png"))); // NOI18N
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });

        jbBorrar.setBackground(new java.awt.Color(51, 153, 0));
        jbBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/tacho.png"))); // NOI18N
        jbBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBorrarActionPerformed(evt);
            }
        });

        jbEditar.setBackground(new java.awt.Color(51, 153, 0));
        jbEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/editar.png"))); // NOI18N
        jbEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditarActionPerformed(evt);
            }
        });

        jbBuscar.setBackground(new java.awt.Color(51, 153, 0));
        jbBuscar.setForeground(new java.awt.Color(0, 0, 0));
        jbBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lupa.png"))); // NOI18N
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Century Gothic", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("PACIENTE");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Apellido:");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Edad:");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("D.N.I:");

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Altura (cm):");

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Peso Actual (kg):");

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Peso Objetivo (kg):");

        jtfNombre.setBackground(new java.awt.Color(255, 255, 255));
        jtfNombre.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jtfNombre.setForeground(new java.awt.Color(0, 0, 0));

        jtfApellido.setBackground(new java.awt.Color(255, 255, 255));
        jtfApellido.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jtfApellido.setForeground(new java.awt.Color(0, 0, 0));

        jtfEdad.setBackground(new java.awt.Color(255, 255, 255));
        jtfEdad.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jtfEdad.setForeground(new java.awt.Color(0, 0, 0));

        jtfDNI.setBackground(new java.awt.Color(255, 255, 255));
        jtfDNI.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jtfDNI.setForeground(new java.awt.Color(0, 0, 0));

        jtfAltura.setBackground(new java.awt.Color(255, 255, 255));
        jtfAltura.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jtfAltura.setForeground(new java.awt.Color(0, 0, 0));

        jtfPesoA.setBackground(new java.awt.Color(255, 255, 255));
        jtfPesoA.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jtfPesoA.setForeground(new java.awt.Color(0, 0, 0));

        jtfPesoO.setBackground(new java.awt.Color(255, 255, 255));
        jtfPesoO.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jtfPesoO.setForeground(new java.awt.Color(0, 0, 0));
        jtfPesoO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfPesoOActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Estado:");

        jtPacientes.setBackground(new java.awt.Color(255, 255, 255));
        jtPacientes.setFont(new java.awt.Font("Century Gothic", 2, 12)); // NOI18N
        jtPacientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Apellido", "D.N.I.", "Estado", "Edad", "Altura", "PesoActual", "PesoBuscado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtPacientes);

        jrbEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbEstadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jrbEstado)
                                    .addComponent(jtfPesoA, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtfPesoO, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtfAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtfDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jtfApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jtfEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addComponent(jbBuscar))))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(289, 289, 289)
                        .addComponent(jLabel1)))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbNuevo)
                    .addComponent(jbGuardar)
                    .addComponent(jbEditar)
                    .addComponent(jbBorrar))
                .addContainerGap(239, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jtfApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(jtfEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jbNuevo)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jtfDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jtfAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jtfPesoA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jtfPesoO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jrbEstado))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jbGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbEditar)
                        .addGap(18, 18, 18)
                        .addComponent(jbBorrar)
                        .addContainerGap(75, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        buscarPaciente();
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarActionPerformed
        actualizarPaciente();
    }//GEN-LAST:event_jbEditarActionPerformed

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        guardarPaciente();
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBorrarActionPerformed
        // TODO add your handling code here:
        eliminarPaciente();
    }//GEN-LAST:event_jbBorrarActionPerformed

    private void jrbEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbEstadoActionPerformed
        cambiarEstadoPaciente();
    }//GEN-LAST:event_jrbEstadoActionPerformed

    private void jtfPesoOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfPesoOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfPesoOActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbBorrar;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbEditar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JRadioButton jrbEstado;
    private javax.swing.JTable jtPacientes;
    private javax.swing.JTextField jtfAltura;
    private javax.swing.JTextField jtfApellido;
    private javax.swing.JTextField jtfDNI;
    private javax.swing.JTextField jtfEdad;
    private javax.swing.JTextField jtfNombre;
    private javax.swing.JTextField jtfPesoA;
    private javax.swing.JTextField jtfPesoO;
    // End of variables declaration//GEN-END:variables

private void configurarTabla() {
    modelo.addColumn("ID");
    modelo.addColumn("Nombre");
    modelo.addColumn("Apellido");
    modelo.addColumn("DNI");
    modelo.addColumn("Estado");
    modelo.addColumn("Edad");
    modelo.addColumn("Altura");
    modelo.addColumn("Peso Actual");
    modelo.addColumn("Peso Buscado");
    jtPacientes.setModel(modelo);
}

private void agregarOyentes() {
    jtfAltura.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusLost(java.awt.event.FocusEvent evt) {
            calcularPesoIdeal();
        }
    });
    jtfPesoA.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusLost(java.awt.event.FocusEvent evt) {
            calcularPesoIdeal();
        }
    });
}

    
private void mostrarMensaje(String mensaje, String titulo, int tipoMensaje) {
    JOptionPane.showMessageDialog(this, mensaje, titulo, tipoMensaje);
}
    
private boolean camposCompletos() {
    return !jtfNombre.getText().isEmpty() &&
           !jtfApellido.getText().isEmpty() &&
           !jtfEdad.getText().isEmpty() &&
           !jtfDNI.getText().isEmpty() &&
           !jtfAltura.getText().isEmpty() &&
           !jtfPesoA.getText().isEmpty() &&
           !jtfPesoO.getText().isEmpty();
}
    
private void actualizarFilaPaciente(Paciente paciente, int fila) {
    modelo.setValueAt(paciente.getIdPaciente(), fila, 0);
    modelo.setValueAt(paciente.getNombre(), fila, 1);
    modelo.setValueAt(paciente.getApellido(), fila, 2);
    modelo.setValueAt(paciente.getDni(), fila, 3);
    modelo.setValueAt(paciente.isActivo() ? "Activo" : "Inactivo", fila, 4);
    modelo.setValueAt(paciente.getEdad(), fila, 5);
    modelo.setValueAt(paciente.getAltura(), fila, 6);
    modelo.setValueAt(paciente.getPesoActual(), fila, 7);
    modelo.setValueAt(paciente.getPesoBuscado(), fila, 8);
}

    
private void actualizarTabla(List<Paciente> pacientes) {
    DefaultTableModel modelo = (DefaultTableModel) jtPacientes.getModel();
    modelo.setRowCount(0);

    for (Paciente paciente : pacientes) {
        modelo.addRow(new Object[]{
            paciente.getIdPaciente(),
            paciente.getNombre(),
            paciente.getApellido(),
            paciente.getDni(),
            paciente.isActivo() ? "Activo" : "Inactivo",
            paciente.getEdad(),
            paciente.getAltura(),
            paciente.getPesoActual(),
            paciente.getPesoBuscado()
        });
    }
}

    
private void cargarPacientes(boolean mostrarActivos) {
    List<Paciente> pacientes = mostrarActivos
        ? pacienteData.obtenerPacientesActivos()
        : pacienteData.obtenerTodosLosPacientes();
    actualizarTabla(pacientes);
}

private void limpiarCampos() {
    jtfNombre.setText("");
    jtfApellido.setText("");
    jtfEdad.setText("");
    jtfDNI.setText("");
    jtfAltura.setText("");
    jtfPesoA.setText("");
    jtfPesoO.setText("");
    jrbEstado.setSelected(false);
}

private void guardarPaciente() {
    if (!camposCompletos()) {
        mostrarMensaje("Todos los campos son obligatorios.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    try {
        String nombre = jtfNombre.getText();
        String apellido = jtfApellido.getText();
        int edad = Integer.parseInt(jtfEdad.getText());
        int dni = Integer.parseInt(jtfDNI.getText());
        double altura = Double.parseDouble(jtfAltura.getText());
        double pesoActual = Double.parseDouble(jtfPesoA.getText());
        double pesoBuscado = Double.parseDouble(jtfPesoO.getText());
        boolean activo = jrbEstado.isSelected();

        Paciente paciente = new Paciente(edad, altura, pesoActual, pesoBuscado, dni, apellido, nombre, activo);
        pacienteData.guardarPaciente(paciente);
        cargarPacientes(true);
        limpiarCampos();
        mostrarMensaje("Paciente guardado exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
    } catch (NumberFormatException ex) {
        mostrarMensaje("Verifica que los datos ingresados sean correctos.", "Error", JOptionPane.ERROR_MESSAGE);
    }
}
    
private void actualizarPaciente() {
    int fila = jtPacientes.getSelectedRow();

    if (fila == -1) {
        mostrarMensaje("Seleccione un paciente para editar.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        return;
    }

    if (!camposCompletos()) {
        mostrarMensaje("Todos los campos son obligatorios.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    try {
        int id = (int) modelo.getValueAt(fila, 0);
        String nombre = jtfNombre.getText();
        String apellido = jtfApellido.getText();
        int edad = Integer.parseInt(jtfEdad.getText());
        int dni = Integer.parseInt(jtfDNI.getText());
        double altura = Double.parseDouble(jtfAltura.getText());
        double pesoActual = Double.parseDouble(jtfPesoA.getText());
        double pesoBuscado = Double.parseDouble(jtfPesoO.getText());
        boolean nuevoEstado = jrbEstado.isSelected();

        Paciente pacienteActualizado = new Paciente(id, edad, altura, pesoActual, pesoBuscado, dni, apellido, nombre, nuevoEstado);
        pacienteData.actualizarPaciente(pacienteActualizado);
        actualizarFilaPaciente(pacienteActualizado, fila);
        mostrarMensaje("Paciente actualizado correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
    } catch (NumberFormatException e) {
        mostrarMensaje("Error en los datos ingresados. Verifica los valores numéricos.", "Error", JOptionPane.ERROR_MESSAGE);
    }
}

private void buscarPaciente() {
    String dniTexto = jtfDNI.getText().trim();
    String apellido = jtfApellido.getText().trim();

    if (dniTexto.isEmpty() && apellido.isEmpty()) {
        mostrarMensaje("Debe ingresar un DNI o un apellido para buscar.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        return;
    }

    List<Paciente> resultados = new ArrayList<>();

    if (!dniTexto.isEmpty()) {
        try {
            int dni = Integer.parseInt(dniTexto);
            Paciente paciente = pacienteData.buscarPacientePorDni(dni);
            if (paciente != null) {
                resultados.add(paciente);
            }
        } catch (NumberFormatException e) {
            mostrarMensaje("El DNI debe ser un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
    }

    if (!apellido.isEmpty()) {
        resultados.addAll(pacienteData.buscarPacientesPorApellido(apellido));
    }

    if (resultados.isEmpty()) {
        mostrarMensaje("No se encontraron pacientes con los datos ingresados.", "Sin resultados", JOptionPane.INFORMATION_MESSAGE);
        actualizarTabla(new ArrayList<>()); 
    } else if (resultados.size() == 1) {
        Paciente paciente = resultados.get(0);
        llenarCamposConPaciente(paciente);
        actualizarTabla(resultados);
    } else {
        mostrarMensaje("Se encontraron varios pacientes. Por favor, refine su búsqueda.", "Resultados múltiples", JOptionPane.INFORMATION_MESSAGE);
        actualizarTabla(resultados);
    }
}


 
 private void llenarCamposConPaciente(Paciente paciente) {
    jtfDNI.setText(String.valueOf(paciente.getDni()));
    jtfApellido.setText(paciente.getApellido());
    jtfNombre.setText(paciente.getNombre());
    jtfEdad.setText(String.valueOf(paciente.getEdad()));
    jtfAltura.setText(String.valueOf(paciente.getAltura()));
    jtfPesoA.setText(String.valueOf(paciente.getPesoActual()));
    jtfPesoO.setText(String.valueOf(paciente.getPesoBuscado()));
    jrbEstado.setSelected(paciente.isActivo());
}
  
private void eliminarPaciente() {
    int fila = jtPacientes.getSelectedRow();

    if (fila == -1) {
        JOptionPane.showMessageDialog(this, "Seleccione un paciente para dar de baja.");
        return;
    }

    int id = (int) modelo.getValueAt(fila, 0); 

    Modelo.Paciente paciente = pacienteData.buscarPacientePorId(id);
    if (paciente != null) {
        paciente.setActivo(false);
        pacienteData.actualizarPaciente(paciente);
        cargarPacientes(true);
        JOptionPane.showMessageDialog(this, "Paciente dado de baja correctamente.");
    } else {
        JOptionPane.showMessageDialog(this, "Error al obtener el paciente.");
    }
}
        
private void cambiarEstadoPaciente() {
    int fila = jtPacientes.getSelectedRow();

    if (fila == -1) {
        JOptionPane.showMessageDialog(this, "Seleccione un paciente para cambiar su estado.");
        return;
    }

    int id = (int) modelo.getValueAt(fila, 0);
    boolean estadoActual = modelo.getValueAt(fila, 4).equals("Activo");

    boolean nuevoEstado = !estadoActual;

    Modelo.Paciente paciente = pacienteData.buscarPacientePorId(id);

    if (paciente != null) {
        paciente.setActivo(nuevoEstado);
        pacienteData.actualizarPaciente(paciente);
        cargarPacientes(true);
        JOptionPane.showMessageDialog(this, "Estado del paciente actualizado a " + (nuevoEstado ? "Activo" : "Inactivo") + ".");
    } else {
        JOptionPane.showMessageDialog(this, "Error al obtener el paciente.");
    }
}

private void calcularPesoIdeal() {
    try {
        double altura = Double.parseDouble(jtfAltura.getText().trim());
        double pesoActual = Double.parseDouble(jtfPesoA.getText().trim());

        if (altura > 0) {
            double pesoIdeal = altura * altura * 22; // IMC promedio saludable (22)
            jtfPesoO.setText(String.format("%.2f", pesoIdeal));
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, 
            "Por favor ingrese valores válidos en Altura y Peso Actual.", 
            "Error", 
            JOptionPane.ERROR_MESSAGE);
        jtfPesoO.setText("");
    }
}


}
