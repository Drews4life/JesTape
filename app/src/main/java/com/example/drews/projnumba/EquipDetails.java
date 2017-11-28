package com.example.drews.projnumba;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class EquipDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_equip_details);
        int image22 = getIntent().getExtras().getInt("image22");
        ImageView imageView22 = (ImageView) findViewById(R.id.imageView21);
        imageView22.setImageResource(image22);
        int image23 = getIntent().getExtras().getInt("image23");
        ImageView imageView23 = (ImageView) findViewById(R.id.imageView23);
        imageView23.setImageResource(image23);
    }
}
