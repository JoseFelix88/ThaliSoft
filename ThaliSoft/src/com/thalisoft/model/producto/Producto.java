 
package com.thalisoft.model.producto;

import com.thalisoft.model.empleado.Empleado;
import java.util.Date;

 
public class Producto {
    
    private int id_producto;
    private String id_referencia;
    private String nom_descripcion;
    private int strock;
    private int costo_und;
    private int precio_venta;
    private int utilidad;
    private String talla;
    private String color;
    private String materia;
    private String sexo;
    private String edad;
    private String marca;
    private String diseño;
    private Date fechahoraingreso;
    private Empleado empleado;

    public Producto() {
    }

    public Producto(int id_producto, String id_referencia, String nom_descripcion, int strock, int costo_und, int precio_venta, int utilidad, String talla, String color, String materia, String sexo, String edad, String marca, String diseño, Date fechahoraingreso, Empleado empleado) {
        this.id_producto = id_producto;
        this.id_referencia = id_referencia;
        this.nom_descripcion = nom_descripcion;
        this.strock = strock;
        this.costo_und = costo_und;
        this.precio_venta = precio_venta;
        this.utilidad = utilidad;
        this.talla = talla;
        this.color = color;
        this.materia = materia;
        this.sexo = sexo;
        this.edad = edad;
        this.marca = marca;
        this.diseño = diseño;
        this.fechahoraingreso = fechahoraingreso;
        this.empleado = empleado;
    }

    
    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public String getId_referencia() {
        return id_referencia;
    }

    public void setId_referencia(String id_referencia) {
        this.id_referencia = id_referencia;
    }

    public String getNom_descripcion() {
        return nom_descripcion;
    }

    public void setNom_descripcion(String nom_descripcion) {
        this.nom_descripcion = nom_descripcion;
    }

    public int getStrock() {
        return strock;
    }

    public void setStrock(int strock) {
        this.strock = strock;
    }

    public int getCosto_und() {
        return costo_und;
    }

    public void setCosto_und(int costo_und) {
        this.costo_und = costo_und;
    }

    public int getPrecio_venta() {
        return precio_venta;
    }

    public void setPrecio_venta(int precio_venta) {
        this.precio_venta = precio_venta;
    }

    public int getUtilidad() {
        return utilidad;
    }

    public void setUtilidad(int utilidad) {
        this.utilidad = utilidad;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDiseño() {
        return diseño;
    }

    public void setDiseño(String diseño) {
        this.diseño = diseño;
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
