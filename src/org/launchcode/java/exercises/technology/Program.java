package org.launchcode.java.exercises.technology;

public class Program {
    public static void main(String[] args) {
        Laptop myLaptop = new Laptop("Apple", "MacBook Pro", "Mac OS Ventura", 2018, 16, 500);
        SmartPhone myIphone = new SmartPhone("Apple", "iPhone 11", "iOS 16.4.1", "Xfinity Mobile", 2020, 4, 256);
        System.out.println(myLaptop.getId());
        System.out.println(myIphone.getId());
    }
}
