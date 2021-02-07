package com.example.calendriertrain;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity2 extends AppCompatActivity {
    private List<TrajetTrain> trajetTrains = new ArrayList<>();
    private List<String> listTrajets = new ArrayList<>();
    private String depart, destination;

    private ListView listView;
    private Button returnButton;
    private TextView Title;
    private LinearLayout linearLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        CreateTrajets();
        Intent intent = getIntent();
        linearLayout = (LinearLayout) findViewById(R.id.mainLayout);
        listView = (ListView) findViewById(R.id.listView);
        returnButton = (Button) findViewById(R.id.returnButton);
        returnButton.setOnClickListener(v -> {
            Intent intent1 = new Intent(this, MainActivity.class);
            startActivity(intent1);
            finishActivity(0);
        });
        if (intent.getExtras() != null) {
            depart = intent.getExtras().getString("depart");
            destination = intent.getExtras().getString("destination");
            String stringTitle = depart + "--" + destination;
            Title = (TextView) findViewById(R.id.TitreTrajet);
            Title.setText(stringTitle);
            int i = 0;
            for (TrajetTrain t : trajetTrains) {
                if (t.getDepart().equals(depart) && t.getDestination().equals(destination)) {
                    listTrajets.add(t.toString());
                    i += 1;
                }
            }
            if (i == 0) {
                TextView refus = new TextView(this);
                refus.setText(R.string.refusText);
                linearLayout.addView(refus);
            }
            ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listTrajets);
            listView.setAdapter(arrayAdapter);
        }
    }

    private void CreateTrajets() {
        trajetTrains.add(new TrajetTrain("Montpellier", "Paris", "8h", "TrainA", "10h", "18h", "25/02/2020"));
        trajetTrains.add(new TrajetTrain("Montpellier", "Paris", "8h", "TrainB", "12h", "20h", "25/02/2020"));
        trajetTrains.add(new TrajetTrain("Montpellier", "Toulouse", "2h", "TrainZ", "12h", "14h", "25/02/2020"));
        trajetTrains.add(new TrajetTrain("Montpellier", "Toulouse", "2h", "TrainZ", "16h45", "18h45", "25/02/2020"));
        trajetTrains.add(new TrajetTrain("Montpellier", "Toulouse", "2h", "TrainZ", "16h45", "18h45", "25/02/2020"));
        trajetTrains.add(new TrajetTrain("Montpellier", "Toulouse", "2h", "TrainZ", "8h", "10h", "25/02/2020"));
    }
}