package com.example.projetofinaldispositivosmoveis;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;

import java.util.ArrayList;
import java.util.List;

public class ListaGuias extends AppCompatActivity {

    ListView lvLista;
    List<Guia> listaGuia;

    AdapterGuia guiaAdapter;


    private FirebaseDatabase database;
    private DatabaseReference reference,referenceDelete;
    private Query query;
    private ChildEventListener childEventListener;

    @Override
    protected void onStart() {
        super.onStart();

        listaGuia.clear();

        database = FirebaseDatabase.getInstance();
        reference = database.getReference();
        query = reference.child("guias").orderByChild("nomeAnimal");

        childEventListener = new ChildEventListener() {
            @Override
            public void onChildAdded(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {
                Guia novasguias = new Guia();
                novasguias.setIdAnimal(dataSnapshot.getKey());
                novasguias.setNomeAnimal(dataSnapshot.child("nomeAnimal").getValue(String.class));
                novasguias.setTipoAnimal(dataSnapshot.child("tipoAnimal").getValue(String.class));
                listaGuia.add( novasguias );
                guiaAdapter.notifyDataSetChanged();
            }

            @Override
            public void onChildChanged(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

            }

            @Override
            public void onChildRemoved(@NonNull DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        };
        query.addChildEventListener( childEventListener );

    }


    @Override
    protected void onStop() {
        super.onStop();
        query.removeEventListener( childEventListener );
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_guias);

        lvLista = (ListView) findViewById(R.id.lvListaGuia);

        listaGuia = new ArrayList<>();

        carregarLista();

        lvLista.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener(){
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, final int position, long id) {
                final Guia guiaSelecionada = listaGuia.get(position);
                AlertDialog.Builder alerta =
                        new AlertDialog.Builder(ListaGuias.this);
                alerta.setTitle("Exclusão");
                alerta.setMessage("Deseja excluir a guia de " +
                        guiaSelecionada.getNomeAnimal() + "?");
                alerta.setPositiveButton("Sim", new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Guia nguias = listaGuia.get(position);
                        deletarGuia(nguias.getIdAnimal());
                        carregarLista();
                    }
                });
                alerta.setNeutralButton("Cancelar", null);
                alerta.show();
                return true;
            }
        });

        lvLista.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                final Guia guiaSelecionada = listaGuia.get(position);
                AlertDialog.Builder alerta =
                        new AlertDialog.Builder(ListaGuias.this);
                alerta.setTitle("Edição");
                alerta.setMessage("Deseja editar a guia de " +
                        guiaSelecionada.getNomeAnimal() + "?");
                alerta.setPositiveButton("Sim", new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(ListaGuias.this, GuiaConsulta.class);
                        startActivity(intent);
                    }
                });
                alerta.setNeutralButton("Cancelar", null);
                alerta.show();

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }


    private void carregarLista(){
        guiaAdapter = new AdapterGuia(this, listaGuia);
        lvLista.setAdapter(guiaAdapter);
    }

   private boolean deletarGuia(String id){
       DatabaseReference dR = FirebaseDatabase.getInstance().getReference("guias").child(id);
       dR.removeValue();
       Toast.makeText(getApplicationContext(), "Guia deletada", Toast.LENGTH_LONG).show();
        return true;

   }

    @Override
    protected void onResume() {
        super.onResume();

    }


}