package org.launchcode.java.exercises.ch1and2;

import java.util.Scanner;

public class AliceSearchExtended {
    public static void main(String[] args) {
        String aliceText = "Alice was beginning to get very tired " +
                "of sitting by her sister on the bank, and of " +
                "having nothing to do: once or twice she had " +
                "peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, " +
                "'and what is the use of a book,' thought Alice " +
                "'without pictures or conversation?";
        Scanner input = new Scanner(System.in);
        System.out.println("Type in your search term:");
        String searchWord = input.nextLine();
        int wordLength = searchWord.length();
        int wordIndex = aliceText.indexOf(searchWord);
        System.out.println("Index: " + wordIndex + "\nWord Length: " + wordLength);
        String newAliceText = aliceText.substring(0,wordIndex) + aliceText.substring(wordIndex+wordLength);
        System.out.println(newAliceText);
    }
}
