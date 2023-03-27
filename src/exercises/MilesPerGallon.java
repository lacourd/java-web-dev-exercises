package exercises;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven?");
        double miles = input.nextDouble();
        System.out.println("How much gas have you consumed (in gallons)?");
        double gallons = input.nextDouble();
        float milesPerGallon = (float) (miles/gallons);
        System.out.println("The miles per gallon (MPG) for your trip is " + milesPerGallon);
    }
}
