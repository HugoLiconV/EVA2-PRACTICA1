package com.example.a14550390.eva2_practica1;

/**
 * Created by 14550390 on 21/03/17.
 */

public class DatosRestaurant {
    private String nombre, descripcion, direccion, telefono;
    private int idImagen;

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

    public String getDescripcion() {
        return descripcion;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public int getIdImagen() {
        return idImagen;
    }
}
