package com.example.eggtimer;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    public static final String EXTRA_MESSAGE = "com.example.eggtimer.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startTimer(View view) {
        EditText editText = findViewById(R.id.editText);
        String getText = editText.getText().toString();
        if (getText.isEmpty())
            Toast.makeText(MainActivity.this, "Field empty. Please enter a time.", Toast.LENGTH_SHORT).show();
        else {
            Intent intent = new Intent(this, TimerActivity.class);
            String timer = editText.getText().toString();
            intent.putExtra(EXTRA_MESSAGE, timer);
            startActivity(intent);
            editText.setText(null);
        }
    }
}
