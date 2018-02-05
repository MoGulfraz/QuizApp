package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int qOneScore =0;
    int qTwoScore =0;
    int qThreeScore =0;
    int qFourScore =0;
    int qFiveScore =0;
    int qSixScore =0;
    int qSevenScore =0;
    int qEightScore =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // displays the final result on screen
    public void dispResult(View view){
        int totalScore = calcResult(view);

        TextView score = (TextView) findViewById(R.id.resultTextView);
        score.setText("Your Score: " + totalScore +  " out of 8\nWell Done!");
    }

    //Question 1
    public void one(View view) {

        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            // Question 1
            case R.id.oneAnswer:
                if (checked) {
                    qOneScore = 1;
                } else {
                    qOneScore = 0;
                }


        }
    }

    //Question 2
    public void two(View view){

        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            // Question 1
            case R.id.twoAnswer:
                if (checked) {
                    qTwoScore = 1;
                } else {
                    qTwoScore = 0;
                }


        }
    }

    //Question 3
    public void three(View view){
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            // Question 1
            case R.id.threeAnswer:
                if (checked) {
                    qThreeScore = 1;
                } else {
                    qThreeScore = 0;
                }
        }
    }

    //Question 4
    public void four(View view){

        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            // Question 1
            case R.id.fourAnswer:
                if (checked) {
                    qFourScore = 1;
                } else {
                    qFourScore = 0;
                }


        }
    }

    //Question 5
    public void five(View view){
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            // Question 1
            case R.id.fiveAnswer:
                if (checked) {
                    qFiveScore = 1;
                } else {
                    qFiveScore = 0;
                }

        }
    }

    //Question 7
    public void seven(View view){
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            // Question 1
            case R.id.sevenAnswer:
                if (checked) {
                    qSevenScore = 1;
                } else {
                    qSevenScore = 0;
                }

        }
    }

    // calculates total score
    public int calcResult (View view) {
        int totalScore = 0;

        //Calculate score for question six
        CheckBox notAfraid = (CheckBox)findViewById(R.id.em1);
        boolean isNotAfraid = notAfraid.isChecked();

        CheckBox youDontKnow = (CheckBox)findViewById(R.id.em2);
        boolean isYouDontKnow = notAfraid.isChecked();

        CheckBox mrsMathers = (CheckBox)findViewById(R.id.em3);
        boolean isMrsMathers = notAfraid.isChecked();

        CheckBox beautiful = (CheckBox)findViewById(R.id.em4);
        boolean isBeautiful = notAfraid.isChecked();

        CheckBox goodbye = (CheckBox)findViewById(R.id.em5);
        boolean isGoodbye = notAfraid.isChecked();

        if(isNotAfraid && isYouDontKnow && isBeautiful){
            qSixScore = 1;
        }

        else{
            qSixScore = 0;
        }

        //Calculate score for question eight
        EditText ans = (EditText)findViewById(R.id.eight);
        String stringAns = ans.getText().toString();

        if(stringAns.equalsIgnoreCase("egypt"))
        {
            qEightScore = 1;
        }

        else{
            qEightScore = 0;
        }



        //Add all the scores for each question
        totalScore = totalScore + qOneScore + qTwoScore + qThreeScore + qFourScore + qFiveScore + qSixScore + qSevenScore + qEightScore;
        return totalScore;
    }
}
