package com.example.drews.projnumba;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class Equipment extends AppCompatActivity {

    String[] names = { "Backpack (Level 1)", "Backpack (Level 2)", "Backpack (Level 3)", "Motorcycle Helmet (Level 1)", "Military Helmet (Level 2)", "Spetsnaz Helmet (Level 3)",
            "Police Vest (level 1)", "Police Vest (level 2)", "Military Vest (level 1)", "Backpack (level 1)", "Backpack (level 2)", "Backpack (level 3)" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_equipment);
        ListView lvMain = (ListView) findViewById(R.id.lvnotMain);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, names);

        lvMain.setAdapter(adapter);

    }
}