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
    private TextView nomeAnimal;
    private TextView tipoAnimal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swipe);

        btnEscolher = (Button) findViewById(R.id.btnEscolher);
        List <database> listaPets;

        btnEscolher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent intent = new Intent(SwipeActivity.this, GuiaConsulta.class);
                startActivity(intent);
            }

            public void onChildAdded(@NonNull DataSnapshot dataSnapshot,Nullable String s){

                List listaPets = new listaPets();
                listapets.setNome(dataSnapshot.child("nome").getValue(String.class));
                List.add(listaPets);
            }
        }
        });


       layout.setOnTouchListener( new OnSwipeTouchListener(this){


         public void onSwipeRight(){
            super.onSwipeRight();


        }
         public void onSwipeLeft(){
            super.onSwipeLeft();


         }


    }
}
}