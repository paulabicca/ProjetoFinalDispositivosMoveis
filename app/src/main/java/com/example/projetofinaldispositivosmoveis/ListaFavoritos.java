package com.example.projeto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.List;

public class ListaFavoritos extends AppCompatActivity {

    ListView lvLista;
    List<Guia> lista;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_favoritos);
    }

    lvLista = (ListView) findViewById(R.id.lvFavoritos);


    /*adaptar codigo para inserir as informações do firebase
    lvLista.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
        @Override
        public boolean onItemLongClick(AdapterView<?> parent, View view, final int position, long id) {

            final Guia guiaSelecionado = lista.get(position);
            AlertDialog.Builder alerta =
                    new AlertDialog.Builder(ListaFavoritos.this);
            alerta.setTitle("Excluir Guia...");
            alerta.setMessage("Confirma a exclusão da Guia " +
                    guiaSelecionado.getTitulo() + "?");
            alerta.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    AnotacaoDAO.excluir(guiaSelecionado.getId(),
                            ListaFavoritos.this);
                    carregarLista();

                    //     lista.remove( position);
                    //     adapter.notifyDataSetChanged();

                }
            });

            private void carregarLista(){
            }*/

        @Override
        protected void onResume() {
            super.onResume();
            carregarLista();
        }

}
