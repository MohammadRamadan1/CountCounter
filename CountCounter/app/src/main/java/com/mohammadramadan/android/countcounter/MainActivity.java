package com.mohammadramadan.android.countcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int scoreA = 0;

    public void three_points_team_a (View view) {
        scoreA = scoreA +3;
        displayScoreA(scoreA);
    }
    public  void two_points_team_a (View view){
        scoreA = scoreA +2;
        displayScoreA(scoreA);
    }
    public void one_point_team_a (View view){
        scoreA = 1+ scoreA;
        displayScoreA(scoreA);
    }
    int scoreB = 0;

    public void three_points_team_b (View view){
        scoreB = 3+ scoreB;
        displayScoreB(scoreB);
    }
    public void two_points_team_b (View view){
        scoreB = 2+ scoreB;
        displayScoreB(scoreB);
    }
    public void one_point_team_b(View view){
        scoreB =1+ scoreB;
        displayScoreB(scoreB);
    }
    public void reset (View view){
        scoreB=0;
        scoreA=0;
        displayResetB(scoreB);
        displayResetA(scoreA);
    }



    public void displayScoreA (int scoreTeamA){
        TextView scoreTextView = (TextView) findViewById(R.id.score_team_a);
        scoreTextView.setText(""+scoreTeamA);
    }
    public void displayScoreB (int scoreTeamB){
        TextView scoreTextView = (TextView) findViewById(R.id.score_team_b);
        scoreTextView.setText(""+scoreTeamB);
    }
    public void displayResetB (int reset){
        TextView resetTextView = (TextView) findViewById(R.id.score_team_b);
        resetTextView.setText(""+reset);
    }
    public void displayResetA (int reset){
    TextView resetTextView = (TextView) findViewById(R.id.score_team_a);
        resetTextView.setText(""+reset);
    }



}
