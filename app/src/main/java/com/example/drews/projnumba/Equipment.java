package com.example.drews.projnumba;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class Equipment extends AppCompatActivity {

    ListView listView1;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_equipment);
        listView1 = (ListView) findViewById(R.id.lvnotMain);

        final String[] names = new String[] {"Backpacks","Vests", "Helmets"};
        final int[] imageResources5 = new int[] {R.drawable.backpacks1, R.drawable.vests123, R.drawable.helmetslvl123};


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_2,android.R.id.text2, names);

        listView1.setAdapter(adapter);
        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                startActivity(new Intent(Equipment.this, EquipDetails.class).putExtra("image22", imageResources5[position]));
            }
        });

    }
}