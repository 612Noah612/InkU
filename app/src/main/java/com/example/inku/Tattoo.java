package com.example.inku;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Tattoo extends AppCompatActivity {
    boolean opened=false;
    ImageButton tattoo1;
    ImageButton tattoo2;
    ImageButton tattoo3;
    ImageButton tattoo4;
    ImageButton tattoo5;
    ImageButton tattoo6;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tattoo);



        ImageButton dropdwn = (ImageButton)findViewById(R.id.imageButton4);
        ImageView tattoo = (ImageView)findViewById(R.id.bild);
         tattoo1 = (ImageButton)findViewById(R.id.tattoo1);
         tattoo2 = (ImageButton)findViewById(R.id.tattoo2);
         tattoo3 = (ImageButton)findViewById(R.id.tattoo3);
         tattoo4 = (ImageButton)findViewById(R.id.tattoo4);
         tattoo5 = (ImageButton)findViewById(R.id.tattoo5);
         tattoo6 = (ImageButton)findViewById(R.id.tattoo6);
        //get the picture
        Intent intent = getIntent();
        Bitmap bitmap = (Bitmap) intent.getParcelableExtra("key");
        tattoo.setImageBitmap(bitmap);



        //Open the ViewList
        dropdwn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if(opened==false){
                    showTattoos();
                    opened = true;
                }
                else if(opened==true){
                   hideTattoos();
                    opened = false;
                }
            }
        });
    }
    //method to show all the tattoos
    public void showTattoos(){
        tattoo1.setVisibility(View.VISIBLE);
        tattoo2.setVisibility(View.VISIBLE);
        tattoo3.setVisibility(View.VISIBLE);
        tattoo4.setVisibility(View.VISIBLE);
        tattoo5.setVisibility(View.VISIBLE);
        tattoo6.setVisibility(View.VISIBLE);
    }
    //method to hide tattoos
    public void hideTattoos(){
        tattoo1.setVisibility(View.INVISIBLE);
        tattoo2.setVisibility(View.INVISIBLE);
        tattoo3.setVisibility(View.INVISIBLE);
        tattoo4.setVisibility(View.INVISIBLE);
        tattoo5.setVisibility(View.INVISIBLE);
        tattoo6.setVisibility(View.INVISIBLE);
    }
}