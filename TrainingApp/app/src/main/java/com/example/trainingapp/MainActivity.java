package com.example.trainingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    ListView listView;
    ArrayAdapter aa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = getIntent();
        ArrayList arrayList = intent.getStringArrayListExtra(Intent.EXTRA_TEXT);
        listView = findViewById(R.id.listView);

    }

    public void addNewPart(View view) {
        Intent intent = new Intent(this, NewPartActivity.class);
        startActivity(intent);
    }
}
