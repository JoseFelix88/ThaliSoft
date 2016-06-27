package com.thalisoft.model.cliente;

import com.thalisoft.model.empleado.*;
import java.io.Serializable;
import java.util.Date;

public class Cliente implements Serializable {

    private int idcliente;
    private String identificacion;
    private String apellidos;
    private String nombres;
    private String telefono;
    private String direccion;
    private Empleado empleado;
    private Date fechahoraingreso;
    
    public Cliente(int idcliente, String identificacion, String apellidos, String nombres, String telefono, String direccion, Empleado empleado, Date fechahoraingreso) {
        this.idcliente = idcliente;
        this.identificacion = identificacion;
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.telefono = telefono;
        this.direccion = direccion;
        this.empleado = empleado;
        this.fechahoraingreso = fechahoraingreso;
    }


    public Cliente() {
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

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
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
