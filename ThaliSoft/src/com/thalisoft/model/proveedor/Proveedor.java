package com.thalisoft.model.proveedor;

import com.thalisoft.model.empleado.*;
import java.io.Serializable;
import java.util.Date;

public class Proveedor implements Serializable {

    private int idproveedor;
    private String nit;
    private String razonsocial;
    private String telefono;
    private String direccion;
    private String contacto;
    private String telcontacto;
    private String correo;
    private Date fechahoraingreso;
    private Empleado empleado;

    public Proveedor() {
    }

    public Proveedor(int idproveedor, String nit, String razonsocial, String telefono, String direccion, String contacto, String telcontacto, String correo, Date fechahoraingreso, Empleado empleado) {
        this.idproveedor = idproveedor;
        this.nit = nit;
        this.razonsocial = razonsocial;
        this.telefono = telefono;
        this.direccion = direccion;
        this.contacto = contacto;
        this.telcontacto = telcontacto;
        this.correo = correo;
        this.fechahoraingreso = fechahoraingreso;
        this.empleado = empleado;
    }

    
    public int getIdproveedor() {
        return idproveedor;
    }

    public void setIdproveedor(int idproveedor) {
        this.idproveedor = idproveedor;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getRazonsocial() {
        return razonsocial;
    }

    public void setRazonsocial(String razonsocial) {
        this.razonsocial = razonsocial;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getTelcontacto() {
        return telcontacto;
    }

    public void setTelcontacto(String telcontacto) {
        this.telcontacto = telcontacto;
    }

    public Date getFechahoraingreso() {
        return fechahoraingreso;
    }

    public void setFechahoraingreso(Date fechahoraingreso) {
        this.fechahoraingreso = fechahoraingreso;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    
    
}
