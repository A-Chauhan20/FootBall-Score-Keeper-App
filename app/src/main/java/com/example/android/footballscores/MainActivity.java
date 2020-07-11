package com.example.android.footballscores;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int teamA = 0;
    int teamB = 0;

    public void setTeamA(View view) {
        teamA = teamA + 1;
        team_a_score_current(teamA);
    }

    public void setTeamB(View view) {
        teamB = teamB + 1;
        team_b_score_current(teamB);
    }

    @SuppressLint("SetTextI18n")
    public void team_a_score_current(int number) {
        TextView textview = findViewById(R.id.team_a_score);
        textview.setText("" + number);
    }

    @SuppressLint("SetTextI18n")
    public void team_b_score_current(int number) {
        TextView textview = findViewById(R.id.team_b_score);
        textview.setText("" + number);
    }

    public void reset(View view) {
        teamA = 0;
        teamB = 0;
        team_a_score_current(teamA);
        team_b_score_current(teamB);
    }
}
