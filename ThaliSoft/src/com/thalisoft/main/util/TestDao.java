/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thalisoft.main.util;

import com.thalisoft.model.empleado.Empleado;
import com.thalisoft.model.empleado.EmpleadoDao;
import com.thalisoft.model.producto.Producto;
import com.thalisoft.model.producto.ProductoDao;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author beatriz elena
 */
public class TestDao {

    public static void main(String args[]) throws ParseException {

        EmpleadoDao dao = new EmpleadoDao();
        ProductoDao pd = new ProductoDao();
        
        for (Producto producto : pd.LISTA_PRODUCTOS()) {
            System.out.println("producto: " + producto.getNom_descripcion());
        }

        System.out.println("ficha nueva: " + dao.NUMERO_FICHA());

        /*        dao.LISTAR_EMPLEADO().stream().forEach((LISTADO_EMPLEADOS) -> {
         System.out.println("ID. FICHA: "+LISTADO_EMPLEADOS.getIdusuario()+"\n"
         + ""+"idempleado: " + LISTADO_EMPLEADOS.getIdentificacion()+"\n"
         + "Apellidos y Nombres: "+LISTADO_EMPLEADOS.getApellidos()+"\n"
         + "Direccion: "+LISTADO_EMPLEADOS.getDireccion()+"\n"
         + "telefono: "+LISTADO_EMPLEADOS.getTelefono()+"\n"
         + "Cargo: "+LISTADO_EMPLEADOS.getCargo()+"\n"
         + "salario: "+LISTADO_EMPLEADOS.getSalariobasico()+"\n"
         + "bono: "+LISTADO_EMPLEADOS.getBonificacion()+"\n"
         + "estado: "+LISTADO_EMPLEADOS.getEstado()+"\n"
         + "fechahoraingreso: "+DateUtil.toTimestamp(LISTADO_EMPLEADOS.getFechahoraingreso()));
         }); /*ProductoDAO dAO = new ProductoDAO();
         for (Object[] lotesalmacenado : dAO.lotesalmacenados("0004")) {
         System.out.println("producto: "+lotesalmacenado[3]);
         }
         Edicion edicion = new Edicion();
         SalidaDAO dAO = new SalidaDAO();
         DetalleSalidaDAO dsdao = new DetalleSalidaDAO();
         Calendar c = new GregorianCalendar();
         Salida s = new Salida(1243, c.getTime(), "FARMACIA CERETE", "11555", 2, "1102819530", "123666", 1, null);
         System.out.println("Encabezado de la salida creado? "+dAO.create(s));
         DetalleSalidaDAO dsdao = new DetalleSalidaDAO();
         DetalleSalida ds = new DetalleSalida(0, 1243, "7703038010302", 943, 20, 1, "DORA OVIEDO");
         System.out.println("Detalle de la salida creado? "+dsdao.create(ds));
         for (Object[] objects : dsdao.listardetalle(1243)) {
         System.out.println("Detalle de la Salida\n"
         + "iddetallesalida: "+objects[0]+"\nCodigo: "+objects[1]+"\nProducto: "+objects[2]+"\n"
         + "Lote No: "+objects[3]+"\nCantidad: "+objects[4]+"\nOperador: "+objects[6]);
         }*/
    }
}
