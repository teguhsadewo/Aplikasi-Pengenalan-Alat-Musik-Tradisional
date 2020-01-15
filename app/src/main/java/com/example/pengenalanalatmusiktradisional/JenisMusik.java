package com.example.pengenalanalatmusiktradisional;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class JenisMusik extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jenis_musik);
        Button btn = (Button) findViewById(R.id.tiup);
        Button btn2 = (Button) findViewById(R.id.gesek);
        Button btn3 = (Button) findViewById(R.id.pukul);
        Button btn4 = (Button) findViewById(R.id.petik);
        btn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent i = new Intent(JenisMusik.this,H_M_Tiup.class);
                startActivity(i);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent i = new Intent(JenisMusik.this,H_M_Gesek.class);
                startActivity(i);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent i = new Intent(JenisMusik.this,H_M_Pukul.class);
                startActivity(i);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent i = new Intent(JenisMusik.this,H_M_Petik.class);
                startActivity(i);
            }
        });
    }

}
