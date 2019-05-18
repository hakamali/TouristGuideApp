package com.example.hakim.tourist_guideapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Cities extends AppCompatActivity {
    TextView txtSahiwal,txtgujrat,txtislambad,txtpeshawar,txtmultan,txtlahore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_cities);
        txtSahiwal = findViewById (R.id.txt_sahiwal);
        txtgujrat=findViewById (R.id.txt_gujrat);
        txtislambad=findViewById (R.id.txt_islambad);
        txtpeshawar=findViewById (R.id.txt_peshawar);
        txtmultan=findViewById (R.id.txt_multan);
        txtlahore=findViewById (R.id.txt_lahore);
        txtSahiwal.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intentswlres=new Intent (Cities.this,Sahiwal_City_Info.class);
                startActivity (intentswlres);
            }
        });
        txtgujrat.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intentgujres=new Intent (Cities.this,Gujrat_City_Info.class);
                startActivity (intentgujres);
            }
        });
        txtislambad.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intentislamabdres=new Intent (Cities.this ,Islamabad_City_Info.class);
                startActivity (intentislamabdres);
            }
        });
        txtpeshawar.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intentpeshres=new Intent (Cities.this ,Peshawar_City_Info.class);
                startActivity (intentpeshres);
            }
        });
        txtmultan.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intentmultres=new Intent (Cities.this,Multan_City_Info.class);
                startActivity (intentmultres);
            }
        });
        txtlahore.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intentlhrres=new Intent (Cities.this,Lahore_City_Info.class);
                startActivity (intentlhrres);
            }
        });
    }
}
