package com.example.deexi.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int teamOneScore = 0;
    int teamTwoScore = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void teamOneScore_three(View view){
        teamOneScore+=3;
        displayTeamOncScore(teamOneScore);

    }
    public void teamOneScore_two(View view){
        teamOneScore+=2;
        displayTeamOncScore(teamOneScore);

    }
    public void teamOneScore_one(View view){
        teamOneScore+=1;
        displayTeamOncScore(teamOneScore);

    }
    public void teamTwoScore_three(View view){
        teamTwoScore+=3;
        displayTeamTwoScore(teamTwoScore);
    }
    public void teamTwoScore_two(View view){
        teamTwoScore+=2;
        displayTeamTwoScore(teamTwoScore);
    }
    public void teamTwoScore_one(View view){
        teamTwoScore+=1;
        displayTeamTwoScore(teamTwoScore);
    }
    public void reset(View view){
        teamOneScore = 0;
        teamTwoScore = 0;
        displayTeamOncScore(teamOneScore);
        displayTeamTwoScore(teamTwoScore);
    }

    public void displayTeamOncScore(int number){
        TextView score = findViewById(R.id.team_oneScore);
        score.setText(""+teamOneScore);
    }
    public void displayTeamTwoScore(int number){
        TextView score = findViewById(R.id.team_twoScore);
        score.setText(""+teamTwoScore);
    }
}
