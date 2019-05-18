package com.example.hakim.tourist_guideapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Sahiwalresturents extends AppCompatActivity {
  Button btnanyarestswl,btnfazlehaqdera,btnflora,btnking,btnmerab,btnsunehri,btnusmania;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_sahiwalresturents);
        btnanyarestswl=findViewById (R.id.anaya);
        btnfazlehaqdera=findViewById (R.id.fazlehaqdera);
        btnflora=findViewById (R.id.flora);
        btnking=findViewById (R.id.king);
        btnmerab=findViewById (R.id.meraab);
        btnsunehri=findViewById (R.id.sunheri);
        btnusmania=findViewById (R.id.usmania);


        btnanyarestswl.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intentanayrestswl=new Intent (Sahiwalresturents.this,Anayarestswl.class);
                startActivity (intentanayrestswl);
            }
        });
        btnfazlehaqdera.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intentfazleyrestswl=new Intent (Sahiwalresturents.this,Fazlehaqderarestswl.class);
                startActivity (intentfazleyrestswl);
            }
        });
        btnflora.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intentflorarestswl=new Intent (Sahiwalresturents.this,Florarestswl.class);
                startActivity (intentflorarestswl);
            }
        });
        btnking.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intentkingrestswl=new Intent (Sahiwalresturents.this,Kingrestswl.class);
                startActivity (intentkingrestswl);
            }
        });
        btnmerab.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intentanayrestswl=new Intent (Sahiwalresturents.this,Merabrestswl.class);
                startActivity (intentanayrestswl);
            }
        });
        btnsunehri.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intentsunrestswl=new Intent (Sahiwalresturents.this,Sunehrirestswl.class);
                startActivity (intentsunrestswl);
            }
        });
        btnusmania.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intentusmaniarestswl=new Intent (Sahiwalresturents.this,Usmaniarestswl.class);
                startActivity (intentusmaniarestswl);
            }
        });

    }
}
