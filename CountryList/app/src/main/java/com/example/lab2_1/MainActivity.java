package com.example.lab2_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Toast;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText tekstiEditori;
    List<String> countryList;
    ListView myListView;
    ArrayAdapter arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tekstiEditori = findViewById(R.id.editText);
        myListView = findViewById(R.id.ListView);
        findViewById(R.id.buttonAdd).setOnClickListener(this);
        findViewById(R.id.buttonEdit).setOnClickListener(this);
        findViewById(R.id.buttonRemove).setOnClickListener(this);

        final String[] COUNTRIES = new String[] {
                "Afghanistan", "Austria", "Australia"
        };

        countryList = new ArrayList<>();
        countryList.addAll(Arrays.asList(COUNTRIES));

        arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, countryList);
        myListView.setAdapter(arrayAdapter);
    }

    @Override
    public void onClick(View v) {

        String country = tekstiEditori.getText().toString();

        if (v.getId() == R.id.buttonAdd && !country.isEmpty()) {
            countryList.add(country);
            arrayAdapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1, countryList);
            myListView.setAdapter(arrayAdapter);
            Toast.makeText(MainActivity.this, country + " added", Toast.LENGTH_LONG).show();
        }

        if (v.getId() == R.id.buttonRemove) {
            countryList.remove(country);
            arrayAdapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1, countryList);
            myListView.setAdapter(arrayAdapter);
            Toast.makeText(MainActivity.this, country + " deleted", Toast.LENGTH_LONG).show();
        }
    }
}
