package com.example.drews.projnumba;

import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;


public class Weaponry extends AppCompatActivity {

    ListView listView;
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weaponry);
        listView = (ListView) findViewById(R.id.ivMain);
         final String[] values = new String[] {"AKM", "M416", "Scar-L", "GROZA", "M16A4","M249","UMP-9", "MICRO-UZI","KRISS VECTOR", "THOMPSON",
                "AWM", "MINI-14", "KAR98K", "MK14","SKS", "VSS", "M24", "B686", "S12K", "S1897", "P92", "R1895", "Colt 1911","CROSSBOW","PAN", "CROWBAR", "MACHETE", "SICKLE", "FRAG GRENADE",
         "STUN GRENADE", "SMOKE GRENADE", "MOLOTOV COCKTAIL"};
         final int[] imageResources = new int[] {R.drawable.akm, R.drawable.m416, R.drawable.scarl, R.drawable.groza, R.drawable.m16a4, R.drawable.m249, R.drawable.ump9, R.drawable.microuzi, R.drawable.vector,
                 R.drawable.thompson, R.drawable.awm,R.drawable.mini14, R.drawable.kar98k, R.drawable.mk14,R.drawable.sks, R.drawable.vss , R.drawable.m24, R.drawable.b686,R.drawable.s12k,
                 R.drawable.s1897, R.drawable.p92, R.drawable.r1895, R.drawable.m1911, R.drawable.crossbow, R.drawable.pan, R.drawable.crowbar, R.drawable.machete, R.drawable.sickle, R.drawable.frag, R.drawable.flash,
                 R.drawable.smoke, R.drawable.molotov};
         final int[] imageResources2 = new int[] {R.drawable.statsak, R.drawable.statsm416, R.drawable.statsscarl,R.drawable.statsgroza,R.drawable.statsm16a4, R.drawable.statsm249, R.drawable.statsump9,
                 R.drawable.statmicrouzi, R.drawable.statsvector, R.drawable.statsthompson, R.drawable.statsawm, R.drawable.statsmini14, R.drawable.statskar98k, R.drawable.statsmk14, R.drawable.statssks,
                 R.drawable.statsvss, R.drawable.statsm24, R.drawable.statsb686, R.drawable.statss12k, R.drawable.statss1897, R.drawable.statsp92, R.drawable.statsr1895, R.drawable.statsp1911,R.drawable.statcrossbow,
                 R.drawable.statspan, R.drawable.statscrowbar, R.drawable.statsmachete, R.drawable.statssickle, R.drawable.statsfrag, R.drawable.statsstun, R.drawable.statssmoke, R.drawable.statsmolotov};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,android.R.id.text1, values);



        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                startActivity(new Intent(Weaponry.this, WeaponDetails.class).putExtra("image", imageResources[position]).putExtra("image1", imageResources2[position]));
            }
        });

        }

}


