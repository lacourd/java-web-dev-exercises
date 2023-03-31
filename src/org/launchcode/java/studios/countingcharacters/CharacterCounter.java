package org.launchcode.java.studios.countingcharacters;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class CharacterCounter {
    public static void main(String[] args) {
        HashMap<String, Integer> charCounts = new HashMap<>();

//        String example = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
       System.out.println("Please enter a string: ");
       Scanner in = new Scanner(System.in);
       String example = in.nextLine();
        char[] charactersInString = example.toCharArray();
//        System.out.println(Arrays.toString(charactersInString));



        for (char character : charactersInString) {
            if (Character.isLetter(character)) {
                if (!charCounts.containsKey(String.valueOf(character).toLowerCase())) {
                    charCounts.put(String.valueOf(character).toLowerCase(), 1);
                } else {
                    Integer temp = charCounts.get(String.valueOf(character).toLowerCase());
                    temp += 1;
                    charCounts.replace(String.valueOf(character).toLowerCase(), temp);
                }
            }
        }
//        System.out.println(charCounts);
//        System.out.println(charCounts.size());

        for (Map.Entry<String, Integer> character : charCounts.entrySet()) {
            System.out.println(character.getKey() + ": " + character.getValue());
        }
    }
}
