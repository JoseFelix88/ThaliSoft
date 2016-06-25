package com.thalisoft.model.empleado;

import java.io.Serializable;
import java.util.Date;

public class Empleado implements Serializable {

    private int idusuario;
    private String identificacion;
    private String apellidos;
    private String nombres;
    private String telefono;
    private String direccion;
    private String password;
    private String cargo;
    private int salariobasico;
    private int bonificacion;
    private String estado;
    private Date fechahoraingreso;

    public Empleado() {
    }

    public Empleado(int idusuario, String identificacion, String apellidos, String nombres, String telefono, String direccion, String password, String cargo, int salariobasico, int bonificacion, String estado, Date fechahoraingreso) {
        this.idusuario = idusuario;
        this.identificacion = identificacion;
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.telefono = telefono;
        this.direccion = direccion;
        this.password = password;
        this.cargo = cargo;
        this.salariobasico = salariobasico;
        this.bonificacion = bonificacion;
        this.estado = estado;
        this.fechahoraingreso = fechahoraingreso;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getSalariobasico() {
        return salariobasico;
    }

    public void setSalariobasico(int salariobasico) {
        this.salariobasico = salariobasico;
    }

    public int getBonificacion() {
        return bonificacion;
    }

    public void setBonificacion(int bonificacion) {
        this.bonificacion = bonificacion;
    }

    public Date getFechahoraingreso() {
        return fechahoraingreso;
    }

    public void setFechahoraingreso(Date fechahoraingreso) {
        this.fechahoraingreso = fechahoraingreso;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}
