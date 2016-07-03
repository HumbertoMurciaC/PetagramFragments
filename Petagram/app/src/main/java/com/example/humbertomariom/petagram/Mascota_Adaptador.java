package com.example.humbertomariom.petagram;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Humberto Mario M on 25/06/2016.
 */
public class Mascota_Adaptador extends RecyclerView.Adapter<Mascota_Adaptador.MascotaViewHolder> {

    ArrayList<Mascota> mascotas;
    Mascota mascota;

    public Mascota_Adaptador(ArrayList<Mascota> mascotas){

        this.mascotas = mascotas;

    }


    //Inflar el layout y lo pasara al viewholder para el obtenga los views
    @Override
    public MascotaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview, parent, false);
        return new MascotaViewHolder(v);
    }

    //Asocia cada elemento de la lista con cada view
    @Override
    public void onBindViewHolder(final MascotaViewHolder mascotaViewHolder, final int position) {
        mascota = mascotas.get(position);
        mascotaViewHolder.imgFoto.setImageResource(mascota.getFoto());
        mascotaViewHolder.tvNombre.setText(mascota.getNombre());
        mascotaViewHolder.tvLikes.setText(Integer.toString(mascota.getRaiting()));

        mascotaViewHolder.hueso_vacio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mascota = mascotas.get(position);
                int numero=mascota.getRaiting();
                numero=numero+1;
                mascota.setRaiting(numero);
                mascotaViewHolder.tvLikes.setText(Integer.toString(mascota.getRaiting()));
                numero=0;

            }
        });
    }

    @Override
    public int getItemCount() { //Cantidad de elementos que contiene la lista

        return mascotas.size();
    }

    public static class MascotaViewHolder extends RecyclerView.ViewHolder
            implements View.OnClickListener {

        private ImageView imgFoto;
        private TextView tvNombre;
        private TextView tvLikes;
        private ImageView hueso_vacio;


        public MascotaViewHolder(View itemView) {
            super(itemView);

            imgFoto = (ImageView) itemView.findViewById(R.id.Img_Perro);
            tvNombre = (TextView) itemView.findViewById(R.id.tv_Nombre);
            tvLikes = (TextView) itemView.findViewById(R.id.tv_Likes);
            hueso_vacio = (ImageView) itemView.findViewById(R.id.HuesoVacio);
            itemView.setOnClickListener(this);

        }

        @Override
        public void onClick(View view) {


        }

    }






    
    
}
