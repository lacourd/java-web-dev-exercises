package org.launchcode.java.studios.quiz;

import java.util.ArrayList;

public class MultipleChoice extends Question {
    private String question;

//    private int numberOfAnswers = 1;
    private Integer correctAnswer;

    private ArrayList<String> answers = new ArrayList<>();

    public MultipleChoice(String question, ArrayList<String> answers, Integer correctAnswer) {
        super(question, answers, correctAnswer);
    }

    public void checkAnswers(Integer answer, ArrayList<String> answers, Integer correctAnswer) {
        System.out.println("You entered " + answers.get(answer));
        System.out.println("The correct answer was " + answers.get(correctAnswer));
    }

}
