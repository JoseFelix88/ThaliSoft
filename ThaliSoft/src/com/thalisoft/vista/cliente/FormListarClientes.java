package com.thalisoft.vista.cliente;

import com.thalisoft.vista.empleado.*;
import com.thalisoft.controller.index.ControllerContenedor;
import com.thalisoft.main.util.Edicion;
import com.thalisoft.main.util.report.Manager_Report;
import com.thalisoft.model.cliente.ClienteDao;
import com.thalisoft.model.empleado.EmpleadoDao;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JInternalFrame;

public class FormListarClientes extends javax.swing.JInternalFrame {

    Edicion edicion = new Edicion();
    ClienteDao Cdao;
    ClienteDao clienteDao;
    Manager_Report report = new Manager_Report();

    public FormListarClientes() {
        Cdao = new ClienteDao();
        initComponents();
        llenar_listado();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TB_LISTADO_CLIENTES = new javax.swing.JTable();
        jToolBar1 = new javax.swing.JToolBar();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/thalisoft/image/iconos/shift-change.png"))); // NOI18N
        jMenuItem1.setText("MODIFICAR");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        setIconifiable(true);
        setTitle("Lista de Clientes");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 204), 5, true), "CLIENTES REGISTRADOS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 0, 14))); // NOI18N

        TB_LISTADO_CLIENTES.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        TB_LISTADO_CLIENTES.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "No. Ficha", "Identificacion", "Apellidos y Nombres", "Direccion", "Telefonos", "Registrado Por", "Fecha de Registro"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TB_LISTADO_CLIENTES.setComponentPopupMenu(jPopupMenu1);
        TB_LISTADO_CLIENTES.setRowHeight(22);
        TB_LISTADO_CLIENTES.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(TB_LISTADO_CLIENTES);
        if (TB_LISTADO_CLIENTES.getColumnModel().getColumnCount() > 0) {
            TB_LISTADO_CLIENTES.getColumnModel().getColumn(0).setMaxWidth(75);
            TB_LISTADO_CLIENTES.getColumnModel().getColumn(2).setMinWidth(150);
            TB_LISTADO_CLIENTES.getColumnModel().getColumn(3).setMinWidth(200);
        }

        jToolBar1.setRollover(true);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/thalisoft/image/iconos/add-employed.png"))); // NOI18N
        jButton1.setToolTipText("Añadir Cliente");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/thalisoft/image/iconos/printer.png"))); // NOI18N
        jButton2.setToolTipText("Imprimir Listado");
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton2);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/thalisoft/image/iconos/exit.png"))); // NOI18N
        jButton3.setToolTipText("Salir");
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 941, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        JInternalFrame ji = validador.getJInternalFrame(FormEmpleado.class.getName());

        if (ji == null || ji.isClosed()) {
            ji = new FormCliente(this);
            ControllerContenedor.getjDesktopPane1().add(ji, 0);
            validador.addJIframe(FormEmpleado.class.getName(), ji);
            ji.setVisible(true);
        } else {
            ji.show(true);
            try {
                ji.setIcon(false);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(FormEmpleado.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        FormCliente fe = new FormCliente(this);
        JInternalFrame ji = validador.getJInternalFrame(FormEmpleado.class.getName());
        if (ji == null || ji.isClosed()) {
            fe.consulta_cliente(TB_LISTADO_CLIENTES.getValueAt(TB_LISTADO_CLIENTES.getSelectedRow(), 0));
            ji = fe;
            ControllerContenedor.getjDesktopPane1().add(ji, 0);
            validador.addJIframe(FormEmpleado.class.getName(), ji);
            ji.setVisible(true);
        } else {
            ji.show(true);
            try {
                ji.setIcon(false);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(FormEmpleado.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        report.ListadoDeEmpleados();
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TB_LISTADO_CLIENTES;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables

    public void llenar_listado() {
        edicion.llenarTabla(TB_LISTADO_CLIENTES, Cdao.LISTADO_CLIENTES());
    }
}

class validador {

    public static java.util.HashMap<String, javax.swing.JInternalFrame> jIframes = new java.util.HashMap<>();

    public static void addJIframe(String key, javax.swing.JInternalFrame jiframe) {
        jIframes.put(key, jiframe);
    }

    public static javax.swing.JInternalFrame getJInternalFrame(String key) {
        return jIframes.get(key);
    }
}
