package org.brohede.marcus.listviewapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;
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

// Java program to Convert ArrayList to
// String ArrayList using get() method





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView lista = (ListView)findViewById(R.id.fridaslist);

        Mountain[] items={
                new Mountain("Matterhorn","Alps",4478),
        new Mountain("Mont Blanc","Alps",4808),
        new Mountain("Denali", "Alaska",6190),
        };


        ArrayAdapter<Mountain> adapter= new ArrayAdapter<Mountain>(this, R.layout.list_item_textview, R.id.fridasItem,items);

        lista.setAdapter(adapter);

        // The onCreate method is run when the app is created.
        // Before you can implement this you need to create the layout xml files that
        // will hold/show your data created here. You need three create things:
        // * my_listview - the ID to the actual layout element that is our ListView.
        //                 This my_listview element is created in the activity_main.xml file
        // * list_item_textview - This is a new layout xml file that holds the layout for an
        //                        individual item in the ListView we are creating
        // * my_item_textview - This is the ID to the actual TextView that will contain the text for
        //                      an individual item in the ListView we are creating.
        // Here you should enter your code that fills the ListView
        // 1. Create an array
        // 2. Create a List object with your array from step 1 as in-data
        // 3. Create an ArrayAdapter object that connects
        //    * list_item_textview
        //    * my_item_textview
        //    * List object created in step 2
        // 4. Find the ListView layout element "my_listview" and create an object instance
        // 5. Connect the ArrayAdapter from step 3 with ListView object created in step 4
        // 6. Style the ListView items according to Material Design
        //    See: https://material.io/guidelines/components/lists.html#lists-specs
        //    Look for "singel line specs" for "text only" lists and modify the list_item_textview
        //    accordingly
    }
}
