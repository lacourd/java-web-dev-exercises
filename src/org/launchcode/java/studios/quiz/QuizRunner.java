package org.launchcode.java.studios.quiz;

import java.util.ArrayList;

public class QuizRunner {

    public static void main(String[] args) {
        String q1 = "What is the day that comes after Tuesday?";
        ArrayList<String> answers1 = new ArrayList<>();
        answers1.add("Monday");
        answers1.add("Wednesday");
        answers1.add("Saturday");
        answers1.add("Thursday");
        MultipleChoice question1 = new MultipleChoice(q1, answers1, 1);
        question1.askQuestion();
        String q2 = "The sky is blue.";
        ArrayList<String> answers2 = new ArrayList<>();
        TrueFalse question2 = new TrueFalse(q2, answers2, 1);
        question2.askQuestion();
//        Quiz myQuiz = new Quiz();
//        myQuiz.addQuestion(question1);
//        myQuiz.runQuiz();
    }
}
