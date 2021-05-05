package comexample.android.americanfootballscore;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    int teamAScore = 0;
    int teamBScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method displays scores for team A
     */
    public void displayTeamAScore(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This method adds 6 points to Team A when a touchdown is made
     */
    public void addSixPointsToTeamA(View view) {
        teamAScore += 6;
        displayTeamAScore(teamAScore);
    }

    /**
     * This method adds 3 points to Team A when a field goal is made
     */
    public void addThreePointsToTeamA(View view) {
        teamAScore += 3;
        displayTeamAScore(teamAScore);
    }

    /**
     * This method adds 2 points to Team A for safety  when Team B makes a tackle on them
     * with the ball in their with the bold in their own end zone
     */
    public void addTwoPointsToTeamA(View view) {
        teamAScore += 1;
        displayTeamAScore(teamAScore);
    }

    /**
     * This method adds 1 point to Team A when an extra point is earned
     * when team A kicks through the uprights after a touchdown
     */
    public void addOnePointsToTeamA(View view) {
        teamAScore += 1;
        displayTeamAScore(teamAScore);
    }

    /**
     * This method displays scores for team B
     */
    public void displayTeamBScore(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This method adds 6 points to Team A when a touchdown is made
     */
    public void addSixPointsToTeamB(View view) {
        teamBScore += 6;
        displayTeamBScore(teamBScore);
    }

    /**
     * This method adds 3 points to Team B when a field goal is made
     */
    public void addThreePointsToTeamB(View view) {
        teamBScore += 3;
        displayTeamBScore(teamBScore);
    }

    /**
     * This method adds 2 points to Team B for safety  when Team B makes a tackle on them
     * with the ball in their with the bold in their own end zone
     */
    public void addTwoPointsToTeamB(View view) {
        teamBScore += 1;
        displayTeamBScore(teamBScore);
    }

    /**
     * This method adds 1 point to Team B when an extra point is earned
     * when team A kicks through the uprights after a touchdown
     */
    public void addOnePointsToTeamB(View view) {
        teamBScore += 1;
        displayTeamBScore(teamBScore);
    }

}