package com.example.pengenalanalatmusiktradisional;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class H_M_Gesek extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_h__m__gesek);

        Button btn =   (Button) findViewById(R.id.gesek1);
        Button btn2 =  (Button) findViewById(R.id.gesek2);
        Button btn3 =  (Button) findViewById(R.id.gesek3);


        btn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent i = new Intent(H_M_Gesek.this,HD_M_Gesek1.class);
                startActivity(i);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent i = new Intent(H_M_Gesek.this,HD_M_Gesek2.class);
                startActivity(i);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent i = new Intent(H_M_Gesek.this,HD_M_Gesek3.class);
                startActivity(i);
            }
        });

    }
}
