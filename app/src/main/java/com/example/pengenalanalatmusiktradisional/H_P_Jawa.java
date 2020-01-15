package com.example.pengenalanalatmusiktradisional;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class H_P_Jawa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_h__p__jawa);

        Button btn1 = (Button) findViewById(R.id.rumahadat1);
        Button btn2 = (Button) findViewById(R.id.rumahadat2);
        Button btn3 = (Button) findViewById(R.id.rumahadat3);
        Button btn4 = (Button) findViewById(R.id.rumahadat4);
        Button btn5 = (Button) findViewById(R.id.rumahadat5);
        Button btn6 = (Button) findViewById(R.id.rumahadat6);


        btn1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent i = new Intent(H_P_Jawa.this,HD_RA_Jawa1.class);
                startActivity(i);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent i = new Intent(H_P_Jawa.this,HD_RA_Jawa2.class);
                startActivity(i);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent i = new Intent(H_P_Jawa.this,HD_RA_Jawa3.class);
                startActivity(i);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent i = new Intent(H_P_Jawa.this,HD_RA_Jawa4.class);
                startActivity(i);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent i = new Intent(H_P_Jawa.this,HD_RA_Jawa5.class);
                startActivity(i);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent i = new Intent(H_P_Jawa.this,HD_RA_Jawa6.class);
                startActivity(i);
            }
        });
    }
}
