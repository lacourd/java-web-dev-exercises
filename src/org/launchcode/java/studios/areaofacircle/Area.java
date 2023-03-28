package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your radius: ");

//        System.out.println(radius.getClass().getName());
        if (!input.hasNextDouble()) {
            System.out.println("Error: You have entered an invalid value for a radius.");
            return;
        }
        double radius = input.nextDouble();
        while (radius < 0) {
            System.out.println("Radius cannot be a negative number. Please enter your radius: ");
            radius = input.nextDouble();
        }
        Double area = Circle.getArea(radius);
        System.out.println("The area of a circle of radius " + radius + " is: " + area);
    }
}
