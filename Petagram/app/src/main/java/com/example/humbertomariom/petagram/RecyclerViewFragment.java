package com.example.humbertomariom.petagram;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import java.util.ArrayList;

public class RecyclerViewFragment extends Fragment {

    private ArrayList<Mascota> mascotas;
    private RecyclerView Lista_mascotas;

    public RecyclerViewFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_recyclerview, container, false);

        Lista_mascotas = (RecyclerView) v.findViewById(R.id.rv_Mascotas);

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());

        llm.setOrientation(LinearLayoutManager.VERTICAL);

        Lista_mascotas.setLayoutManager(llm);

        InicializarListaMacotas();
        InicializarContactoAdaptador();

        return v;
    }


    public void InicializarContactoAdaptador(){
        Mascota_Adaptador adaptador = new Mascota_Adaptador(mascotas);
        Lista_mascotas.setAdapter(adaptador);
    }

    public void InicializarListaMacotas(){

        mascotas = new ArrayList<Mascota>();

        mascotas.add(new Mascota("Tonny",R.drawable.perro1,0));
        mascotas.add(new Mascota("Simon",R.drawable.perro2,5));
        mascotas.add(new Mascota("Matty",R.drawable.perro3,0));
        mascotas.add(new Mascota("Lucas",R.drawable.perro4,4));
        mascotas.add(new Mascota("Ronny",R.drawable.perro5,3));

    }

}
