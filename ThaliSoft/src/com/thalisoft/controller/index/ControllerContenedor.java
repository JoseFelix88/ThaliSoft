package com.thalisoft.controller.index;

import static com.thalisoft.main.util.Metodos.Obtener_Estado_Formulario;
import com.thalisoft.main.util.Variables_Gloabales;
import com.thalisoft.vista.cliente.FormCliente;
import com.thalisoft.vista.cliente.FormListarClientes;
import com.thalisoft.vista.empleado.FormEmpleado;
import com.thalisoft.vista.empleado.FormListarEmpleados;
import com.thalisoft.vista.index.Contenedor;
import com.thalisoft.vista.producto.FormListaProductos;
import com.thalisoft.vista.proveedor.FormListarProveedor;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDesktopPane;
import javax.swing.SwingWorker;

public class ControllerContenedor extends SwingWorker<Object, Object> {

    private static Contenedor contenedor;

    public static Contenedor getContenedor() {
        return contenedor;
    }
    /*FormProducto formListaProductos;
     FormAsignarCUM formAsignarCUM;
     FormListarPlu formListarPlu;
     FormFacturaCompra formFacturaCompra;
     Formlotealmacenado formlotealmacenado;
     FormSalidasProducto formSalidasProducto;
     FormDevolucionPunto formDevolucionPunto;
     FormSalidasAutorizada formSalidasAutorizada;
     Formconsultacompraproducto formconsultacompraproducto;
     FormConsultaSalidaProducto formConsultaSalidaProducto;
     FormConteoFisicoBodega formConteoFisicoBodega;
     FormConsumoSaldoPunto formConsumoSaldoPunto;
     FormInventarioPuntoEntrega formInventarioPuntoEntrega;
     FormInventarioBodega formInventarioBodega;
     FormPedidoPuntoEntrega formPedidoPuntoEntrega;
     FormConsumoSaldoGeneral formConsumoSaldoGeneral;
     FormOrdenCompra formOrdenCompra;*/

    FormEmpleado formEmpleado;
    FormListarEmpleados formListarEmpleados;
    FormCliente formCliente;
    FormListarClientes formListarClientes;
    FormListaProductos formListaProductos;
    FormListarProveedor formListarProveedor;

    private static JDesktopPane jDesktopPane1;

    public ControllerContenedor() {
    }

    public Contenedor Go() {

        if (contenedor == null) {

            contenedor = new Contenedor();
            contenedor.setVisible(true);
            Obtener_Eventos_De_SubMenu(contenedor.R_Producto);
            Obtener_Eventos_De_SubMenu(contenedor.JM_OrdenCompra);
            Obtener_Eventos_De_SubMenu(contenedor.R_compra);
            Obtener_Eventos_De_SubMenu(contenedor.R_Salida);
            Obtener_Eventos_De_SubMenu(contenedor.JM_conteofisico);
            Obtener_Eventos_De_SubMenu(contenedor.JMReporte);
            Obtener_Eventos_De_SubMenu(contenedor.JMReporteInOut);
            Obtener_Eventos_De_SubMenu(contenedor.JMReporteInvFisico);
            Obtener_Eventos_De_SubMenu(contenedor.JM_Lotes);
            Obtener_Eventos_De_SubMenu(contenedor.JM_DevolucionPunto);
            Obtener_Eventos_De_SubMenu(contenedor.JM_SalidaAutorizada);
            Obtener_Eventos_De_SubMenu(contenedor.JM_CompraProducto);
            Obtener_Eventos_De_SubMenu(contenedor.JM_despachoproducto);
            Obtener_Eventos_De_SubMenu(contenedor.JM_conteofisico);
            Obtener_Eventos_De_SubMenu(contenedor.JM_consumosaldopunto);
            Obtener_Eventos_De_SubMenu(contenedor.JM_inventariopunto);
            Obtener_Eventos_De_SubMenu(contenedor.JM_inventariobodega);
            Obtener_Eventos_De_SubMenu(contenedor.JM_pedidoPunto);
            Obtener_Eventos_De_SubMenu(contenedor.JM_ConsumoSaldoGeneral);
            Obtener_Eventos_De_SubMenu(contenedor.JM_OrdenCompra);
            Obtener_Eventos_De_SubMenu(contenedor.JM_Empleado);
            Obtener_Eventos_De_SubMenu(contenedor.JM_Clientes);
            Obtener_Eventos_De_SubMenu(contenedor.JM_Producto);
            Obtener_Eventos_De_SubMenu(contenedor.JM_Proveedor);
            contenedor.JM_Profile.setText(Variables_Gloabales.EMPLEADO.getNombres() + " "
                    + "" + Variables_Gloabales.EMPLEADO.getApellidos());
        } else {
            contenedor.setVisible(true);
        }
        return contenedor;
    }

    private void Obtener_Eventos_De_SubMenu(javax.swing.JMenuItem SubMenu) {
        SubMenu.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evento) {
                try {
                    Obtener_Resultado_Click(evento);
                } catch (PropertyVetoException ex) {
                    Logger.getLogger(ControllerContenedor.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        );
    }

    private void Obtener_Resultado_Click(java.awt.event.ActionEvent evt) throws PropertyVetoException {
        switch (evt.getActionCommand()) {

            case "EMPLEADO":
                if (Obtener_Estado_Formulario(this.formListarEmpleados, Contenedor.Panel_Contenedor)) {

                    formListarEmpleados = new FormListarEmpleados();
                    formListarEmpleados.show();
                    Contenedor.Panel_Contenedor.add(formListarEmpleados);
                    java.awt.Dimension Tamaño_Panel = Contenedor.Panel_Contenedor.getSize();
                    java.awt.Dimension Tamaño_InternalFrame = formListarEmpleados.getSize();
                    formListarEmpleados.setLocation((Tamaño_Panel.width - Tamaño_InternalFrame.width) / 2,
                            (Tamaño_Panel.height - Tamaño_InternalFrame.height) / 2);
                } else {
                    formListarEmpleados.setIcon(false);
                }

                break;

            case "CLIENTES":
                if (Obtener_Estado_Formulario(this.formListarClientes, Contenedor.Panel_Contenedor)) {

                    formListarClientes = new FormListarClientes();

                    formListarClientes.show();
                    Contenedor.Panel_Contenedor.add(formListarClientes);
                    java.awt.Dimension Tamaño_Panel = Contenedor.Panel_Contenedor.getSize();
                    java.awt.Dimension Tamaño_InternalFrame = formListarClientes.getSize();
                    formListarClientes.setLocation((Tamaño_Panel.width - Tamaño_InternalFrame.width) / 2,
                            (Tamaño_Panel.height - Tamaño_InternalFrame.height) / 2);
                } else {
                    formListarClientes.setIcon(false);
                }
                break;

            case "PRODUCTOS":

                if (Obtener_Estado_Formulario(this.formListaProductos, Contenedor.Panel_Contenedor)) {
                    formListaProductos = new FormListaProductos();
                    formListaProductos.show();
                    Contenedor.Panel_Contenedor.add(formListaProductos);
                    java.awt.Dimension Tamaño_Panel = Contenedor.Panel_Contenedor.getSize();
                    java.awt.Dimension Tamaño_InternalFrame = formListaProductos.getSize();
                    formListaProductos.setLocation((Tamaño_Panel.width - Tamaño_InternalFrame.width) / 2,
                            (Tamaño_Panel.height - Tamaño_InternalFrame.height) / 2);
                } else {
                    formListaProductos.setIcon(false);
                }

                break;

            case "PROVEEDORES":

                if (Obtener_Estado_Formulario(this.formListarProveedor, Contenedor.Panel_Contenedor)) {
                    formListarProveedor = new FormListarProveedor();
                    formListarProveedor.show();
                    Contenedor.Panel_Contenedor.add(formListarProveedor);
                    java.awt.Dimension Tamaño_Panel = Contenedor.Panel_Contenedor.getSize();
                    java.awt.Dimension Tamaño_InternalFrame = formListarProveedor.getSize();
                    formListarProveedor.setLocation((Tamaño_Panel.width - Tamaño_InternalFrame.width) / 2,
                            (Tamaño_Panel.height - Tamaño_InternalFrame.height) / 2);
                } else {
                    formListarProveedor.setIcon(false);
                }

                break;

            /* case "Generar Salida":

             if (Obtener_Estado_Formulario(this.formSalidasProducto, Contenedor.Panel_Contenedor)) {
             formSalidasProducto = new FormSalidasProducto();

             formSalidasProducto.show();

             Contenedor.Panel_Contenedor.add(formSalidasProducto);
             java.awt.Dimension Tamaño_Panel = Contenedor.Panel_Contenedor.getSize();
             java.awt.Dimension Tamaño_InternalFrame = formSalidasProducto.getSize();
             formSalidasProducto.setLocation((Tamaño_Panel.width - Tamaño_InternalFrame.width) / 2,
             (Tamaño_Panel.height - Tamaño_InternalFrame.height) / 2);
             } else {
             formSalidasProducto.setIcon(false);
             }
             break;

             case "devolucionpunto":

             if (Obtener_Estado_Formulario(this.formDevolucionPunto, Contenedor.Panel_Contenedor)) {
             formDevolucionPunto = new FormDevolucionPunto();
             formDevolucionPunto.show();

             Contenedor.Panel_Contenedor.add(formDevolucionPunto);
             java.awt.Dimension Tamaño_Panel = Contenedor.Panel_Contenedor.getSize();
             java.awt.Dimension Tamaño_InternalFrame = formDevolucionPunto.getSize();
             formDevolucionPunto.setLocation((Tamaño_Panel.width - Tamaño_InternalFrame.width) / 2,
             (Tamaño_Panel.height - Tamaño_InternalFrame.height) / 2);
             } else {
             formDevolucionPunto.setIcon(false);
             }
             break;

             case "Salida Autorizada":

             if (Obtener_Estado_Formulario(this.formSalidasAutorizada, Contenedor.Panel_Contenedor)) {
             formSalidasAutorizada = new FormSalidasAutorizada();
             formSalidasAutorizada.show();

             Contenedor.Panel_Contenedor.add(formSalidasAutorizada);
             java.awt.Dimension Tamaño_Panel = Contenedor.Panel_Contenedor.getSize();
             java.awt.Dimension Tamaño_InternalFrame = formSalidasAutorizada.getSize();
             formSalidasAutorizada.setLocation((Tamaño_Panel.width - Tamaño_InternalFrame.width) / 2,
             (Tamaño_Panel.height - Tamaño_InternalFrame.height) / 2);
             } else {
             formSalidasAutorizada.setIcon(false);
             }
             break;

             case "CompraProductos":
             if (Obtener_Estado_Formulario(this.formconsultacompraproducto, Contenedor.Panel_Contenedor)) {
             formconsultacompraproducto = new Formconsultacompraproducto();
             formconsultacompraproducto.show();
             Contenedor.Panel_Contenedor.add(formconsultacompraproducto);
             java.awt.Dimension Tamaño_Panel = Contenedor.Panel_Contenedor.getSize();
             java.awt.Dimension Tamaño_InternalFrame = formconsultacompraproducto.getSize();
             formconsultacompraproducto.setLocation((Tamaño_Panel.width - Tamaño_InternalFrame.width) / 2,
             (Tamaño_Panel.height - Tamaño_InternalFrame.height) / 2);
             } else {
             formconsultacompraproducto.setIcon(false);
             }
             break;

             case "Despachosproducto":
             if (Obtener_Estado_Formulario(this.formConsultaSalidaProducto, Contenedor.Panel_Contenedor)) {
             formConsultaSalidaProducto = new FormConsultaSalidaProducto();
             formConsultaSalidaProducto.show();
             Contenedor.Panel_Contenedor.add(formConsultaSalidaProducto);
             java.awt.Dimension Tamaño_Panel = Contenedor.Panel_Contenedor.getSize();
             java.awt.Dimension Tamaño_InternalFrame = formConsultaSalidaProducto.getSize();
             formConsultaSalidaProducto.setLocation((Tamaño_Panel.width - Tamaño_InternalFrame.width) / 2,
             (Tamaño_Panel.height - Tamaño_InternalFrame.height) / 2);
             } else {
             formConsultaSalidaProducto.setIcon(false);
             }
             break;

             case "Formconteofisico":
             if (Obtener_Estado_Formulario(this.formConteoFisicoBodega, Contenedor.Panel_Contenedor)) {
             formConteoFisicoBodega = new FormConteoFisicoBodega();
             formConteoFisicoBodega.show();
             Contenedor.Panel_Contenedor.add(formConteoFisicoBodega);
             java.awt.Dimension Tamaño_Panel = Contenedor.Panel_Contenedor.getSize();
             java.awt.Dimension Tamaño_InternalFrame = formConteoFisicoBodega.getSize();
             formConteoFisicoBodega.setLocation((Tamaño_Panel.width - Tamaño_InternalFrame.width) / 2,
             (Tamaño_Panel.height - Tamaño_InternalFrame.height) / 2);
             } else {
             formConteoFisicoBodega.setIcon(false);
             }
             break;
             case "formconsumosaldo":
             if (Obtener_Estado_Formulario(this.formConsumoSaldoPunto, Contenedor.Panel_Contenedor)) {
             formConsumoSaldoPunto = new FormConsumoSaldoPunto();
             formConsumoSaldoPunto.show();
             Contenedor.Panel_Contenedor.add(formConsumoSaldoPunto);
             java.awt.Dimension Tamaño_Panel = Contenedor.Panel_Contenedor.getSize();
             java.awt.Dimension Tamaño_InternalFrame = formConsumoSaldoPunto.getSize();
             formConsumoSaldoPunto.setLocation((Tamaño_Panel.width - Tamaño_InternalFrame.width) / 2,
             (Tamaño_Panel.height - Tamaño_InternalFrame.height) / 2);
             } else {
             formConsumoSaldoPunto.setIcon(false);
             }
             break;
             case "forminventariopunto":
             if (Obtener_Estado_Formulario(this.formInventarioPuntoEntrega, Contenedor.Panel_Contenedor)) {
             formInventarioPuntoEntrega = new FormInventarioPuntoEntrega();
             formInventarioPuntoEntrega.show();
             Contenedor.Panel_Contenedor.add(formInventarioPuntoEntrega);
             java.awt.Dimension Tamaño_Panel = Contenedor.Panel_Contenedor.getSize();
             java.awt.Dimension Tamaño_InternalFrame = formInventarioPuntoEntrega.getSize();
             formInventarioPuntoEntrega.setLocation((Tamaño_Panel.width - Tamaño_InternalFrame.width) / 2,
             (Tamaño_Panel.height - Tamaño_InternalFrame.height) / 2);
             } else {
             formInventarioPuntoEntrega.setIcon(false);
             }
             break;

             case "Forminventariobodega":
             if (Obtener_Estado_Formulario(this.formInventarioBodega, Contenedor.Panel_Contenedor)) {
             formInventarioBodega = new FormInventarioBodega();
             formInventarioBodega.show();
             Contenedor.Panel_Contenedor.add(formInventarioBodega);
             java.awt.Dimension Tamaño_Panel = Contenedor.Panel_Contenedor.getSize();
             java.awt.Dimension Tamaño_InternalFrame = formInventarioBodega.getSize();
             formInventarioBodega.setLocation((Tamaño_Panel.width - Tamaño_InternalFrame.width) / 2,
             (Tamaño_Panel.height - Tamaño_InternalFrame.height) / 2);
             } else {
             formInventarioBodega.setIcon(false);
             }
             break;

             case "formpedidopunto":
             if (Obtener_Estado_Formulario(this.formPedidoPuntoEntrega, Contenedor.Panel_Contenedor)) {
             formPedidoPuntoEntrega = new FormPedidoPuntoEntrega();
             formPedidoPuntoEntrega.show();
             Contenedor.Panel_Contenedor.add(formPedidoPuntoEntrega);
             java.awt.Dimension Tamaño_Panel = Contenedor.Panel_Contenedor.getSize();
             java.awt.Dimension Tamaño_InternalFrame = formPedidoPuntoEntrega.getSize();
             formPedidoPuntoEntrega.setLocation((Tamaño_Panel.width - Tamaño_InternalFrame.width) / 2,
             (Tamaño_Panel.height - Tamaño_InternalFrame.height) / 2);
             } else {
             formPedidoPuntoEntrega.setIcon(false);
             }
             break;

             case "formconsumosaldogeneral":
             if (Obtener_Estado_Formulario(this.formConsumoSaldoGeneral, Contenedor.Panel_Contenedor)) {
             formConsumoSaldoGeneral = new FormConsumoSaldoGeneral();
             formConsumoSaldoGeneral.show();
             Contenedor.Panel_Contenedor.add(formConsumoSaldoGeneral);
             java.awt.Dimension Tamaño_Panel = Contenedor.Panel_Contenedor.getSize();
             java.awt.Dimension Tamaño_InternalFrame = formConsumoSaldoGeneral.getSize();
             formConsumoSaldoGeneral.setLocation((Tamaño_Panel.width - Tamaño_InternalFrame.width) / 2,
             (Tamaño_Panel.height - Tamaño_InternalFrame.height) / 2);
             } else {
             formConsumoSaldoGeneral.setIcon(false);
             }
             break;

             case "Orden de Compra":
             if (Obtener_Estado_Formulario(this.formOrdenCompra, Contenedor.Panel_Contenedor)) {
             formOrdenCompra = new FormOrdenCompra();
             formOrdenCompra.show();
             Contenedor.Panel_Contenedor.add(formOrdenCompra);
             java.awt.Dimension Tamaño_Panel = Contenedor.Panel_Contenedor.getSize();
             java.awt.Dimension Tamaño_InternalFrame = formOrdenCompra.getSize();
             formOrdenCompra.setLocation((Tamaño_Panel.width - Tamaño_InternalFrame.width) / 2,
             (Tamaño_Panel.height - Tamaño_InternalFrame.height) / 2);
             } else {
             formOrdenCompra.setIcon(false);
             }

             break;*/
            case "Salir":
                System.exit(0);
        }

    }

    public static JDesktopPane getjDesktopPane1() {
        jDesktopPane1 = Contenedor.Panel_Contenedor;
        return jDesktopPane1;
    }

    @Override
    protected Object doInBackground() throws Exception {

        Go();

        return this;
    }

}
