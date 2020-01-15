package com.example.pengenalanalatmusiktradisional;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class H_M_Petik extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_h__m__petik);

        Button btn =   (Button) findViewById(R.id.petik1);
        Button btn2 =  (Button) findViewById(R.id.petik2);
        Button btn3 =  (Button) findViewById(R.id.petik3);
        Button btn4 =  (Button) findViewById(R.id.petik4);
        Button btn5 =  (Button) findViewById(R.id.petik5);
        Button btn6 =  (Button) findViewById(R.id.petik6);
        Button btn7 =  (Button) findViewById(R.id.petik7);
        Button btn8 =  (Button) findViewById(R.id.petik8);

        btn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent i = new Intent(H_M_Petik.this,HD_M_Petik1.class);
                startActivity(i);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent i = new Intent(H_M_Petik.this,HD_M_Petik2.class);
                startActivity(i);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent i = new Intent(H_M_Petik.this,HD_M_Petik3.class);
                startActivity(i);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent i = new Intent(H_M_Petik.this,HD_M_Petik4.class);
                startActivity(i);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent i = new Intent(H_M_Petik.this,HD_M_Petik5.class);
                startActivity(i);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent i = new Intent(H_M_Petik.this,HD_M_Petik6.class);
                startActivity(i);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent i = new Intent(H_M_Petik.this,HD_M_Petik7.class);
                startActivity(i);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent i = new Intent(H_M_Petik.this,HD_M_Petik8.class);
                startActivity(i);
            }
        });

    }
}
