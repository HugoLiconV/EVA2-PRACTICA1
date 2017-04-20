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
        View item = convertView;
        ViewHolder holder;

        //ImageView imageViewRestaurant;
        //TextView lblNombre, lblDescripcion;

        if(item==null){
            //CREAR
            LayoutInflater inflater = LayoutInflater.from(getContext());
            item = inflater.inflate(layout, null);

            holder = new ViewHolder();
            holder.nombre = (TextView)item.findViewById(R.id.lblNombre);
            holder.descripcion = (TextView) item.findViewById(R.id.lblDescripcion);
            holder.imgView = (ImageView) item.findViewById(R.id.imgRestaurant);

            item.setTag(holder);
        }else{
            holder = (ViewHolder)item.getTag();
        }
        //imageViewRestaurant = (ImageView) item.findViewById(R.id.imgRestaurant);
        //lblNombre = (TextView) item.findViewById(R.id.lblNombre);
        //lblDescripcion = (TextView) item.findViewById(R.id.lblDescripcion);

        DatosRestaurant dcOb = arrDatos[position];

        //imageViewRestaurant.setImageResource(dcOb.getIdImagen());
        //lblNombre.setText(dcOb.getNombre());
        //lblDescripcion.setText(dcOb.getDescripcion());

        holder.nombre.setText(dcOb.getNombre());
        holder.descripcion.setText(dcOb.getDescripcion());
        holder.imgView.setImageResource(dcOb.getIdImagen());
        return item;
    }

    static class ViewHolder{
        TextView nombre, descripcion;
        ImageView imgView;
    }
}
