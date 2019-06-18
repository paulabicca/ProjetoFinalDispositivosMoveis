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
        nomeAnimal = (TextView) findViewById(R.id.tvNome);
        tipoAnimal = (TextView) findViewById(R.id.tvTipoAnimal);


        btnEscolher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent intent = new Intent(SwipeActivity.this, GuiaConsulta.class);
                startActivity(intent);
            }
        });

        /*n = nomeAnimal.lenght();
        t= tipoAnimal.lenght();
        contador=0;*/
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