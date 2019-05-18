package com.example.hakim.tourist_guideapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Sahiwal_City_Info extends AppCompatActivity {
      Button btnswlresturentss,btnswlparks,btnoldplaces;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_sahiwal__city__info);
        btnswlresturentss=findViewById (R.id.sahiwal_Resturents);
        btnswlparks=findViewById (R.id.sahiwal_parks);
        btnoldplaces=findViewById (R.id.sahiwal_places);
        btnswlresturentss.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intentswlrestuswl=new Intent (Sahiwal_City_Info.this,Sahiwalresturents.class);
                startActivity (intentswlrestuswl);
            }
        });

        btnswlparks.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intentswlparks=new Intent (Sahiwal_City_Info.this,Sahiwalparks.class);
                startActivity (intentswlparks);
            }
        });
        btnoldplaces.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intentoldplace=new Intent (Sahiwal_City_Info.this,Sahiwal_Old_Places.class);
                startActivity (intentoldplace);
            }
        });

    }
}
