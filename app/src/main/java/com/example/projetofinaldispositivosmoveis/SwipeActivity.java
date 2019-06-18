package com.example.projetofinaldispositivosmoveis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SwipeActivity extends AppCompatActivity {

    //layoutSwipe Linearlayout;
    private Button btnEscolher;
    private String nomeAnimal;
    private String tipoAnimal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swipe);

        btnEscolher = (Button) findViewById(R.id.btnEscolher);
        nomeAnimal = (String) findViewById(R.id.nomeAnimal);
        tipoAnimal = (String) findViewById(R.id.tipoAnimal);
       // layout = LinearLayout findViewById(R.id.layout);


        btnEscolher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent intent = new Intent(SwipeActivity.this, GuiaConsulta.class);
                startActivity(intent);
            }
        });

        n = nomeAnimal.lenght();
        t= tipoAnimal.lenght();
        contador=0;
      //  layout.setOnTouchListener( new OnSwipeTouchListener(this){


         //public void onSwipeRight(){
          //  super.onSwipeRight();
          //   for (contador = 0;contador< n;contador++){
          //       for (contador=0;contador<t;contador++)
           //  }
//
      //  }
     //    public void onSwipeLeft(){
         //    super.onSwipeLeft();
           //  for (contador = 0;contador< n;contador++){
             //    for (contador=0;contador<t;contador++)
           //  }

         }


    }
//}
//}