package com.example.hakim.tourist_guideapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Lahore_City_Info extends AppCompatActivity {
   Button btnlhrrestu,btnlahoreparks,btnlahoreplaces;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_lahore__city__info);
        btnlhrrestu=findViewById (R.id.lahore_Resturents);
        btnlahoreparks=findViewById (R.id.lahore_parks);
        btnlahoreplaces=findViewById (R.id.lahore_places);

        btnlhrrestu.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intentlahorerestu=new Intent (Lahore_City_Info.this,Lahoreresturents.class);
                startActivity (intentlahorerestu);
            }
        });

        btnlahoreparks.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intentlahoreparks=new Intent (Lahore_City_Info.this,Lahore_Parks.class);
                startActivity (intentlahoreparks);
            }
        });

        btnlahoreplaces.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intentlahoreplace=new Intent (Lahore_City_Info.this,Lahore_Places.class);
                startActivity (intentlahoreplace);
            }
        });
    }
}
