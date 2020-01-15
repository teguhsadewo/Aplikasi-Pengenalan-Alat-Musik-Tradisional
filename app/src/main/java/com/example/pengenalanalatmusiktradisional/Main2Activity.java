package com.example.pengenalanalatmusiktradisional;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button btn = (Button) findViewById(R.id.buttonjenis);
        Button btn2 = (Button) findViewById(R.id.about);
        Button btn3 = (Button) findViewById(R.id.buttonrumah);
        Button btn4 = (Button) findViewById(R.id.lagudaerah);
        btn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main2Activity.this,JenisMusik.class);
                startActivity(i);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main2Activity.this,HalamanAbout.class);
                startActivity(i);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main2Activity.this,H_Rumah_Adat.class);
                startActivity(i);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main2Activity.this,H_Lagu_Daerah.class);
                startActivity(i);
            }
        });


    }

}
