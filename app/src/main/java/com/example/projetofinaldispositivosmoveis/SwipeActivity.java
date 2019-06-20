package com.example.projetofinaldispositivosmoveis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SwipeActivity extends AppCompatActivity {

    //layoutSwipe Linearlayout;
    private Button btnEscolher;
    private TextView NomeAnimal;
    private TextView TipoAnimal;
    private int contador = 0;
    private Linearlayout layoutSwipe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swipe);
        NomeAnimal = (TextView) findViewById(R.id.tvNomeAnimal);
        TipoAnimal = (TextView) findViewById(R.id.tvTipoAnimal);
        layoutSwipe = (Linearlayout) findViewById(R.id.IDDOCARANOXML);
        btnEscolher = (Button) findViewById(R.id.btnEscolher);
        final List <database> listaPets;

        btnEscolher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent intent = new Intent(SwipeActivity.this, GuiaConsulta.class);
                startActivity(intent);
            }

            public void onChildAdded(@NonNull DataSnapshot dataSnapshot,Nullable String s){

                List listaPets = new listaPets();
                listapets.setNomeAnimal(dataSnapshot.child("nome").getValue(String.class));
                List.add(listaPets);
                listaPets.setTipoAnimal(dataSnapshot.child("tipo").getValue(String.class));
                List.add(listaPets);
            }
        }
                tvNomeAnimal.setText(listaPets[contador]);
                tvTipoAnimal.setText(listaPets[contador]);
                layoutSwipe.setOnTouchListener( new OnSwipeTouchListener(this){


                    public void onSwipeRight() {
                        super.onSwipeRight();
                        contador ++;
                        if (contador >= listaPets[contador].length);{
                            contador = 0;
                        }

                        tvNomeAnimal.setText(listaPets[contador]);
                        tvTipoAnimal.setText(listaPets[contador]);
                    }

                    public void onSwipeLeft(){
                        super.onSwipeLeft();
                            contador --;
                            if (contador <0){
                                contador = listaPets[contador].length-1;
                            }
                            tvNomeAnimal.setText(listaPets[contador]);
                            tvTipoAnimal.setText(listaPets[contador]);
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