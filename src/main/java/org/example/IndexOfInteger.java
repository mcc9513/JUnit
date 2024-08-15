package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        while (true) {
            System.out.println("Enter an integer: ");
            int number = scanner.nextInt();

            if (number == 0) {
                System.out.println("You are done adding integers to the list");
                break;

            }
            list.add(number);
        }
        System.out.println("What number are you looking for in the list?");
        int number = scanner.nextInt();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)==number) {
                System.out.println(number + " is at index " + i);
            }
        }
    }
}
