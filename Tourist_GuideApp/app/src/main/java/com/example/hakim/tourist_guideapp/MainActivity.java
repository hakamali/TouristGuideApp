package com.example.hakim.tourist_guideapp;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.Toolbar;

import com.smarteist.autoimageslider.SliderLayout;
import com.smarteist.autoimageslider.SliderView;

public class MainActivity extends AppCompatActivity {
SliderLayout sliderLayout;
Button btngninfo,btncity,btntouristcenters,btnserviceinfo,btnhelp;
//private Toolbar toolBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);
//        toolBar = findViewById (R.id.toolBar);
//        toolBar.setTitle ("Tourist Guide");
//        toolBar.setSubtitle ("Tour and Travel Guide Agency");
//        toolBar.setTitleTextColor (Color.WHITE);
//        toolBar.setSubtitleTextColor (Color.WHITE);
//        toolBar.setBackgroundColor (Color.GREEN);
        btngninfo=(Button)findViewById (R.id.generalinfo);
        btncity=(Button)findViewById (R.id.cities);
        btntouristcenters=(Button)findViewById (R.id.touristcenters);
        btnserviceinfo=(Button)findViewById (R.id.serviceinfo);
        btnhelp=(Button)findViewById (R.id.help);
        sliderLayout = (SliderLayout) findViewById (R.id.imageSlider);
        sliderLayout.setIndicatorAnimation (SliderLayout.Animations.FILL);
        sliderLayout.setScrollTimeInSec (1);
        setSliderViews ();

    }

    private void setSliderViews() {
        for (int i = 0; i <= 3; i++) {
            SliderView sliderView = new SliderView (this);
            switch (i) {
                case 0:
                    sliderView.setImageUrl ("http://studio786.co.uk/images/slides/1.jpg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260");
                    break;
                case 1:
                    sliderView.setImageUrl ("http://studio786.co.uk/images/slides/2.jpg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260");
                    break;
                case 2:
                    sliderView.setImageUrl ("http://studio786.co.uk/images/slides/3.jpg?auto=compress&cs=tinysrgb&h=750&w=1260");
                    break;
                case 3:
                    sliderView.setImageUrl ("http://studio786.co.uk/images/slides/4.jpg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260");
                    break;
            }
            sliderView.setImageScaleType (ImageView.ScaleType.CENTER_CROP);
            sliderView.setDescription ("Tourist Guide" + (i + 1));
            final int finalI = i;
            sliderView.setOnSliderClickListener (new SliderView.OnSliderClickListener () {
                @Override
                public void onSliderClick(SliderView sliderView) {
                    Toast.makeText (MainActivity.this, "This is slider" + (finalI + 1), Toast.LENGTH_SHORT).show ();
                }
            });
            sliderLayout.addSliderView (sliderView);


        }
        btngninfo.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intentgeneralinfo=new Intent (MainActivity.this,Genralinfo.class);
                startActivity (intentgeneralinfo);
            }
        });

        btncity.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intentcity=new Intent (MainActivity.this , Cities.class);
                startActivity (intentcity);
            }
        });
        btntouristcenters.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intenttouristcenter=new Intent (MainActivity.this,Touristcenters.class);
                startActivity (intenttouristcenter);
            }
        });
        btnserviceinfo.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intentseriviceinfo=new Intent (MainActivity.this,Serviceinfo.class);
                startActivity (intentseriviceinfo);

            }
        });
       btnhelp.setOnClickListener (new View.OnClickListener () {
           @Override
           public void onClick(View v) {
               Intent intenthelp=new Intent (MainActivity.this,Help.class);
               startActivity (intenthelp);
           }
       });
    }
}


