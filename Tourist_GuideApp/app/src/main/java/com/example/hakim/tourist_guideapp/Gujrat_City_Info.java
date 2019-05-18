package com.example.hakim.tourist_guideapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Gujrat_City_Info extends AppCompatActivity {
Button btngujratrest,btngujratparks,btngujratoldplaces;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_gujrat__city__info);
        btngujratrest=findViewById (R.id.gujrat_Resturents);
        btngujratparks=findViewById (R.id.gujrat_parks);
        btngujratoldplaces=findViewById (R.id.gujrat_places);
        btngujratrest.setOnClickListener (new View.OnClickListener () {
           @Override
           public void onClick(View v) {
               Intent intentgurtrest=new Intent (Gujrat_City_Info.this,Gujrat_Resturents.class);
               startActivity (intentgurtrest);
           }
       });
             btngujratparks.setOnClickListener (new View.OnClickListener () {
          @Override
            public void onClick(View v) {
               Intent intentgurtpark=new Intent (Gujrat_City_Info.this,Gujraat_Parks.class);
               startActivity (intentgurtpark);
           }     });
        btngujratoldplaces.setOnClickListener (new View.OnClickListener () {
           @Override
            public void onClick(View v) {
               Intent intentgurtoldplace=new Intent (Gujrat_City_Info.this,Gujrat_Old_Places.class);
                startActivity (intentgurtoldplace);
           }
       });
    }
}
