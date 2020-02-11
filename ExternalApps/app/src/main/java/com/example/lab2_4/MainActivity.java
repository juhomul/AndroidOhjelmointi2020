package com.example.lab2_4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText searchBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        searchBox = findViewById(R.id.editText);
        findViewById(R.id.buttonCall).setOnClickListener(this);
        findViewById(R.id.buttonMap).setOnClickListener(this);
        findViewById(R.id.buttonGo).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.buttonCall) {
            Uri callNumber = Uri.parse("tel:+358 45 3455101");
            Intent callIntent = new Intent(Intent.ACTION_DIAL, callNumber);
            startActivity(callIntent);
        }
        if (v.getId() == R.id.buttonMap) {
            Uri mapLocation = Uri.parse("geo:0,0?q=90250+Kotkantie+1");
            Intent openMap = new Intent(Intent.ACTION_VIEW, mapLocation);
            startActivity(openMap);
        }
        if (v.getId() == R.id.buttonGo) {
            String address = searchBox.getText().toString();
            Uri site = Uri.parse("http://www."+address);
            Intent openWeb = new Intent(Intent.ACTION_VIEW, site);
            startActivity(openWeb);
        }
    }
}
