package org.launchcode.java.studios.quiz;

import java.util.ArrayList;

public class TrueFalse extends Question {

    ArrayList<String> answers = new ArrayList<>();

    public TrueFalse(String question, ArrayList<String> answers, Integer correctAnswer) {
        super(question, answers, correctAnswer);
        answers.add("False");
        answers.add("True");
    }

}
