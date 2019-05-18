package com.example.hakim.tourist_guideapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Multan_City_Info extends AppCompatActivity {
Button btnmultanrestu,btnmultanparks,getBtnmultanplaces;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_multan__city__info);
        btnmultanrestu=findViewById (R.id.multan_Resturents);
        btnmultanparks=findViewById (R.id.multan_parks);
        getBtnmultanplaces=findViewById (R.id.multan_places);
        btnmultanrestu.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intentrestu=new Intent (Multan_City_Info.this,Multanresturents.class);
                startActivity (intentrestu);
            }
        });
        btnmultanparks.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intentmultparks=new Intent (Multan_City_Info.this,Multan_Parks.class);
                startActivity (intentmultparks);
            }
        });
        getBtnmultanplaces.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intentmultanplaces=new Intent (Multan_City_Info.this,Mutan_Old_Places.class);
                startActivity (intentmultanplaces);
            }
        });
    }
}
