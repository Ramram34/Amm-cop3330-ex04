/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Rami Amm
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner w = new Scanner(System.in);
        System.out.println("Choose a noun:");
        String noun = w.nextLine();

        Scanner x = new Scanner(System.in);
        System.out.println("Choose a verb:");
        String verb = x.nextLine();

        Scanner y = new Scanner(System.in);
        System.out.println("Choose an adjective:");
        String adjective = y.nextLine();

        Scanner z = new Scanner(System.in);
        System.out.println("Choose an adverb:");
        String adverb = z.nextLine();

        System.out.println("Do you " + verb + " your " + adjective + " " + noun + " " + adverb + "? That's so cool!");
    }
}
