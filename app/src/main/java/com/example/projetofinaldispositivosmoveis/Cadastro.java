package com.example.projetofinaldispositivosmoveis;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Cadastro extends AppCompatActivity {

    private EditText etNomeAnimal, etDonoAnimal, etIdadeAnimal2, etTelefone, etPeso, etRaca, etTipoAnimal, etInformacoes;
    private Button btSalvar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        etNomeAnimal = (EditText) findViewById(R.id.etNomeAnimal);
        etDonoAnimal = (EditText) findViewById(R.id.etDonoAnimal);
        etIdadeAnimal2 = (EditText) findViewById(R.id.etIdadeAnimal2);
        etTelefone = (EditText) findViewById(R.id.etTelefone);
        etPeso = (EditText) findViewById(R.id.etPeso);
        etRaca = (EditText) findViewById(R.id.etRaca);
        etTipoAnimal = (EditText) findViewById(R.id.etTipoAnimal);
        etInformacoes = (EditText) findViewById(R.id.etInformacoes);
        btSalvar = (Button) findViewById(R.id.btSalvar);

        btSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                salvar();
            }
        });

    }

    private void salvar(){
        String nomeAnimal = etNomeAnimal.getText().toString();
        String donoAnimal = etDonoAnimal.getText().toString();
        String idadeAnimal = etIdadeAnimal2.getText().toString();
        String telefone = etTelefone.getText().toString();
        String peso = etPeso.getText().toString();
        String raca = etRaca.getText().toString();
        String tipoAnimal = etTipoAnimal.getText().toString();
        String informacoes = etInformacoes.getText().toString();
    }


}
