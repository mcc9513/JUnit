package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class HowLong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        while (true) {
            System.out.println("Enter a string of text: ");
            String text = scanner.nextLine();

            if (text.isEmpty()) {
                break;
            }
            list.add(text);
        }
        System.out.println("The length of the list is " + list.size());
    }
}
