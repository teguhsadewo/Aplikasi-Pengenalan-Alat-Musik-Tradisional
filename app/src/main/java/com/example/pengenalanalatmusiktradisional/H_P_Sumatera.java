package com.example.pengenalanalatmusiktradisional;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class H_P_Sumatera extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_h__p__sumatera);
        Button btn1 = (Button) findViewById(R.id.rumahadat1);
        Button btn2 = (Button) findViewById(R.id.rumahadat2);
        Button btn3 = (Button) findViewById(R.id.rumahadat3);
        Button btn4 = (Button) findViewById(R.id.rumahadat4);
        Button btn5 = (Button) findViewById(R.id.rumahadat5);
        Button btn6 = (Button) findViewById(R.id.rumahadat6);
        Button btn7 = (Button) findViewById(R.id.rumahadat7);
        Button btn8 = (Button) findViewById(R.id.rumahadat8);
        Button btn9 = (Button) findViewById(R.id.rumahadat9);
        Button btn10 = (Button) findViewById(R.id.rumahadat10);

        btn1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent i = new Intent(H_P_Sumatera.this,HD_RA_Sumatera1.class);
                startActivity(i);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent i = new Intent(H_P_Sumatera.this,HD_RA_Sumatera2.class);
                startActivity(i);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent i = new Intent(H_P_Sumatera.this,HD_RA_Sumatera3.class);
                startActivity(i);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent i = new Intent(H_P_Sumatera.this,HD_RA_Sumatera4.class);
                startActivity(i);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent i = new Intent(H_P_Sumatera.this,HD_RA_Sumatera5.class);
                startActivity(i);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent i = new Intent(H_P_Sumatera.this,HD_RA_Sumatera6.class);
                startActivity(i);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent i = new Intent(H_P_Sumatera.this,HD_RA_Sumatera7.class);
                startActivity(i);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent i = new Intent(H_P_Sumatera.this,HD_RA_Sumatera8.class);
                startActivity(i);
            }
        });
        btn9.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent i = new Intent(H_P_Sumatera.this,HD_RA_Sumatera9.class);
                startActivity(i);
            }
        });
        btn10.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent i = new Intent(H_P_Sumatera.this,HD_RA_Sumatera10.class);
                startActivity(i);
            }
        });
    }
}
