package com.example.projetofinaldispositivosmoveis;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class EdicaoCadastro extends AppCompatActivity {

    private EditText etNomeAnimalEdicao, etDonoAnimalEdicao, etIdadeAnimal2Edicao, etTelefoneEdicao, etPesoEdicao, etRacaEdicao, etTipoAnimalEdicao, etInformacoesEdicao;
    private Button btSalvarEdicao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edicao_cadastro);

        etNomeAnimalEdicao = (EditText) findViewById(R.id.etNomeAnimalEdicao);
        etDonoAnimalEdicao = (EditText) findViewById(R.id.etDonoAnimalEdicao);
        etIdadeAnimal2Edicao = (EditText) findViewById(R.id.etIdadeAnimal2Edicao);
        etTelefoneEdicao = (EditText) findViewById(R.id.etTelefoneEdicao);
        etPesoEdicao = (EditText) findViewById(R.id.etPesoEdicao);
        etRacaEdicao = (EditText) findViewById(R.id.etRacaEdicao);
        etTipoAnimalEdicao = (EditText) findViewById(R.id.etTipoAnimalEdicao);
        etInformacoesEdicao = (EditText) findViewById(R.id.etInformacoesEdicao);
        btSalvarEdicao = (Button) findViewById(R.id.btSalvarEdicao);
    }

    /*btSalvarEdicao.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            salvar();
        }
    });*/

    private void salvar(){
        String nomeAnimalEdicao = etNomeAnimalEdicao.getText().toString();
        String donoAnimalEdicao = etDonoAnimalEdicao.getText().toString();
        String idadeAnimalEdicao = etIdadeAnimal2Edicao.getText().toString();
        String telefoneEdicao = etTelefoneEdicao.getText().toString();
        String pesoEdicao = etPesoEdicao.getText().toString();
        String racaEdicao = etRacaEdicao.getText().toString();
        String tipoAnimalEdicao = etTipoAnimalEdicao.getText().toString();
        String informacoesEdicao = etInformacoesEdicao.getText().toString();
    }
}
