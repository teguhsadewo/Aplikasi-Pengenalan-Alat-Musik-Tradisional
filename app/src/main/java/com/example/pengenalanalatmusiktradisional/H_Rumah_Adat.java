package com.example.pengenalanalatmusiktradisional;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class H_Rumah_Adat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_h__rumah__adat);
        Button btn = (Button) findViewById(R.id.pulausumatera);
        Button btn1 = (Button) findViewById(R.id.pulaujawa);

        btn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent i = new Intent(H_Rumah_Adat.this,H_P_Sumatera.class);
                startActivity(i);
            }
        });
        btn1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent i = new Intent(H_Rumah_Adat.this,H_P_Jawa.class);
                startActivity(i);
            }
        });
    }
}
