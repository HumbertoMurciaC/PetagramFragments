package com.example.humbertomariom.petagram;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.EditText;

public class ActivityDesarrollador extends AppCompatActivity {

    EditText Et_Nombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_desarrollador);

        Toolbar miActionBar = (Toolbar) findViewById(R.id.action_bar2);
        setSupportActionBar(miActionBar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        Et_Nombre = (EditText) findViewById(R.id.etNombre);


    }
}
