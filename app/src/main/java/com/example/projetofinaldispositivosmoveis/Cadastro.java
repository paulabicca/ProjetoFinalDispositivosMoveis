package com.example.projetofinaldispositivosmoveis;

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
    private Button btSalvar;


    private FirebaseDatabase database;
    private DatabaseReference reference;

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
        if(etNomeAnimal.length() == 0 || etDonoAnimal.length() == 0 ||  etIdadeAnimal2.length() == 0 ||
                etTelefone.length() == 0  ||  etPeso.length()== 0 ||  etRaca.length() == 0 || etTipoAnimal.length() == 0 ||
                etInformacoes.length() == 0){
            Toast.makeText(this, "Você precisa preencher todos os campos!", Toast.LENGTH_LONG).show();
        }else{
            limparCampos();
            Toast.makeText(this, "Campos preenchidos", Toast.LENGTH_SHORT).show();
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
