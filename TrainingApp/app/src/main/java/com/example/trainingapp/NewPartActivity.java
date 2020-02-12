package com.example.trainingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

import java.util.ArrayList;

public class NewPartActivity extends AppCompatActivity {

    EditText editText;
    RadioButton rbWorkout;
    RadioButton rbPause;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_part);
        editText = findViewById(R.id.editText);
        rbPause = findViewById(R.id.rbPause);
        rbWorkout = findViewById(R.id.rbWorkout);
    }

    public void addWorkout(View view) {
        final int time = Integer.parseInt(editText.getText().toString());
        if (rbPause.isChecked()) {
            WorkoutPart part = new WorkoutPart(time, "Pause");
            Intent intent = new Intent(this, MainActivity.class);
            intent.putExtra("NEW_PART", part);
            setResult(Activity.RESULT_OK, intent);
            finish();
        }
        if (rbWorkout.isChecked()) {
            WorkoutPart part = new WorkoutPart(time, "Workout");
            Intent intent = new Intent(this, MainActivity.class);
            intent.putExtra("NEW_PART", part);
            setResult(Activity.RESULT_OK, intent);
            finish();
        }
    }
}
