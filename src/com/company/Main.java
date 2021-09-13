/*
 *  UCF COP3330 Fall 2021 Assignment 16 Solution
 *  Copyright 2021 Diego Santiago
 */


package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        System.out.print("What is your age? ");
        String s1 = x.nextLine();
        Integer num1 = null;
        try {
            num1 = Integer.valueOf(s1);

        } catch (NumberFormatException exception) {
            System.out.print("Input only integers please.");
            System.exit(0);
        }
        int n1 = num1;

        String s2 = n1<(16)? "You are not old enough to legally drive.":"You are old enough to legally drive.";
        System.out.println(s2);

        System.exit(0);
    }
}
