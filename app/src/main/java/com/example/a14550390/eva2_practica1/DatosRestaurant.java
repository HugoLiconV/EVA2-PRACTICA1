package com.example.a14550390.eva2_practica1;

/**
 * Created by 14550390 on 21/03/17.
 */

public class DatosRestaurant {
    String nombre, descripcion, direccion, telefono;
    int idImagen;

    public DatosRestaurant(int idImagen, String nombre, String descripcion, String direccion, String telefono) {
        this.idImagen = idImagen;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getIdImagen() {
        return idImagen;
    }

    public void setIdImagen(int idImagen) {
        this.idImagen = idImagen;
    }
}
