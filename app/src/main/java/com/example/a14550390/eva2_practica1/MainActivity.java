package com.example.a14550390.eva2_practica1;

import android.app.ActionBar;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity implements ListView.OnItemClickListener{
    ListView listRestaurant;
    DatosRestaurant[] arrDatosRestaurant= {
            new DatosRestaurant(R.drawable.barrafina, "Barra Fina", "Restaurante Gourmet", "Periferico de la juventud #301", "6141825532"),
            new DatosRestaurant(R.drawable.bourkestreetbakery, "Bourke Bakery", "Cafetería", "Calle Cuauhtemoc #4323", "6142643987"),
            new DatosRestaurant(R.drawable.cafeloisl, "Café Loisl", "Cafetería", "Av. de las americas #232", "6146428645"),
            new DatosRestaurant(R.drawable.cafelore, "Café Lore", "Cafetería", "Av. mirador #5362", "614287394"),
            new DatosRestaurant(R.drawable.confessional, "Confessional", "Pizzería", "Av. mirador #5362", "6142357342"),
            new DatosRestaurant(R.drawable.donostia, "Donostia", "Restaurante Gourmet", "Av. mirador #5362", "6142312768"),
            new DatosRestaurant(R.drawable.fiveleaves, "Five leaves", "Restaurante Gourmet", "Av. mirador #5362", "6142427455"),
            new DatosRestaurant(R.drawable.forkeerestaurant, "Forkee Restaurant", "Desayunos", "Av. mirador #5362", "6142428958"),};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        listRestaurant = (ListView)findViewById(R.id.listRestaurant);
        listRestaurant.setAdapter(new CustomAdapter(this, R.layout.lista_restaurante, arrDatosRestaurant));
        listRestaurant.setOnItemClickListener(this);
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intentDetalle = new Intent(this, Detalles.class);
        int idImagen = arrDatosRestaurant[position].idImagen;
        String nombre = arrDatosRestaurant[position].nombre;
        String descripcion = arrDatosRestaurant[position].descripcion;
        String direccion = arrDatosRestaurant[position].direccion;
        String telefono = arrDatosRestaurant[position].telefono;

        intentDetalle.putExtra("IMAGEN",idImagen);
        intentDetalle.putExtra("NOMBRE",nombre);
        intentDetalle.putExtra("DESCRIPCION",descripcion);
        intentDetalle.putExtra("DIRECCION",direccion);
        intentDetalle.putExtra("TELEFONO",telefono);
        startActivity(intentDetalle);
    }
}

