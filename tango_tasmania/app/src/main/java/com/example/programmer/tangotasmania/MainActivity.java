package com.example.programmer.tangotasmania;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    Spinner listaDeOpciones;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaDeOpciones=(Spinner) findViewById(R.id.mySpinner);
        ArrayAdapter<CharSequence> Adaptador=ArrayAdapter.createFromResource(this,R.array.Opciones,android.R.layout.simple_spinner_item);
        listaDeOpciones.setAdapter(Adaptador);
    }
}
