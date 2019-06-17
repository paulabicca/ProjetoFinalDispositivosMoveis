package com.example.projetofinaldispositivosmoveis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class GuiaConsulta extends AppCompatActivity {

    private EditText etNomeAnimalConsulta, etDonoAnimalConsulta, etIdadeAnimal2Consulta, etTelefoneConsulta, etPesoConsulta, etRacaConsulta, etTipoAnimalConsulta, etInformacoesConsulta;
    private Button btEditar;
    private ImageButton btFavoritoConsulta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guia_consulta);

        /*etNomeAnimalConsulta = (EditText) findViewById(R.id.etNomeAnimalConsulta);
        etDonoAnimalConsulta = (EditText) findViewById(R.id.etDonoAnimalConsulta);
        etIdadeAnimal2Consulta = (EditText) findViewById(R.id.etIdadeAnimal2Consulta);
        etTelefoneConsulta = (EditText) findViewById(R.id.etTelefoneConsulta);
        etPesoConsulta = (EditText) findViewById(R.id.etPesoConsulta);
        etRacaConsulta = (EditText) findViewById(R.id.etRacaConsulta);
        etTipoAnimalConsulta = (EditText) findViewById(R.id.etTipoAnimalConsulta);
        etInformacoesConsulta = (EditText) findViewById(R.id.etInformacoesConsulta);
        btEditar = (Button) findViewById(R.id.btEditar);
        btFavoritoConsulta = (ImageButton) findViewById(R.id.btFavoritoConsulta);

        btEditar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick() {
                Intent intent = new Intent(GuiaConsulta.this, EdicaoCadastro.class);
                startActivity(intent);
            }
        });*/
    }
}
