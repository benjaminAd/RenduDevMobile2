package com.example.exo5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {


    private LinearLayout MainLayout, ButtonLayout;
    private TextView nom, prenom, age, domaineCompetence, numTel;
    private Button ok, retour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        final Intent intent = getIntent();
        MainLayout = (LinearLayout) findViewById(R.id.MainLayout);

        ButtonLayout = new LinearLayout(this);
        ButtonLayout.setOrientation(LinearLayout.HORIZONTAL);

        nom = new TextView(this);
        nom.setText(intent.getStringExtra("nom"));
        MainLayout.addView(nom);

        prenom = new TextView(this);
        prenom.setText(intent.getStringExtra("prenom"));
        MainLayout.addView(prenom);

        age = new TextView(this);
        age.setText(intent.getStringExtra("age"));
        MainLayout.addView(age);

        domaineCompetence = new TextView(this);
        domaineCompetence.setText(intent.getStringExtra("domaineCompetence"));
        MainLayout.addView(domaineCompetence);

        numTel = new TextView(this);
        numTel.setText(intent.getStringExtra("numTel"));
        MainLayout.addView(numTel);

        ok = new Button(this);
        ok.setText(R.string.OkButton);
        ok.setOnClickListener((v) -> {
            Intent i2 = new Intent(MainActivity2.this, MainActivity3.class);
            i2.putExtra("Numero", numTel.getText().toString());
            startActivity(i2);
        });
        ButtonLayout.addView(ok);

        retour = new Button(this);
        retour.setText(R.string.retourButton);
        retour.setOnClickListener((v) -> {
            startActivity(new Intent(MainActivity2.this, MainActivity.class));
            MainActivity2.this.finish();
        });
        ButtonLayout.addView(retour);

        MainLayout.addView(ButtonLayout);

    }
}