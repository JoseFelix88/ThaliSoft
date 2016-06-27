package com.thalisoft.main.util.report;

import com.thalisoft.main.util.Edicion;
import com.thalisoft.main.util.database;
import java.util.HashMap;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;

public class Manager_Report extends database {

    static String RUTA_REPORTE = "C:\\ThaliSotf Report/";
    public String NOMBRE_REPORTE;
    public String NOMBRE_DEL_ARCHIVO_EXPORTADO;
    public HashMap PARAMETROS = new HashMap();
    public String DIRECTORIO_POR_DEFECTO;
    JasperReport masterReport = null;

    Edicion edicion = new Edicion();

    public Manager_Report() {
    }

     public void FichaDeEmpleado(Object key) {
        try {
            String Ubicacion = RUTA_REPORTE + "/Empleado/";
            String reporte = "Ficha de Empleado.jasper";
            masterReport = (JasperReport) JRLoader.loadObject(Ubicacion.concat(reporte));
            PARAMETROS.put("key", key.toString());
//            PARAMETROS.put("numCaja", numcaja);
            edicion.Lanzador(masterReport, PARAMETROS);
        } catch (Exception j) {
            edicion.mensajes(3, "NO SE PUEDE LANZAR la ficha del empleado.\n" + j);
            System.out.println("Mensaje de Error:" + j);
        }
    }
     
    public void ListadoDeEmpleados() {
        try {
            String Ubicacion = RUTA_REPORTE + "/Empleado/";
            String reporte = "listado de Empleados.jasper";
            masterReport = (JasperReport) JRLoader.loadObject(Ubicacion.concat(reporte));
            edicion.Lanzador(masterReport, PARAMETROS);
        } catch (Exception j) {
            edicion.mensajes(3, "NO SE PUEDE LANZAR el listado del empleado.\n" + j);
            System.out.println("Mensaje de Error:" + j);
        }
    }
     
}
