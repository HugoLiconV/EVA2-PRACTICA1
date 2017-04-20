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
}
