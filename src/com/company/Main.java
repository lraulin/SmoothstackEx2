package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String p1 = "";
        String p2 = "";
        System.out.println("What is the name of the first player?");
        p1 = s.nextLine();
        System.out.println("What is the name of the second player?");
        p2 = s.nextLine();
        while(p2.toLowerCase().equals(p1.toLowerCase())) {
            System.out.println("Both players cannot be named " + p1 + ". Try another name.");
            p2 = s.nextLine();
        }
        System.out.println("How many chips does the initial pile contain?");
        for(;;) {
            String input = s.nextLine();
            try {
                long chips = Long.parseLong(input);
            } catch (Exception e) {

            }
        }

    }
}