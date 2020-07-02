package com.example.inku;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.net.URI;


public class MainActivity extends AppCompatActivity {
    static final int REQUEST_IMAGE_CAPTURE = 1;

    ImageView pic;
    Bitmap photo;
    Uri pictureUri;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton start = (ImageButton)findViewById(R.id.imageButton);

        ImageView pic = (ImageView)findViewById(R.id.imageView2);


        start.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {


                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                if(intent.resolveActivity(getPackageManager()) != null){
                    startActivityForResult(intent, REQUEST_IMAGE_CAPTURE);
                }
            }


        });
    }
    @Override

    //https://stackoverflow.com/questions/7304007/take-picture-from-camera-and-choose-from-gallery-and-display-in-image-view
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == REQUEST_IMAGE_CAPTURE || resultCode == RESULT_OK) {

                photo = (Bitmap) data.getExtras().get("data");

                Intent opentattoo = new Intent(this, Tattoo.class);
                Intent intent = opentattoo.putExtra("key", (Parcelable) photo);
                startActivity(opentattoo);
            }
            else{
            }
        }
    }
