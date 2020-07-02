package com.example.inku;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class Tattoo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tattoo);

        ImageView tattoo = (ImageView)findViewById(R.id.imageView3);



        Intent intent = getIntent();
        Bitmap bitmap = (Bitmap) intent.getParcelableExtra("key");
        tattoo.setImageBitmap(bitmap);
    }
}