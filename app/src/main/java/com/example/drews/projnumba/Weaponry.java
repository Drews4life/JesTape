package com.example.drews.projnumba;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class Weaponry extends AppCompatActivity {

    String[] names = { "AKM", "M416", "Scar-L", "GROZA", "UMP", "UZI",
            "AWM", "M-14", "M24", "Colt 1911", "Glock-19" };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weaponry);
        ListView lvMain = (ListView) findViewById(R.id.ivMain);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, names);

        lvMain.setAdapter(adapter);

    }
}


