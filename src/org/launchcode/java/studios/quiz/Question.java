package org.launchcode.java.studios.quiz;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Question {
    private String question;

    private int numberOfAnswers;

    private Integer correctAnswer;

    private ArrayList<String> answers = new ArrayList<>();

    public Question(String question, ArrayList<String> answers, Integer correctAnswer) {
        this.question = question;
        this.answers = answers;
        this.correctAnswer = correctAnswer;
    }

    public void askQuestion() {
        Scanner getAnswer = new Scanner(System.in);
        System.out.println(this.question);
        displayAnswers();
        Integer answer = getAnswer.nextInt();
        checkAnswers(answer, answers, correctAnswer);
//
    }

    public void checkAnswers(Integer answer, ArrayList<String> answers, Integer correctAnswer) {
        System.out.println("You entered " + answers.get(answer));
        System.out.println("The correct answer was " + answers.get(correctAnswer));
    }

    public void displayAnswers() {
        for (int i = 0; i < answers.size(); i++) {
            System.out.println(i + ". " + answers.get(i));
        }
    }

    public void displayCorrect() {}

//    public abstract void checkAnswers(String userInput);
}
