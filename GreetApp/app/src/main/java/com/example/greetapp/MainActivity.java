package com.example.greetapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView teksti;
    EditText tekstiEditori;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        teksti = findViewById(R.id.textView);
        tekstiEditori = findViewById(R.id.editText);
        findViewById(R.id.buttonEnglish).setOnClickListener(this);
        findViewById(R.id.buttonSverige).setOnClickListener(this);
        findViewById(R.id.buttonSuomeksi).setOnClickListener(this);
        findViewById(R.id.buttonSurprise).setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        String name = tekstiEditori.getText().toString();

        if (v.getId() == R.id.buttonEnglish)
        {
            teksti.setText("Hello " + name);
        }
        if (v.getId() == R.id.buttonSverige)
        {
            teksti.setText("Hejjsan " + name);
        }
        if (v.getId() == R.id.buttonSuomeksi)
        {
            teksti.setText("Hei " + name);
        }
        if (v.getId() == R.id.buttonSurprise)
        {
            teksti.setText("Hola " + name);
        }
    }
}
