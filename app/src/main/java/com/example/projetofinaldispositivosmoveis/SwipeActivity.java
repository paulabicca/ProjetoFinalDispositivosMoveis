package com.example.projetofinaldispositivosmoveis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SwipeActivity extends AppCompatActivity {

    //layoutSwipe Linearlayout;
    private Button btnEscolher;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swipe);

        btnEscolher = (Button) findViewById(R.id.btnEscolher);

        btnEscolher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // Intent intent = new Intent(SwipeActivity.this, GuiaConsulta.class);
                //startActivity(intent);
            }
        });
    }
}
