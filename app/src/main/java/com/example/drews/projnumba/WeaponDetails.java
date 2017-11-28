package com.example.drews.projnumba;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import java.io.File;

public class WeaponDetails extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weapon_details);

        int image = getIntent().getExtras().getInt("image");
        ImageView imageView = (ImageView) findViewById(R.id.imageView1);
        imageView.setImageResource(image);
        int image1 = getIntent().getExtras().getInt("image1");
        ImageView imageView1 = (ImageView) findViewById(R.id.imageView2);
        imageView1.setImageResource(image1);

    }


}
