package com.thalisoft.model.empleado;

import com.thalisoft.main.util.database;
import java.sql.CallableStatement;
import java.sql.ResultSet;

public class EmpleadoDao extends database {

    public boolean CRUD_EMPLEADO(Object[] key) {
        return EJECUTAR_SP("CRUD_EMPLEADO", key);
    }
    
    public Empleado CONSULTAR_EMPLEADO(Object key){
        Empleado empleado = null;
        CallableStatement cs;
        ResultSet rs;
        try {
            cs = getConnection().prepareCall("call SELECT_EMPLEADO(?)");
            cs.setObject(1, key);
            rs = cs.executeQuery();
            if (rs.next()) {
                empleado = new Empleado();
                empleado.setIdusuario(rs.getInt("idusuarios"));
                empleado.setIdentificacion(rs.getString("identificacion"));
                empleado.setApellidos(rs.getString("apellidos"));
                empleado.setNombres(rs.getString("nombres"));
            }
        } catch (Exception e) {
            System.out.println("error en consulta empleado: "+e);
        }
        return empleado;
    }
}
