package com.example.inku;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;


public class Tattoo extends AppCompatActivity {
    boolean opened=false;
    ImageButton tattoo1;
    ImageButton tattoo2;
    ImageButton tattoo3;
    ImageButton tattoo4;
    ImageButton tattoo5;
    ImageButton tattoo6;
    ImageButton dropdwn;
    ImageView tattoo;
    ImageView bodytattoo;
    TextView hintergrund;
    Button smaller;
    Button bigger;
    Button savebtn;
    int width;
    int height;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tattoo);



         dropdwn = (ImageButton)findViewById(R.id.imageButton4);
         tattoo = (ImageView)findViewById(R.id.bild);
         tattoo1 = (ImageButton)findViewById(R.id.tattoo1);
         tattoo2 = (ImageButton)findViewById(R.id.tattoo2);
         tattoo3 = (ImageButton)findViewById(R.id.tattoo3);
         tattoo4 = (ImageButton)findViewById(R.id.tattoo4);
         tattoo5 = (ImageButton)findViewById(R.id.tattoo5);
         tattoo6 = (ImageButton)findViewById(R.id.tattoo6);
         bodytattoo = (ImageView)findViewById(R.id.bodytattoo);
         hintergrund = (TextView)findViewById(R.id.textView2);
         smaller = (Button)findViewById(R.id.smaller);
         bigger = (Button)findViewById(R.id.bigger);
         savebtn = (Button)findViewById(R.id.savebtn);
        //get the picture
        Intent intent = getIntent();
        Bitmap bitmap = (Bitmap) intent.getParcelableExtra("key");
        tattoo.setImageBitmap(bitmap);



        //Open the Tattoolist
        dropdwn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if(opened==false){
                    showTattoos();
                    opened = true;
                    bodytattoo.setVisibility(View.INVISIBLE);
                }
                else if(opened==true){
                    hideTattoos();
                    opened = false;
                    bodytattoo.setVisibility(View.INVISIBLE);
                }
            }
        });


        //Place Tattoo 1
        tattoo1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                bodytattoo.setImageResource(R.drawable.tattoo1);
                hideTattoos();
                bodytattoo.setVisibility(View.VISIBLE);

            }
        });

        //Place Tattoo 2
        tattoo2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                bodytattoo.setImageResource(R.drawable.tattoo2);
                hideTattoos();
                bodytattoo.setVisibility(View.VISIBLE);

            }
        });

        //Place Tattoo 3
        tattoo3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                bodytattoo.setImageResource(R.drawable.tattoo3);
                hideTattoos();
                bodytattoo.setVisibility(View.VISIBLE);

            }
        });

        //Place Tattoo 4
        tattoo4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                bodytattoo.setImageResource(R.drawable.tattoo4);
                hideTattoos();
                bodytattoo.setVisibility(View.VISIBLE);

            }
        });

        //Place Tattoo 5
        tattoo5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                bodytattoo.setImageResource(R.drawable.tattoo5);
                hideTattoos();
                bodytattoo.setVisibility(View.VISIBLE);

            }
        });

        //Place Tattoo 6
        tattoo6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                bodytattoo.setImageResource(R.drawable.tattoo6);
                hideTattoos();
                bodytattoo.setVisibility(View.VISIBLE);

            }
        });

        //Make Tattoo thats on the body smaller
        smaller.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                android.view.ViewGroup.LayoutParams params = bodytattoo.getLayoutParams();
                params.width=bodytattoo.getWidth()/2;
                params.height=bodytattoo.getHeight()/2;
                bodytattoo.setLayoutParams(params);


            }
        });


        //Make Tattoo thats on the body bigger
        bigger.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                android.view.ViewGroup.LayoutParams params = bodytattoo.getLayoutParams();
                params.width=bodytattoo.getWidth()*2;
                params.height=bodytattoo.getHeight()*2;
                bodytattoo.setLayoutParams(params);
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
        hintergrund.setVisibility(View.VISIBLE);
    }
    //method to hide tattoos
    public void hideTattoos(){
        tattoo1.setVisibility(View.INVISIBLE);
        tattoo2.setVisibility(View.INVISIBLE);
        tattoo3.setVisibility(View.INVISIBLE);
        tattoo4.setVisibility(View.INVISIBLE);
        tattoo5.setVisibility(View.INVISIBLE);
        tattoo6.setVisibility(View.INVISIBLE);
        hintergrund.setVisibility(View.INVISIBLE);
    }

    //move the tattoo
    public boolean onTouchEvent(MotionEvent event) {

        float x = event.getX();
        float y = event.getY();
        bodytattoo.setX(x-200);
        bodytattoo.setY(y-300);
        return false;
    }

}