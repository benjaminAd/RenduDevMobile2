package com.example.exo5;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;

public class MainActivity extends AppCompatActivity {

    private Button bouton;
    private Context context = this;
    private EditText nom, prenom, age, domaineCompetence, numTel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nom = (EditText) findViewById(R.id.Nom);
        prenom = (EditText) findViewById(R.id.prenom);
        age = (EditText) findViewById(R.id.age);
        domaineCompetence = (EditText) findViewById(R.id.domaineCompetence);
        numTel = (EditText) findViewById(R.id.numTel);
        bouton = (Button) findViewById(R.id.submitButton);
        bouton.setOnClickListener((v) -> {
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
            alertDialogBuilder.setTitle(R.string.DialogTitle);
            alertDialogBuilder.setMessage(R.string.Message).setCancelable(false).setPositiveButton("Oui", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Intent i1 = new Intent(MainActivity.this, MainActivity2.class);
                    i1.putExtra("nom", nom.getText().toString());
                    i1.putExtra("prenom", prenom.getText().toString());
                    i1.putExtra("age", age.getText().toString());
                    i1.putExtra("domaineCompetence", domaineCompetence.getText().toString());
                    i1.putExtra("numTel", numTel.getText().toString());
                    nom.setText("");
                    prenom.setText("");
                    age.setText("");
                    domaineCompetence.setText("");
                    numTel.setText("");
                    Toast.makeText(context, R.string.Toast, Toast.LENGTH_SHORT).show();
                    startActivity(i1);
                }
            }).setNegativeButton("Non", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Toast.makeText(context, R.string.ToastNeg, Toast.LENGTH_SHORT).show();
                }
            });

            AlertDialog alertDialog = alertDialogBuilder.create();
            alertDialog.show();
        });
    }
}