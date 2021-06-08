package oop.exercises;
import java.util.Scanner;
/*
 * UCF cop3330 Summer 2021 Assignment 1 solutions
 * Copyright 2021 Keondez Robinson
 */
public class Main
{
    public static void main(String[] args) {
        int temp, result;
        String c, choice, convert;
        Scanner input;

        input = new Scanner(System.in);

        System.out.println("Press C to convert from Fahrenheit to Celsius.");
        System.out.println("Press F to convert from Celsius to Fahrenheit.");
        System.out.print("Your choice: ");
        c = input.next();

        choice = c.equalsIgnoreCase("C") ? "Celsius" : "Fahrenheit";
        convert = choice.equals("Celsius") ? "Fahrenheit" : "Celsius";

        System.out.print("Please enter the temperature in " + convert + ": ");
        temp = input.nextInt();
        result = c.equalsIgnoreCase("C") ? (temp - 32) * 5 / 9 : (temp * 9) / 5 + 32;
        System.out.println("The temperature in " + choice + " is " + result + ".");
    }
}
