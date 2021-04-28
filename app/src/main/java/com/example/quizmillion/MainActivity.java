package com.example.quizmillion;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    // These are going to be my 4 buttons
    // The textview will be the tv_questions
    Button b1, b2, b3, b4;
    TextView tv_question;

    private Question question = new Question();

    private String answer;
    private int questionLength = question.questions.length;

    Random random;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        random = new Random();


// These are all of the buttons id
        b1 = (Button)findViewById(R.id.b1);
        b1.setOnClickListener(this);
        b2 = (Button)findViewById(R.id.b2);
        b2.setOnClickListener(this);
        b3 = (Button)findViewById(R.id.b3);
        b3.setOnClickListener(this);
        b4 = (Button)findViewById(R.id.b4);
        b4.setOnClickListener(this);

        tv_question = (TextView)findViewById(R.id.tv_question);

        NextQuestion(random.nextInt(questionLength));
    }
// These are going to be the toast when the answer is correct
    // There is going to be a long toast
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.b1:
                if(b1.getText() == answer){
                    Toast.makeText(MainActivity.this, "Correct!", Toast.LENGTH_LONG).show();
                    NextQuestion(random.nextInt(questionLength));
                }else{
                    GameOver();
                }

                break;

            case R.id.b2:
                if(b2.getText() == answer){
                    Toast.makeText(MainActivity.this, "Correct!", Toast.LENGTH_LONG).show();
                    NextQuestion(random.nextInt(questionLength));
                }else{
                    GameOver();
                }

                break;

            case R.id.b3:
                if(b3.getText() == answer){
                    Toast.makeText(MainActivity.this, "Correct!", Toast.LENGTH_LONG).show();
                    NextQuestion(random.nextInt(questionLength));
                }else{
                    GameOver();
                }

                break;

            case R.id.b4:
                if(b4.getText() == answer){
                    Toast.makeText(MainActivity.this, "Correct!", Toast.LENGTH_LONG).show();
                    NextQuestion(random.nextInt(questionLength));
                }else{
                    GameOver();
                }

                break;
        }
    }
// This is going to congratulate the winner
    // when the quiz is over then you will win the game
    private void GameOver(){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
        alertDialogBuilder
                .setMessage("Game Over! Congratulations!! Winner!!")
                .setCancelable(false)
                .setPositiveButton("New Game", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        startActivity(new Intent(getApplicationContext(), MainActivity.class));
                    }
                })
                .setNegativeButton("Exit", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        System.exit(0);
                    }
                });
        alertDialogBuilder.show();

    }
// setting text for all of the buttons
    private void NextQuestion(int num){
        tv_question.setText(question.getQuestion(num));
        b1.setText(question.getchoice1(num));
        b2.setText(question.getchoice2(num));
        b3.setText(question.getchoice3(num));
        b4.setText(question.getchoice4(num));

        answer = question.getCorrectAnswer(num);
    }

}