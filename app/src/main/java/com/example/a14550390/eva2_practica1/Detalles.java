package com.example.a14550390.eva2_practica1;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import com.squareup.picasso.Picasso;

public class Detalles extends AppCompatActivity {

  public final static String RESTAURANTE = "RESTAURANTE";
  TextView lblNombreDet, lblDescripcionDet, lblDireccion, lblTelefono;
  ImageView imgDetalle;
  Intent intentDial;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    //Quitar el status bar
    getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
        WindowManager.LayoutParams.FLAG_FULLSCREEN);
    setContentView(R.layout.activity_detalles);
    lblNombreDet = (TextView) findViewById(R.id.lblNombre);
    lblDescripcionDet = (TextView) findViewById(R.id.lblDescripcionDet);
    lblDireccion = (TextView) findViewById(R.id.lblDireccion);
    lblTelefono = (TextView) findViewById(R.id.lblTelefono);
    imgDetalle = (ImageView) findViewById(R.id.imgDetalle);

    //LEER DATOS
    Intent intentDatos = getIntent();

    DatosRestaurant restaurant = getIntent().getParcelableExtra(RESTAURANTE);

//        int idImg = intentDatos.getIntExtra("IMAGEN",R.drawable.barrafina);
//        String nombre = intentDatos.getStringExtra("NOMBRE");
//        String descripcion = intentDatos.getStringExtra("DESCRIPCION");
//        String direccion = intentDatos.getStringExtra("DIRECCION");


    String telefono = restaurant.getTelefono();
    Picasso.with(getApplicationContext())
        .load(restaurant.getIdImagenDet())
        //.resize(height, width)
        //.centerCrop()
        .into(imgDetalle);
    //imgDetalle.setImageResource(restaurant.getIdImagenDet());
    lblNombreDet.setText(restaurant.getNombre());
    lblDescripcionDet.setText(restaurant.getDescripcion());
    lblDireccion.setText(restaurant.getDireccion());
    lblTelefono.setText(restaurant.getTelefono());

    intentDial = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + telefono));
  }

  public void dial(View v) {
    startActivity(intentDial);
  }
}
