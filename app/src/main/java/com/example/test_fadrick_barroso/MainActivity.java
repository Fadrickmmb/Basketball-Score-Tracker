package com.example.test_fadrick_barroso;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button plus3A, plus2A, plus1A, plus3B, plus2B, plus1B, result, reset;

    int scoreA = 0;
    int scoreB = 0;

    EditText teamA, teamB;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        plus3A = findViewById(R.id.button);
        plus2A = findViewById(R.id.button2);
        plus1A = findViewById(R.id.button3);
        plus3B = findViewById(R.id.button4);
        plus2B = findViewById(R.id.button5);
        plus1B = findViewById(R.id.button6);
        teamA = findViewById(R.id.editTextTextPersonName);
        teamB = findViewById(R.id.editTextTextPersonName2);
        result = findViewById(R.id.button7);
        reset = findViewById(R.id.button8);




        plus3A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            scoreA += 3;
            teamA.setText(String.valueOf(scoreA));
            }
        });

        plus2A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scoreA += 2;
                teamA.setText(String.valueOf(scoreA));
            }
        });

        plus1A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scoreA += 1;
                teamA.setText(String.valueOf(scoreA));
            }
        });

        plus3B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scoreB += 3;
                teamB.setText(String.valueOf(scoreB));
            }
        });

        plus2B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scoreB += 2;
                teamB.setText(String.valueOf(scoreB));
            }
        });

        plus1B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scoreB += 1;
                teamB.setText(String.valueOf(scoreB));
            }
        });

        result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            if (scoreA > scoreB) {
                Toast.makeText(MainActivity.this, "Team A won! The score was " + scoreA + " vs " + scoreB, Toast.LENGTH_LONG).show();
            } else if (scoreA < scoreB) {
                Toast.makeText(MainActivity.this, "Team B won! The score was " + scoreB + " vs " + scoreA, Toast.LENGTH_LONG).show();
            } else {
                Toast.makeText(MainActivity.this, "The game is a Draw! The score was " + scoreA + " vs " + scoreB, Toast.LENGTH_LONG).show();
            }
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scoreA = 0;
                scoreB = 0;
                teamA.setText(String.valueOf(scoreA));
                teamB.setText(String.valueOf(scoreB));
                Toast.makeText(MainActivity.this, "Reseting score", Toast.LENGTH_LONG).show();
            }
        });



    }
}