package com.example.projetofinaldispositivosmoveis;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;

import java.util.List;

public class SwipeActivity extends AppCompatActivity {

    private Button btnEscolher;
    private TextView NomeAnimal;
    private TextView TipoAnimal;
    private int contador = 0;
    private LinearLayout layoutSwipe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swipe);
        NomeAnimal = (TextView) findViewById(R.id.tvNomeAnimal);
        TipoAnimal = (TextView) findViewById(R.id.tvTipoAnimal);
        layoutSwipe = (LinearLayout) findViewById(R.id.layoutSwipe);
        btnEscolher = (Button) findViewById(R.id.btnEscolher);
        final List<database> listaPets;

        btnEscolher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent intent = new Intent(SwipeActivity.this, GuiaConsulta.class);
                startActivity(intent);
            }

            public void onChildAdded(@NonNull DataSnapshot dataSnapshot, Nullable String s){

                Guia nomeAnimal = new Guia();
                Guia tipoAnimal = new Guia();
                nomeAnimal.setNomeAnimal(dataSnapshot.child("nome").getValue(String.class));
                listaPets.add(nomeAnimal);
                tipoAnimal.setTipoAnimal(dataSnapshot.child("tipo").getValue(String.class));
                listaPets.add(tipoAnimal);
            }
        }
                NomeAnimal.setText(listaPets[contador]);
                TipoAnimal.setText(listaPets[contador]);
                layoutSwipe.setOnTouchListener( new OnSwipeTouchListener(this){


                    public void onSwipeRight() {
                        super.onSwipeRight();
                        contador ++;
                        if (contador >= listaPets[contador].length);{
                            contador = 0;
                        }

                        NomeAnimal.setText(listaPets[contador]);
                        TipoAnimal.setText(listaPets[contador]);
                    }

                    public void onSwipeLeft(){
                        super.onSwipeLeft();
                            contador --;
                            if (contador <0){
                                contador = listaPets[contador].length-1;
                            }
                            NomeAnimal.setText(listaPets[contador]);
                            TipoAnimal.setText(listaPets[contador]);
                    }

                    @Override
                    public void onSwipeTop() {
                        super.onSwipeTop();
                    }

                    @Override
                    public void onSwipeBottom() {
                        super.onSwipeBottom();
                    }












    });

}
}