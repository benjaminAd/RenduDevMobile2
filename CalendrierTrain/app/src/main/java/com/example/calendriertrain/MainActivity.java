package com.example.calendriertrain;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button mainButton;
    private EditText depart, destination;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainButton = (Button) findViewById(R.id.mainButton);
        depart = (EditText) findViewById(R.id.editView2);
        destination = (EditText) findViewById(R.id.editView1);
        mainButton.setOnClickListener(v -> {
            Intent i1 = new Intent(this, MainActivity2.class);
            i1.putExtra("depart", depart.getText().toString());
            i1.putExtra("destination", destination.getText().toString());
            startActivity(i1);
        });
    }
}