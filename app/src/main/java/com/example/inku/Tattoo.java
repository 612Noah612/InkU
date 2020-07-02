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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tattoo);

        ImageButton dropdwn = (ImageButton)findViewById(R.id.imageButton4);
        ImageView tattoo = (ImageView)findViewById(R.id.imageView3);
        final ListView listview = (ListView)findViewById(R.id.listview);

        //get the picture
        Intent intent = getIntent();
        Bitmap bitmap = (Bitmap) intent.getParcelableExtra("key");
        tattoo.setImageBitmap(bitmap);

        //add the tattoos


        dropdwn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if(opened==false) {
                    listview.setVisibility(View.VISIBLE);
                    opened=true;
                }
                else if(opened==true){
                    listview.setVisibility(View.INVISIBLE);
                    opened=false;
                }
            }
        });
    }
}