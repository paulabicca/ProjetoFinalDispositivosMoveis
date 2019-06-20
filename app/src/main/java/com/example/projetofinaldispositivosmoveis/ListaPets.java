package com.example.projetofinaldispositivosmoveis;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ListaPets extends AppCompatActivity {


    ListView lvListaPets
    List<Guia> lista;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_pets);
    }
}
