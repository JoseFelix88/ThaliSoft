package com.thalisoft.model.empleado;

import com.thalisoft.main.util.Edicion;
import com.thalisoft.main.util.database;
import java.sql.CallableStatement;
import java.sql.ResultSet;

public class EmpleadoDao extends database {

    Edicion edicion = new Edicion();

    public boolean CRUD_EMPLEADO(Object[] key) {
        return EJECUTAR_SP("CRUD_EMPLEADO", key);
    }

    public Empleado CONSULTAR_EMPLEADO(Object key) {
        Empleado empleado = null;
        CallableStatement cs;
        ResultSet rs;
        try {
            cs = getConnection().prepareCall("call SELECT_EMPLEADO(?,?)");
            cs.setObject(1, 1);
            cs.setObject(2, key);
            rs = cs.executeQuery();
            if (rs.next()) {
                empleado = new Empleado(rs.getInt("idusuarios"), rs.getString("identificacion"),
                        rs.getString("apellidos"), rs.getString("nombres"), rs.getString("telefono"),
                        rs.getString("direccion"), rs.getString("pasword"), rs.getString("cargo"),
                        rs.getInt("salariobasico"), rs.getInt("bonificacion"), rs.getString("estado"),
                        rs.getTimestamp("fechahoraingreso"));
            }
        } catch (Exception e) {
            edicion.mensajes(3, "error en consulta empleado: " + e);
        }
        return empleado;
    }
}
