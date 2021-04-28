package com.example.quizmillion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Question extends AppCompatActivity {
// These are going to be my 10 questions
    //These are going to be in random order
    // Varying from different categories
    public String questions[] = {
            "Q1.Who is the current president of the united states?",
            "Q2.Which superhero got bitten by a spider?",
            "Q3.Which Portugese player plays for Juventus??",
            "Q4.What is 10 times 10?",
            "Q5.What superhero has a star on their forehead? ",
            "Q6.What color is the planet neptune?",
            "Q7.What color do you get when you mix blue and yellow",
            "Q8.Who will win the italian cup this year?",
            "Q9.Which soccer teams colors are black and white?",
            "Q10.Which soccer teams colors are black and red?"
    };
// These are going to be the answers to my questions
    //Will be multiple choice questions
    // Out of 4 options
    public String choices[][] = {
            {"Joe Biden", "Donald Trump", "George Bush", "George Washington"},
            {"superman", "ironman", "spiderman", "batman"},
            {"Lionel Messi", "Neymar", "Paulo Dybala", "Cristiano Ronaldo"},
            {"20", "30", "80", "100"},
            {"batman", "superman", "hulk", "captain america"},
            {"green", "yellow", "blue", "red"},
            {"red", "green", "pink", "orange"},
            {"inter", "juventus", "milan", "atalanta"},
            {"genoa", "palermo", "verona", "juventus"},
            {"inter", "napoli", "milan", "lazio"}
    };
// These are the correct answers to my questions
    //These are listed below
    public String correctAnswer[] = {
            "Joe Biden",
            "spiderman",
            "Cristiano Ronaldo",
            "100",
            "captain america",
            "blue",
            "green",
            "inter",
            "juventus",
            "milan"
    };
// these will get the questions
    public String getQuestion(int a){
        String question = questions[a];
        return question;
    }

    public String getchoice1(int a){
        String choice = choices[a][0];
        return choice;
    }

    public String getchoice2(int a){
        String choice = choices[a][1];
        return choice;
    }

    public String getchoice3(int a){
        String choice = choices[a][2];
        return choice;
    }

    public String getchoice4(int a){
        String choice = choices[a][3];
        return choice;
    }

    public String getCorrectAnswer(int a){
        String answer = correctAnswer[a];
        return answer;
    }
}
