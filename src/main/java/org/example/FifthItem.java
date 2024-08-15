package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class FifthItem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        while (true) {
            System.out.println("Enter a string of text: ");
            String text = scanner.nextLine();
            list.add(text);
            if (text.isEmpty()) {
                break;
            }
        }
        try {
            System.out.println("The fifth item is " + list.get(5));
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println("Error please enter 5 strings");

    }

    }

}
