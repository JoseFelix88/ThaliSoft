package com.thalisoft.controller.index;

import UpperEssential.UpperEssentialLookAndFeel;
import static com.thalisoft.main.util.Metodos.Obtener_Estado_Formulario;
import com.thalisoft.main.util.Variables_Gloabales;
import com.thalisoft.vista.empleado.FormEmpleado;
import com.thalisoft.vista.index.Contenedor;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDesktopPane;
import javax.swing.SwingWorker;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class ControllerContenedor extends SwingWorker<Object, Object> {

    private static Contenedor contenedor;

    public static Contenedor getContenedor() {
        return contenedor;
    }
    /*FormProducto formProducto;
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
            contenedor.JM_Profile.setText(Variables_Gloabales.EMPLEADO.getNombres());
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
                if (Obtener_Estado_Formulario(this.formEmpleado, Contenedor.Panel_Contenedor)) {
                    
                    formEmpleado = new FormEmpleado();
                    
                    formEmpleado.show();
                    Contenedor.Panel_Contenedor.add(formEmpleado);
                    java.awt.Dimension Tamaño_Panel = Contenedor.Panel_Contenedor.getSize();
                    java.awt.Dimension Tamaño_InternalFrame = formEmpleado.getSize();
                    formEmpleado.setLocation((Tamaño_Panel.width - Tamaño_InternalFrame.width) / 2,
                            (Tamaño_Panel.height - Tamaño_InternalFrame.height) / 2);
                } else {
                    formEmpleado.setIcon(false);
                }

                break;
            /* case "Gestionar Producto":
             if (Obtener_Estado_Formulario(this.formProducto, Contenedor.Panel_Contenedor)) {

             formProducto = new FormProducto();
             formAsignarCUM = new FormAsignarCUM();
             formListarPlu = new FormListarPlu();

             new ControllerProductoAux(formProducto, formAsignarCUM, formListarPlu).GO();
             formProducto.show();
             Contenedor.Panel_Contenedor.add(formProducto);
             java.awt.Dimension Tamaño_Panel = Contenedor.Panel_Contenedor.getSize();
             java.awt.Dimension Tamaño_InternalFrame = formProducto.getSize();
             formProducto.setLocation((Tamaño_Panel.width - Tamaño_InternalFrame.width) / 2,
             (Tamaño_Panel.height - Tamaño_InternalFrame.height) / 2);
             } else {
             formProducto.setIcon(false);
             }
             break;

             case "Compra":

             if (Obtener_Estado_Formulario(this.formFacturaCompra, Contenedor.Panel_Contenedor)) {
             formFacturaCompra = new FormFacturaCompra();
             new ControllerFacturaCompra(formFacturaCompra).execute();

             } else {
             formFacturaCompra.setIcon(false);
             }
             break;

             case "Lotes Almacenados":

             if (Obtener_Estado_Formulario(this.formlotealmacenado, Contenedor.Panel_Contenedor)) {
             formSalidasProducto = new FormSalidasProducto();
             formlotealmacenado = new Formlotealmacenado(formSalidasProducto);
             formlotealmacenado.show();

             Contenedor.Panel_Contenedor.add(formlotealmacenado);
             java.awt.Dimension Tamaño_Panel = Contenedor.Panel_Contenedor.getSize();
             java.awt.Dimension Tamaño_InternalFrame = formlotealmacenado.getSize();
             formlotealmacenado.setLocation((Tamaño_Panel.width - Tamaño_InternalFrame.width) / 2,
             (Tamaño_Panel.height - Tamaño_InternalFrame.height) / 2);
             } else {
             formlotealmacenado.setIcon(false);
             }

             break;

             case "Generar Salida":

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
