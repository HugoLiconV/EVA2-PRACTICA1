package com.example.a14550390.eva2_practica1;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by 14550390 on 21/03/17.
 */

public class DatosRestaurant implements Parcelable {

  private String nombre;
  private String descripcion;
  private String direccion;
  private String telefono;
  private int idImagen;

  public static final Parcelable.Creator<DatosRestaurant> CREATOR = new Parcelable.Creator<DatosRestaurant>() {
    @Override
    public DatosRestaurant createFromParcel(Parcel in) {
      return new DatosRestaurant(in);
    }

    @Override
    public DatosRestaurant[] newArray(int size) {
      return new DatosRestaurant[size];
    }
  };

  public DatosRestaurant(int idImagen, String nombre, String descripcion, String direccion,
      String telefono) {
    this.idImagen = idImagen;
    this.nombre = nombre;
    this.descripcion = descripcion;
    this.direccion = direccion;
    this.telefono = telefono;
  }

  public DatosRestaurant() {
    idImagen = 0;
    nombre = "";
    descripcion = "";
    direccion = "";
    telefono = "";
  }

  protected DatosRestaurant(Parcel in) {
    nombre = in.readString();
    descripcion = in.readString();
    direccion = in.readString();
    telefono = in.readString();
    idImagen = in.readInt();
  }

  @Override
  public int describeContents() {
    return 0;
  }

  @Override
  public void writeToParcel(Parcel dest, int flags) {
    dest.writeString(nombre);
    dest.writeString(descripcion);
    dest.writeString(direccion);
    dest.writeString(telefono);
    dest.writeInt(idImagen);
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

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  public void setDireccion(String direccion) {
    this.direccion = direccion;
  }

  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }

  public void setIdImagen(int idImagen) {
    this.idImagen = idImagen;
  }
}
