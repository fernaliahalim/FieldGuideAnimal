package com.android_app.ferna.fieldguideanimal;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lv_animalia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar supportActionBar = getSupportActionBar();
        supportActionBar.hide();

        lv_animalia = (ListView) findViewById(R.id.lv_animalia);
        final String[] animalia = new String[] {"Porifera", "Cnidaria", "Platyhelminthes", "Nematoda", "Annelida", "Mollusca", "Echinodermata", "Arthopoda", "Chordata"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, animalia);
        lv_animalia.setAdapter(adapter);

        lv_animalia.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String itemValue = (String) lv_animalia.getItemAtPosition(position);

                Intent i = new Intent(MainActivity.this, ListAnimaliaActivity.class);
                i.putExtra("filum", itemValue);
                startActivity(i);
            }
        });
    }
}