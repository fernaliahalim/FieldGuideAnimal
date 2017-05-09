package com.android_app.ferna.fieldguideanimal;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Fernalia on 09/05/2016.
 */
public class ListAnimaliaActivity extends AppCompatActivity {
    TextView txt_filum;
    ListView lv_kelas;
    String[] hewan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_animalia);
        ActionBar supportActionBar = getSupportActionBar();
        supportActionBar.hide();

        txt_filum = (TextView) findViewById(R.id.txt_filum);
        lv_kelas  = (ListView) findViewById(R.id.lv_kelas);

        Intent i = getIntent();
        String filum = i.getStringExtra("filum");

        txt_filum.setText(filum);

        switch (filum){
            case "Porifera":
                hewan = new String[] {"Calcarea", "Hexactinellida", "Demospongiae"};
                break;
            case "Cnidaria":
                hewan = new String[] {"Hydrozoa", "Scyphozoa", "Anthozoa"};
                break;
            case "Platyhelminthes":
                hewan = new String[] {"Turbellaria", "Trematoda", "Cestoda"};
                break;
            case "Nematoda":
                hewan = new String[] {"Adenophorea", "Secernentea"};
                break;
            case "Annelida":
                hewan = new String[] {"PolyChaeta", "OligoChaeta", "Hirudenia"};
                break;
            case "Mollusca":
                hewan = new String[] {"Polyplacophora", "Scapopoda", "Gastropoda", "Pelecypoda", "Cephalopoda"};
                break;
            case "Echinodermata":
                hewan = new String[] {"Archoidea", "Echinoidea", "Crinoidea", "Ophiuroidea", "Holothuroidea"};
                break;
            case "Arthopoda":
                hewan = new String[] {"Crustacea", "Myriapoda", "Arachnoidea", "Insecta"};
                break;
            case "Chordata":
                hewan = new String[] {"Hemichordata", "Urochordata", "Cephalochordata", "Vertebrata"};
                break;
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, hewan);
        lv_kelas.setAdapter(adapter);
        lv_kelas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String itemValue = (String) lv_kelas.getItemAtPosition(position);

                Intent i = new Intent(ListAnimaliaActivity.this, HewanActivity.class);
                i.putExtra("kelas", itemValue);
                startActivity(i);
            }
        });
    }
}
