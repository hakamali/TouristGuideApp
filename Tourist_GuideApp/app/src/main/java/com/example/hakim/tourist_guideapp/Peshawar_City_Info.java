package com.example.hakim.tourist_guideapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Peshawar_City_Info extends AppCompatActivity {
   Button btnrestupesh,btnparkspeshawar,btnplacespeshawar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_peshawar__city__info);
        btnrestupesh=findViewById (R.id.peshawar_Resturents);
        btnparkspeshawar=findViewById (R.id.peshawar_parks);
        btnplacespeshawar=findViewById (R.id.peshawar_places);

        btnrestupesh.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intentpeshawarrestu=new Intent (Peshawar_City_Info.this,Peshawarresturents.class);
                startActivity (intentpeshawarrestu);
            }
        });
        btnparkspeshawar.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intentpeshawarparks=new Intent (Peshawar_City_Info.this,Peshawar_Parks.class);
                startActivity (intentpeshawarparks);
            }
        });
        btnplacespeshawar.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intentpeshawrplace=new Intent (Peshawar_City_Info.this,Peshawar_Old_Places.class);
                startActivity (intentpeshawrplace);
            }
        });
    }
}
