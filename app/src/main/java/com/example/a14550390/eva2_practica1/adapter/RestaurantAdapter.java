package com.example.a14550390.eva2_practica1.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.example.a14550390.eva2_practica1.DatosRestaurant;
import com.example.a14550390.eva2_practica1.Detalles;
import com.example.a14550390.eva2_practica1.R;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hugo on 20/04/17.
 */

public class RestaurantAdapter extends RecyclerView.Adapter <RestaurantAdapter.ViewHolder>{

  private List <DatosRestaurant> mRestauranteList;

  public RestaurantAdapter(ArrayList<DatosRestaurant> datos){
    mRestauranteList = datos;
  }

  @Override
  public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
    View itemView = LayoutInflater.from(parent.getContext())
        .inflate(R.layout.lista_restaurante, parent, false);
    return new ViewHolder(itemView);
  }

  @Override
  public void onBindViewHolder(RestaurantAdapter.ViewHolder viewHolder, int position) {
    viewHolder.bindData(mRestauranteList.get(position));
  }


  @Override
  public int getItemCount() {
    return mRestauranteList.size();
  }

  static class ViewHolder extends RecyclerView.ViewHolder{

    private TextView txtNombre;
    private TextView txtDescripcion;
    private ImageView imgRestaurant;
    private DatosRestaurant mRestaurant;

    ViewHolder(View itemView) {
      super(itemView);

      txtNombre = (TextView)itemView.findViewById(R.id.lblNombre);
      txtDescripcion = (TextView)itemView.findViewById(R.id.lblDescripcion);
      imgRestaurant = (ImageView)itemView.findViewById(R.id.imgRestaurant);
    }

    void bindData(DatosRestaurant restaurant){
      this.mRestaurant = restaurant;
      final Context context = itemView.getContext();

      txtNombre.setText(restaurant.getNombre());
      txtDescripcion.setText(restaurant.getDescripcion());
      imgRestaurant.setImageResource(restaurant.getIdImagen());

      itemView.setOnClickListener(new OnClickListener() {
        @Override
        public void onClick(View v) {
          Intent intent = new Intent(context, Detalles.class);
          intent.putExtra(Detalles.RESTAURANTE, mRestaurant);
          context.startActivity(intent);
        }
      });
    }
  }
}

