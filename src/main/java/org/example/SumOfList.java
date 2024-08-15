package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class SumOfList {
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
        int sum = 0;
        for (Integer integer : list) {
            sum += integer;
        }
        System.out.println("The sum of the list is " + sum);
        }
    }

