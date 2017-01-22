package com.teddydev.abnd_2_project_counter_app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int scoreTeamA = 0;
    private int scoreTeamB = 0;
    private int faultsTeamA = 0;
    private int faultsTeamB = 0;

    private TextView teamAScoreTextView;
    private TextView teamBScoreTextView;
    private TextView teamAFaultTextView;
    private TextView teamBFaultTextView;
    private Button teamAScoreButton;
    private Button teamBScoreButton;
    private Button teamAFaultButton;
    private Button teamBFaultButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /** TODO could use libraries like butterknife to make this code look better **/
        teamAScoreTextView = (TextView) findViewById(R.id.team_a_score);
        teamBScoreTextView = (TextView) findViewById(R.id.team_b_score);

        teamAFaultTextView = (TextView) findViewById(R.id.team_a_fault);
        teamBFaultTextView = (TextView) findViewById(R.id.team_b_fault);

        teamAScoreButton = (Button) findViewById(R.id.scoreForTeamAButton);
        teamBScoreButton = (Button) findViewById(R.id.scoreForTeamBButton);

        teamAFaultButton = (Button) findViewById(R.id.teamAFaultButton);
        teamBFaultButton = (Button) findViewById(R.id.teamBFaultButton);
    }

    /**
     * Add one to team A score and display it
     */
    public void addScoreForTeamA(View v) {
        scoreTeamA += 1;
        updateText(scoreTeamA, v);
    }

    /**
     * Add one to team B score and display it
     */
    public void addScoreForTeamB(View v) {
        scoreTeamB += 1;
        updateText(scoreTeamB, v);
    }

    /**
     * Updates given textview depending on whcih button was clicked.
     */
    private void updateText(int nr, View v) {
        if (v.equals(teamAScoreButton)) {
            teamAScoreTextView.setText(String.valueOf(nr));
        } else if (v.equals(teamBScoreButton)) {
            teamBScoreTextView.setText(String.valueOf(nr));
        } else if (v.equals(teamAFaultButton)) {
            teamAFaultTextView.setText(String.valueOf(nr));
        } else if (v.equals(teamBFaultButton)) {
            teamBFaultTextView.setText(String.valueOf(nr));
        }
    }


    /** Faults **/

    /**
     * Add one fault to team A score and display it
     */
    public void addFaultForTeamA(View v) {
        faultsTeamA += 1;
        updateText(faultsTeamA, v);
    }

    /**
     * Add one to team B score and display it
     */
    public void addFaultForTeamB(View v) {
        faultsTeamB += 1;
        updateText(faultsTeamB, v);
    }

    /**
     * Resets both score and faults for both teams
     */
    public void resetAll(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        faultsTeamA = 0;
        faultsTeamB = 0;

        teamAScoreTextView.setText(getString(R.string.zero));
        teamBScoreTextView.setText(getString(R.string.zero));
        teamAFaultTextView.setText(getString(R.string.zero));
        teamBFaultTextView.setText(getString(R.string.zero));
    }
}
