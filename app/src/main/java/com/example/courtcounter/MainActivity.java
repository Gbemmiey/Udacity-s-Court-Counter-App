package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public int teamAScore = 0;
    public int teamBScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(teamAScore);
        displayForTeamB(teamBScore);
    }


    //Methods to display the Scores
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) (findViewById(R.id.teamBScore));
        scoreView.setText(" " + score);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) (findViewById(R.id.teamAScore));
        scoreView.setText(" " + score);
    }

    //Methods to allocate Points to Team A
    public void aThreeP(View view) {
        int pScore = 3;
        teamAScore = teamAScore + pScore;
        displayForTeamA(teamAScore);
    }

    public void aTwoP(View view) {
        int pScore = 2;
        teamAScore = teamAScore + pScore;
        displayForTeamA(teamAScore);
    }

    public void aFreeP(View view) {
        int pScore = 1;
        teamAScore = teamAScore + pScore;
        displayForTeamA(teamAScore);
    }

    public void aReset(View view) {
        teamAScore = 0;
        displayForTeamA(teamAScore);
    }

    //Methods to allocate Points to Team B
    public void bThreeP(View view) {
        int pScore = 3;
        teamBScore = teamBScore + pScore;
        displayForTeamB(teamBScore);
    }

    public void bTwoP(View view) {
        int pScore = 2;
        teamBScore = teamBScore + pScore;
        displayForTeamB(teamBScore);
    }

    public void bFreeP(View view) {
        int pScore = 1;
        teamBScore = teamBScore + pScore;
        displayForTeamB(teamBScore);
    }

    public void bReset(View view) {
        teamBScore = 0;
        displayForTeamB(teamBScore);
    }

    //Reset All
    public void resetAll(View view) {
        teamBScore = 0;
        teamAScore = 0;
        displayForTeamB(teamBScore);
        displayForTeamA(teamAScore);
    }
}
