package com.thalisoft.model.empleado;

import com.thalisoft.main.util.Edicion;
import com.thalisoft.main.util.database;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class EmpleadoDao extends database {

    Edicion edicion = new Edicion();
    List<Empleado> list_employed = new ArrayList<>();

    public EmpleadoDao() {
        list_employed = LISTAR_EMPLEADO();
    }

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

    public Object[][] LISTADO_EMPLEADOS() {
        Object parametros = 2 + "," + 0 + "";
        Object[][] rs = SELECT_SP("SELECT_EMPLEADO", parametros);
        return rs;
    }

    public String NUMERO_FICHA() {
        Object parametros = 3 + "," + 0 + "";
        Object[][] rs = SELECT_SP("SELECT_EMPLEADO", parametros);
        return rs[0][0].toString();
    }

    public List<Empleado> LISTAR_EMPLEADO() {
        Empleado empleado = null;
        List<Empleado> list = new ArrayList<>();
        for (Object[] lisempl : LISTADO_EMPLEADOS()) {

            empleado = new Empleado(edicion.toNumeroEntero(lisempl[0].toString()),
                    lisempl[1].toString(), lisempl[2].toString(), null,
                    lisempl[4].toString(), lisempl[3].toString(), null, lisempl[5].toString(),
                    edicion.toNumeroEntero(lisempl[6].toString()), edicion.toNumeroEntero(lisempl[7].toString()),
                    lisempl[8].toString(), null);

            list.add(empleado);
        }
        return list;
    }

    public Empleado LOGIN_SYSTEM(Object[] key) {
        Object[][] rs = SELECT_SP("SELECT_LOGIN", key[0] + "," + key[1]);
        if (rs.length > 0) {
            return CONSULTAR_EMPLEADO(rs[0][0]);
        }
        return null;
    }
}
