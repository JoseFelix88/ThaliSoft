package com.thalisoft.model.cliente;

import com.thalisoft.model.empleado.*;
import java.io.Serializable;
import java.util.Date;

public class Cliente implements Serializable {

    private int idcliente;
    private String identificacion;
    private String nombrecompleto;
    private String telefono;
    private String direccion;
    private Empleado empleado;
    private Date fechahoraingreso;

    public Cliente() {
    }

    public Cliente(int idcliente, String identificacion, String nombrecompleto, String telefono, String direccion, Empleado empleado, Date fechahoraingreso) {
        this.idcliente = idcliente;
        this.identificacion = identificacion;
        this.nombrecompleto = nombrecompleto;
        this.telefono = telefono;
        this.direccion = direccion;
        this.empleado = empleado;
        this.fechahoraingreso = fechahoraingreso;
    }

    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombrecompleto() {
        return nombrecompleto;
    }

    public void setNombrecompleto(String nombrecompleto) {
        this.nombrecompleto = nombrecompleto;
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

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Date getFechahoraingreso() {
        return fechahoraingreso;
    }

    public void setFechahoraingreso(Date fechahoraingreso) {
        this.fechahoraingreso = fechahoraingreso;
    }
    




}
