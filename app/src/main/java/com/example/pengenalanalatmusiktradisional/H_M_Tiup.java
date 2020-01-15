package com.example.pengenalanalatmusiktradisional;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class H_M_Tiup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_h__m__tiup);

        Button btn =   (Button) findViewById(R.id.tiup1);
        Button btn2 =  (Button) findViewById(R.id.tiup2);
        Button btn3 =  (Button) findViewById(R.id.tiup3);
        Button btn4 =  (Button) findViewById(R.id.tiup4);
        Button btn5 =  (Button) findViewById(R.id.tiup5);
        Button btn6 =  (Button) findViewById(R.id.tiup6);
        Button btn7 =  (Button) findViewById(R.id.tiup7);
        Button btn8 =  (Button) findViewById(R.id.tiup8);
        Button btn9=   (Button) findViewById(R.id.tiup9);
        Button btn10 = (Button) findViewById(R.id.tiup10);

        btn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent i = new Intent(H_M_Tiup.this,HD_M_Tiup1.class);
                startActivity(i);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent i = new Intent(H_M_Tiup.this,HD_M_Tiup2.class);
                startActivity(i);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent i = new Intent(H_M_Tiup.this,HD_M_Tiup3.class);
                startActivity(i);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent i = new Intent(H_M_Tiup.this,HD_M_Tiup4.class);
                startActivity(i);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent i = new Intent(H_M_Tiup.this,HD_M_Tiup5.class);
                startActivity(i);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent i = new Intent(H_M_Tiup.this,HD_M_Tiup6.class);
                startActivity(i);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent i = new Intent(H_M_Tiup.this,HD_M_Tiup7.class);
                startActivity(i);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent i = new Intent(H_M_Tiup.this,HD_M_Tiup8.class);
                startActivity(i);
            }
        });
        btn9.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent i = new Intent(H_M_Tiup.this,HD_M_Tiup9.class);
                startActivity(i);
            }
        });
        btn10.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent i = new Intent(H_M_Tiup.this,HD_M_Tiup10.class);
                startActivity(i);
            }
        });

    }
}
