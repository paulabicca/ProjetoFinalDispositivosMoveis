package com.example.projetofinaldispositivosmoveis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Cadastro extends AppCompatActivity {

    private EditText etNomeAnimal, etDonoAnimal, etIdadeAnimal2, etTelefone, etPeso, etRaca, etTipoAnimal, etInformacoes;
    private Button btnSalvar;

    private DatabaseReference databaseGuia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        etNomeAnimal = (EditText) findViewById(R.id.etNomeAnimal);
        etDonoAnimal = (EditText) findViewById(R.id.etDonoAnimal);
        etIdadeAnimal2 = (EditText) findViewById(R.id.etIdadeAnimal);
        etTelefone = (EditText) findViewById(R.id.etTelefone);
        etPeso = (EditText) findViewById(R.id.etPeso);
        etRaca = (EditText) findViewById(R.id.etRaca);
        etTipoAnimal = (EditText) findViewById(R.id.etTipoAnimal);
        etInformacoes = (EditText) findViewById(R.id.etInformacoes);
        btnSalvar = (Button) findViewById(R.id.btnSalvar);
        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                salvar();
            }
        });
    }

    private void salvar(){
        if(etNomeAnimal.length() == 0 || etDonoAnimal.length() == 0 ||  etIdadeAnimal2.length() == 0 ||
                etTelefone.length() == 0  ||  etPeso.length()== 0 ||  etRaca.length() == 0 || etTipoAnimal.length() == 0 ||
                etInformacoes.length() == 0){
            Toast.makeText(this, "Você precisa preencher todos os campos!", Toast.LENGTH_LONG).show();
        }else{
            databaseGuia = FirebaseDatabase.getInstance().getReference("guias");
            String nomeAnimal = etNomeAnimal.getText().toString().trim();
            String donoAnimal = etDonoAnimal.getText().toString().trim();
            String idadeAnimal = etIdadeAnimal2.getText().toString().trim();
            String telefoneDono = etTelefone.getText().toString().trim();
            String pesoAnimal = etPeso.getText().toString().trim();
            String racaAnimal = etRaca.getText().toString().trim();
            String tipoAnimal = etTipoAnimal.getText().toString().trim();
            String observacaoAnimal =etInformacoes.getText().toString().trim();
            String id = databaseGuia.push().getKey();
            Guia guia = new Guia(id,nomeAnimal,donoAnimal,idadeAnimal, telefoneDono, pesoAnimal, racaAnimal,
                    tipoAnimal, observacaoAnimal);
            databaseGuia.child(id).setValue(guia);
            limparCampos();
            Toast.makeText(this, "Dados salvos com sucesso!", Toast.LENGTH_SHORT).show();
              Intent intent = new Intent(Cadastro.this, ListaGuias.class);
            startActivity(intent);
        }
    }
    private void limparCampos(){
        etNomeAnimal.setText("");
        etDonoAnimal.setText("");
        etIdadeAnimal2.setText("");
        etTelefone.setText("");
        etPeso.setText("");
        etRaca.setText("");
        etTipoAnimal.setText("");
        etInformacoes.setText("");
    }

}
