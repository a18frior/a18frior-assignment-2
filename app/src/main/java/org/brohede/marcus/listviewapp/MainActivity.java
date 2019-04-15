package org.brohede.marcus.listviewapp;

import android.icu.text.IDNA;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private Adapter mAdapter;



    private String[] mountainNames = {"Matterhorn", "Mont Blanc", "Denali"};
    private String[] mountainLocations = {"Alps", "Alps", "Alaska"};
    private int[] mountainHeights = {4478, 4808, 6190};
    Mountain m = new Mountain("Matterhorn", "Alps", 4478);
    Mountain m2 = new Mountain("Mont Blanc", "Alps", 4808);
    Mountain m3 = new Mountain("Denali", "Alaska", 6190);

    // Create ArrayLists from the raw data above and use these lists when populating your ListView.
    ArrayList<String> berg = new ArrayList<String>(Arrays.asList(mountainNames));

    ArrayList<Mountain> berg2=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        berg2.add(m);
        berg2.add(m2);
        berg2.add(m3);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.list_item_textview, R.id.fridasItem, berg);
        ListView lista= findViewById(R.id.fridaslist);
        lista.setAdapter(adapter);


        lista.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), berg2.get(position).info(), Toast.LENGTH_LONG).show();
            }
        });
    }
}
