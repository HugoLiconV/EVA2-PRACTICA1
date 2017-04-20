package com.example.a14550390.eva2_practica1;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by 14550390 on 21/03/17.
 */

public class CustomAdapter extends ArrayAdapter <DatosRestaurant> {
    Context contextApp;
    int layout;
    DatosRestaurant [] arrDatos;//arreglo de objetos tipo DatosRestaurant

    public CustomAdapter(Context context, int resource, DatosRestaurant[] objects) {
        super(context, resource, objects);
        contextApp = context;
        layout = resource;
        arrDatos = objects;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View viewFila = convertView;
        ImageView imageViewRestaurant;
        TextView lblNombre, lblDescripcion, lblNombreSombra;
        if(viewFila==null){
            //CREAR
            LayoutInflater liCrearLayout = ((Activity)contextApp).getLayoutInflater();
            viewFila = liCrearLayout.inflate(layout, parent, false);
        }
        imageViewRestaurant = (ImageView) viewFila.findViewById(R.id.imgRestaurant);
        lblNombre = (TextView) viewFila.findViewById(R.id.lblNombreDet);
        lblDescripcion = (TextView) viewFila.findViewById(R.id.lblDescripcion);
        //lblNombreSombra = (TextView)viewFila.findViewById(R.id.lblNombreSombra);
        DatosRestaurant dcOb = arrDatos[position];
        imageViewRestaurant.setImageResource(dcOb.idImagen);
        lblNombre.setText(dcOb.nombre);
        lblDescripcion.setText(dcOb.descripcion);
        //lblNombreSombra.setText(dcOb.nombre);
        return viewFila;
    }
}
