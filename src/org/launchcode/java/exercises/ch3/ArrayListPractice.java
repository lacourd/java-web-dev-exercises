package org.launchcode.java.exercises.ch3;
import java.util.ArrayList;
public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        nums.add(6);
        nums.add(7);
        nums.add(9);
        nums.add(8);
        nums.add(10);

        System.out.println(sumEven(nums));


    }

    public static int sumEven(ArrayList<Integer> arr) {
        int total = 0;
                for (int num : arr) {
                    if (num%2 == 0) {
                        total += num;
                    }

                }
        return total;
    }
}
