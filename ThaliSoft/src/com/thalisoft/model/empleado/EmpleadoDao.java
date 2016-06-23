package com.thalisoft.model.empleado;

import com.thalisoft.main.util.database;

public class EmpleadoDao extends database {

    public boolean CRUD_EMPLEADO(Object[] key) {
        return EJECUTAR_SP("CRUD_EMPLEADO", key);
    }
}
