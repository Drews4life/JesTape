package com.example.drews.projnumba;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button buttonWeaponry = findViewById(R.id.buttonWeapon);
        buttonWeaponry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

                Intent intent = new Intent(getBaseContext(), Weaponry.class);
                startActivity(intent);
            }
        });

        Button buttonEquipment = findViewById(R.id.buttonEquipment);
        buttonEquipment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getBaseContext(), Equipment.class);
                startActivity(intent);
            }
        });

        Button buttonCalendar = findViewById(R.id.buttonCal);
        buttonCalendar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getBaseContext(), CalendarProj.class);
                startActivity(intent);
            }
        });

        Button buttonCons = findViewById(R.id.buttonCons);
        buttonCons.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getBaseContext(), Consumables.class);
                startActivity(intent);
            }
        });

    }

}