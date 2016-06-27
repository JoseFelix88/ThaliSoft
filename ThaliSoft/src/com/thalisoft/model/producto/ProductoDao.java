package com.thalisoft.model.producto;

import com.thalisoft.main.util.Edicion;
import com.thalisoft.main.util.database;
import com.thalisoft.model.empleado.EmpleadoDao;

public class ProductoDao extends database {

    Edicion edicion = new Edicion();
    EmpleadoDao empleado;

    public boolean EJECUTAR_CRUD(Object[] key) {
        return EJECUTAR_SP("CRUD_PRODUCTO", key);
    }

    public Producto READ_PRODUCTO(Object key) {
        Producto producto = null;
        Object[][] rs = SELECT_SP("SELECT_PRODUCTO", key);
        if (rs.length > 0) {
            empleado = new EmpleadoDao();
            producto = new Producto();
            producto.setId_producto(edicion.toNumeroEntero(rs[0][0].toString()));
            producto.setId_referencia(rs[0][1].toString());
            producto.setNom_descripcion(rs[0][2].toString());
            producto.setStrock(edicion.toNumeroEntero(rs[0][3].toString()));
            producto.setCosto_und(edicion.toNumeroEntero(rs[0][4].toString()));
            producto.setPrecio_venta(edicion.toNumeroEntero(rs[0][5].toString()));
            producto.setUtilidad(edicion.toNumeroEntero(rs[0][6].toString()));
            producto.setTalla(rs[0][7].toString());
            producto.setColor(rs[0][8].toString());
            producto.setMateria(rs[0][9].toString());
            producto.setSexo(rs[0][10].toString());
            producto.setEdad(rs[0][11].toString());
            producto.setMarca(rs[0][12].toString());
            producto.setDiseño(rs[0][13].toString());
            producto.setFechahoraingreso(null);
            producto.setEmpleado(empleado.CONSULTAR_EMPLEADO(rs[0][15]));
        }
        return producto;
    }

    public Object[][] LISTADO_DE_PRODUCTOS(Object KEY) {
        Object[][] rs = SELECT_SP("SELECT_PRODUCTO", KEY);
        if (rs.length > 0) {
            return rs;
        }
        return null;
    }
}
