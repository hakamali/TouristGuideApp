package com.example.hakim.tourist_guideapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Islamabad_City_Info extends AppCompatActivity {
    Button btnislmabdrestu,getBtnislmabdparks,btnislmabdplaces;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_islamabad__city__info);
        btnislmabdrestu=findViewById (R.id.islamabad_Resturents);
        getBtnislmabdparks=findViewById (R.id.islamabad_parks);
        btnislmabdplaces=findViewById (R.id.islamabad_places);
        btnislmabdrestu.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intentislamabadrestu=new Intent (Islamabad_City_Info.this,Islamabadresturents.class);
                startActivity (intentislamabadrestu);
            }
        });
        getBtnislmabdparks.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intentislamabadparks=new Intent (Islamabad_City_Info.this,Islamabad_Parks.class);
                startActivity (intentislamabadparks);
            }
        });
        btnislmabdplaces.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intentislamabdplaces=new Intent (Islamabad_City_Info.this,Islamabad_Old_Places.class);
                startActivity (intentislamabdplaces);
            }
        });

    }
}
