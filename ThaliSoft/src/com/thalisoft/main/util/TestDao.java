/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thalisoft.main.util;
 
import com.thalisoft.model.empleado.EmpleadoDao;


/**
 *
 * @author beatriz elena
 */
public class TestDao {
    
      public static void main(String args[]) {
          
          EmpleadoDao dao = new EmpleadoDao();
          System.out.println("empleado: "+dao.CONSULTAR_EMPLEADO("1102819530").getCargo());
          
          /*ProductoDAO dAO = new ProductoDAO();
          
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
