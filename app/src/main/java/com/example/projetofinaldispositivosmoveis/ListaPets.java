package com.example.projetofinaldispositivosmoveis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.List;

public class ListaPets extends AppCompatActivity {


    ListView lvListaPets;
    List<Guia> lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_pets);
    }

   lvListaPets = (ListView) findViewById(R.id.lvListaPets);

    lvListaPets.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(ListaPets.this, GuiaConsulta.class);
            startActivity(intent);

        }
    });
    }
}
