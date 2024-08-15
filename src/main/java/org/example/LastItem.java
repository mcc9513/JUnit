package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class LastItem {
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
        System.out.println("The last item on the list is " + list.get(list.size() - 1));
    }
}
