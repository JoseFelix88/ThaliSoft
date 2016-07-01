package com.thalisoft.vista.producto;

import com.thalisoft.main.util.CambiaFormatoTexto;
import com.thalisoft.main.util.Edicion;
import com.thalisoft.main.util.Test_CodigoAleatorio;
import com.thalisoft.main.util.Variables_Gloabales;
import com.thalisoft.model.empleado.EmpleadoDao;
import com.thalisoft.model.producto.Producto;
import com.thalisoft.model.producto.ProductoDao;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class FormProducto extends javax.swing.JInternalFrame {

    EmpleadoDao Edao;
    Edicion edicion = new Edicion();
    Producto producto;
    ProductoDao Pdao;
    Test_CodigoAleatorio codigoAleatorio = new Test_CodigoAleatorio();
    CambiaFormatoTexto formatoTexto = new CambiaFormatoTexto();
    FormListaProductos formListaProductos;

    public FormProducto() {
        Pdao = new ProductoDao();
        initComponents();
        NUEVO_PRODUCTO();
        accionesFormulario();
    }

    FormProducto(FormListaProductos aThis) {
        formListaProductos = aThis;
        Pdao = new ProductoDao();
        initComponents();
        NUEVO_PRODUCTO();
        accionesFormulario();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtnumficha = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtreferencia = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtdescripcion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtstock = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtcosto = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtprecioventa = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtutilidad = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txttalla = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtcolor = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtmaterial = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtsexo = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        txtedad = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtmarca = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtdiseño = new javax.swing.JTextField();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setIconifiable(true);
        setTitle("Producto");

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PRODUCTO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/thalisoft/image/price-tag.png"))); // NOI18N

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("No. de Ficha");

        txtnumficha.setEditable(false);
        txtnumficha.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Referencia*");

        txtreferencia.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Descripción*");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Stock Actual");

        txtstock.setEditable(false);
        txtstock.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtstock.setText("0");

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Costo*");

        txtcosto.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txtcosto.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtcosto.setText("$ 0");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Precio de Venta*");

        txtprecioventa.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txtprecioventa.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtprecioventa.setText("$ 0");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Utilidad");

        txtutilidad.setEditable(false);
        txtutilidad.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txtutilidad.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtutilidad.setText("$ 0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtcosto, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtutilidad, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtprecioventa, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(4, 4, 4))
                    .addComponent(txtprecioventa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtutilidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalle de la Referencia", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Talla");

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Color");

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Material");

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Sexo");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Edad");

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Marca");

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Diseño");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(15, 15, 15)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtcolor)
                            .addComponent(txttalla)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtmaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(txtsexo)))
                .addGap(21, 21, 21)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtmarca, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtedad, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtdiseño, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txttalla, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcolor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(txtmaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(txtsexo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 11, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtedad))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtmarca, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtdiseño, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap())))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtnumficha, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtreferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtdescripcion)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(txtstock, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtnumficha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(txtreferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtdescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtstock)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/thalisoft/image/iconos/add-page.png"))); // NOI18N
        jButton1.setToolTipText("Nuevo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/thalisoft/image/iconos/book.png"))); // NOI18N
        jButton2.setToolTipText("Consultar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/thalisoft/image/iconos/save.png"))); // NOI18N
        jButton3.setToolTipText("Guardar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/thalisoft/image/iconos/shift-change.png"))); // NOI18N
        jButton4.setToolTipText("Modificar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/thalisoft/image/iconos/printer.png"))); // NOI18N

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/thalisoft/image/iconos/exit.png"))); // NOI18N
        jButton5.setToolTipText("Salir");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Archivo", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        NUEVO_PRODUCTO();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Object idproducto = edicion.msjQuest(2, "ingresa la referencia del producto.");
        System.out.println(idproducto);
        if (CONSULTA_PRODUCTO(idproducto) == false) {
            edicion.mensajes(1, "la referencia no esta registrada.");
        } else {
            LOAD_PRODUCT_COMPONET();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int opcion = (int) edicion.msjQuest(1, "estas seguro que desea registrar la referencia?");
        if (opcion == 0) {
            if (validarProducto() != false) {
                if (CONSULTA_PRODUCTO(txtreferencia.getText()) != true) {
                    if (Pdao.EJECUTAR_CRUD(DATOS_PRODUCTO(0)) != false) {
                        formListaProductos.LLENAR_LISTADO_DE_REFERENCIAS();
                        edicion.mensajes(2, "referencia registrado correctamente.");
                    }else{
                        edicion.mensajes(1, "la referencia # "+txtreferencia.getText()+" se encuentra registrada");
                    }
                }
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int opcion = (int) edicion.msjQuest(1, "estas seguro que desea modificar la referencia?");
        if (opcion == 0) {
            if (validarProducto() != false) {
                if (CONSULTA_PRODUCTO(txtnumficha.getText()) != false) {
                    if (Pdao.EJECUTAR_CRUD(DATOS_PRODUCTO(1)) != false) {
                        formListaProductos.LLENAR_LISTADO_DE_REFERENCIAS();
                        edicion.mensajes(2, "producto modificado correctamente.");
                    }
                }
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField txtcolor;
    private javax.swing.JTextField txtcosto;
    private javax.swing.JTextField txtdescripcion;
    private javax.swing.JTextField txtdiseño;
    private javax.swing.JTextField txtedad;
    private javax.swing.JTextField txtmarca;
    private javax.swing.JTextField txtmaterial;
    private javax.swing.JTextField txtnumficha;
    private javax.swing.JTextField txtprecioventa;
    private javax.swing.JTextField txtreferencia;
    private javax.swing.JTextField txtsexo;
    private javax.swing.JTextField txtstock;
    private javax.swing.JTextField txttalla;
    private javax.swing.JTextField txtutilidad;
    // End of variables declaration//GEN-END:variables
    private boolean validarProducto() {
        if (txtreferencia.getText().isEmpty() | txtreferencia.getText() == null) {
            edicion.mensajes(1, "por favor ingresa la referencia del producto.");
            txtreferencia.grabFocus();
            return false;
        }
        if (txtdescripcion.getText().isEmpty() | txtdescripcion.getText() == null) {
            edicion.mensajes(1, "por favor ingresa la descripcion del producto.");
            txtdescripcion.grabFocus();
            return false;
        }
        if (edicion.toNumeroEntero(txtcosto.getText()) < 1) {
            edicion.mensajes(1, "el costo del producto debe ser mayor a cero (0).");
            txtcosto.selectAll();
            txtcosto.requestFocus();
            return false;
        }
        if (edicion.toNumeroEntero(txtprecioventa.getText()) < 1) {
            edicion.mensajes(1, "el precio de venta debe ser mayor a cero (0)");
            txtprecioventa.selectAll();
            txtprecioventa.requestFocus();
            return false;
        }
        return true;
    }

    public void LOAD_PRODUCT_COMPONET() {
        txtnumficha.setText(formatoTexto.numerico(producto.getId_producto()));
        txtreferencia.setText(producto.getId_referencia());
        txtdescripcion.setText(producto.getNom_descripcion());
        txtstock.setText(formatoTexto.numerico(producto.getStrock()));
        txtcosto.setText("$ " + formatoTexto.numerico(producto.getCosto_und()));
        txtprecioventa.setText("$ " + formatoTexto.numerico(producto.getPrecio_venta()));
        txtutilidad.setText("$ " + formatoTexto.numerico(producto.getUtilidad()));
        txttalla.setText(producto.getTalla());
        txtcolor.setText(producto.getColor());
        txtmaterial.setText(producto.getMateria());
        txtsexo.setText(producto.getSexo());
        txtedad.setText(producto.getEdad());
        txtmarca.setText(producto.getMarca());
        txtdiseño.setText(producto.getDiseño());
    }

    public boolean CONSULTA_PRODUCTO(Object key) {
        producto = Pdao.READ_PRODUCTO(key);
        return producto != null;
    }

    private void NUEVO_PRODUCTO() {
        producto = new Producto();
        LOAD_PRODUCT_COMPONET();
        txtnumficha.setText(Pdao.NUMERO_FICHA_PRODUCTO());
        String codreferencia = codigoAleatorio.getCodigoAleatorioNumerico();
        if (CONSULTA_PRODUCTO(codreferencia) != true) {
            txtreferencia.setText(codreferencia);
        }

    }

    private void accionesFormulario() {
        txtprecioventa.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                txtprecioventa.setText("$ " + formatoTexto.numerico(edicion.toNumeroEntero(txtprecioventa.getText())));
                if (CALCULAR_UTILIDAD() > 0) {
                    txtutilidad.setText("$ " + formatoTexto.numerico(CALCULAR_UTILIDAD()));
                } else {
                    txtutilidad.setText("$ 0");
                }
            }
        });
        txtcosto.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                txtcosto.setText("$ " + formatoTexto.numerico(edicion.toNumeroEntero(txtcosto.getText())));
            }
        });
    }

    private Object[] DATOS_PRODUCTO(int opcion) {
        Object[] key = new Object[16];
        producto = Cargar_Producto();
        if (opcion == 0) {
            key[0] = 0;
        }
        if (opcion == 1) {
            key[0] = 1;
        }
        if (opcion == 2) {
            key[0] = 2;
        }
        key[1] = producto.getId_producto();
        key[2] = "'" + producto.getId_referencia() + "'";
        key[3] = "'" + producto.getNom_descripcion().toUpperCase() + "'";
        key[4] = producto.getStrock();
        key[5] = producto.getCosto_und();
        key[6] = producto.getPrecio_venta();
        key[7] = producto.getUtilidad();
        key[8] = "'" + producto.getTalla() + "'";
        key[9] = "'" + producto.getColor() + "'";
        key[10] = "'" + producto.getMateria() + "'";
        key[11] = "'" + producto.getSexo() + "'";
        key[12] = "'" + producto.getEdad() + "'";
        key[13] = "'" + producto.getMarca() + "'";
        key[14] = "'" + producto.getDiseño() + "'";
        key[15] = "'" + producto.getEmpleado().getIdentificacion() + "'";
        return key;
    }

    private Producto Cargar_Producto() {
        producto = new Producto();
        producto.setId_producto(edicion.toNumeroEntero(txtnumficha.getText()));
        producto.setId_referencia(txtreferencia.getText());
        producto.setNom_descripcion(txtdescripcion.getText());
        producto.setStrock(edicion.toNumeroEntero(txtstock.getText()));
        producto.setCosto_und(edicion.toNumeroEntero(txtcosto.getText()));
        producto.setPrecio_venta(edicion.toNumeroEntero(txtprecioventa.getText()));
        producto.setUtilidad(edicion.toNumeroEntero(txtutilidad.getText()));
        producto.setTalla(txttalla.getText());
        producto.setColor(txtcolor.getText());
        producto.setMateria(txtmaterial.getText());
        producto.setSexo(txtsexo.getText());
        producto.setEdad(txtedad.getText());
        producto.setMarca(txtmarca.getText());
        producto.setDiseño(txtdiseño.getText());
        producto.setEmpleado(Variables_Gloabales.EMPLEADO);
        return producto;
    }

    private int CALCULAR_UTILIDAD() {
        int UTILIDAD = 0;
        if (validarProducto() != false) {
            producto = Cargar_Producto();
            UTILIDAD = producto.getPrecio_venta() - producto.getCosto_und();
        }
        return UTILIDAD;
    }
}
