package com.example.a14550390.eva2_practica1;

import android.app.ActionBar;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable.Creator;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ListView;
import com.example.a14550390.eva2_practica1.adapter.RestaurantAdapter;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

  private RestaurantAdapter rAdapter;
  private ArrayList<DatosRestaurant> datos = new ArrayList<DatosRestaurant>();

/*  DatosRestaurant[] arrDatosRestaurant = {
      new DatosRestaurant(R.drawable.barrafina, "Barra Fina", "Restaurante Gourmet",
          "Periferico de la juventud #301", "6141825532"),
      new DatosRestaurant(R.drawable.bourkestreetbakery, "Bourke Bakery", "Cafetería",
          "Calle Cuauhtemoc #4323", "6142643987"),
      new DatosRestaurant(R.drawable.cafeloisl, "Café Loisl", "Cafetería",
          "Av. de las americas #232", "6146428645"),
      new DatosRestaurant(R.drawable.cafelore, "Café Lore", "Cafetería", "Av. mirador #5362",
          "614287394"),
      new DatosRestaurant(R.drawable.confessional, "Confessional", "Pizzería", "Av. mirador #5362",
          "6142357342"),
      new DatosRestaurant(R.drawable.donostia, "Donostia", "Restaurante Gourmet",
          "Av. mirador #5362", "6142312768"),
      new DatosRestaurant(R.drawable.fiveleaves, "Five leaves", "Restaurante Gourmet",
          "Av. mirador #5362", "6142427455"),
      new DatosRestaurant(R.drawable.forkeerestaurant, "Forkee Restaurant", "Desayunos",
          "Av. mirador #5362", "6142428958"),};*/



  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
        WindowManager.LayoutParams.FLAG_FULLSCREEN);
    setContentView(R.layout.activity_main);

    Toolbar toolbar = (Toolbar) findViewById(R.id.appbar);
    setSupportActionBar(toolbar);
    //getSupportActionBar().setTitle("Restaurantes CUU");
    //CollapsingToolbarLayout
    CollapsingToolbarLayout ctlLayout = (CollapsingToolbarLayout)findViewById(R.id.ctlLayout);
    ctlLayout.setTitle("Restaurantes CUU");
    addData();
    initializeAdapter();

/*    listRestaurant = (ListView) findViewById(R.id.listRestaurant);

    listRestaurant
        .setAdapter(new CustomAdapter(this, R.layout.lista_restaurante, arrDatosRestaurant));
    listRestaurant.setOnItemClickListener(this);*/
  }

  private void addData() {
    DatosRestaurant barraFina = new DatosRestaurant();

    barraFina.setNombre("Barra fina");
    barraFina.setDescripcion("Restaurante Gourmet");
    barraFina.setDireccion("Periferico de la juventud #301");
    barraFina.setTelefono("6141825532");
    barraFina.setIdImagen(R.drawable.barrafina);
    barraFina.setIdImagenDet(R.drawable.barrafina2x);
    datos.add(barraFina);
    datos.add(new DatosRestaurant(R.drawable.bourkestreetbakery, "Bourke Bakery", "Cafetería",
        "Calle Cuauhtemoc #4323", "6142643987", R.drawable.bourkestreetbakery2x));
    datos.add(new DatosRestaurant(R.drawable.cafeloisl, "Café Loisl", "Cafetería",
        "Av. de las americas #232", "6146428645", R.drawable.cafeloisl2x));
    datos.add(new DatosRestaurant(R.drawable.cafelore, "Café Lore", "Cafetería", "Calle Aldama #523",
            "614287394", R.drawable.cafelore2x));
    datos.add(new DatosRestaurant(R.drawable.confessional, "Confessional", "Pizzería",
        "Av. industrias #323",
        "6142357342", R.drawable.confessional2x));
    datos.add(new DatosRestaurant(R.drawable.donostia, "Donostia", "Restaurante Gourmet",
        "Calle Hidalgo #8464", "6142312768", R.drawable.donostia2x));
    datos.add(new DatosRestaurant(R.drawable.fiveleaves, "Five leaves", "Restaurante Gourmet",
        "Calle Juarez #2122", "6142427455", R.drawable.fiveleaves2x));
    datos.add(new DatosRestaurant(R.drawable.forkeerestaurant, "Forkee Restaurant", "Desayunos",
        "Av. mirador #4322", "6142428958", R.drawable.forkeerestaurant2x));
  }

  private void initializeAdapter() {
    rAdapter = new RestaurantAdapter(datos, getApplicationContext());
    RecyclerView recView = (RecyclerView) findViewById(R.id.RecView);
    recView.setHasFixedSize(true);
    recView.setLayoutManager(new LinearLayoutManager(this));
    recView.setAdapter(rAdapter);
  }



/*  @Override
  public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
    Intent intentDetalle = new Intent(this, Detalles.class);
    int idImagen = arrDatosRestaurant[position].getIdImagen();
    String nombre = arrDatosRestaurant[position].getNombre();
    String descripcion = arrDatosRestaurant[position].getDescripcion();
    String direccion = arrDatosRestaurant[position].getDireccion();
    String telefono = arrDatosRestaurant[position].getTelefono();

    intentDetalle.putExtra("IMAGEN", idImagen);
    intentDetalle.putExtra("NOMBRE", nombre);
    intentDetalle.putExtra("DESCRIPCION", descripcion);
    intentDetalle.putExtra("DIRECCION", direccion);
    intentDetalle.putExtra("TELEFONO", telefono);
    startActivity(intentDetalle);
  }*/
}

