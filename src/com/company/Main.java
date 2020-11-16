package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        var sc = new Scanner(System.in);

        double d1;
        double d2;

        try {
            System.out.print("Enter a numeric value: ");
            d1 = sc.nextDouble();
            sc.nextLine();

            System.out.print("Enter a numeric value: ");
            d2 = sc.nextDouble();
            sc.nextLine();

            System.out.println("Select an operation (+ - * /): ");
            var o1 = sc.nextLine();

            double results;

            switch (o1) {
                case "+":
                    results = d1 + d2;
                    System.out.println("The answer is " + results);
                    break;
                case "-":
                    results = d1 - d2;
                    System.out.println("The answer is " + results);
                    break;
                case "*":
                    results = d1 * d2;
                    System.out.println("The answer is " + results);
                    break;
                case "/":
                    results = d1 / d2;
                    System.out.println("The answer is " + results);
                    break;
            }
        } catch (InputMismatchException e) {
            System.out.println("Couldn't format as a number");
        }
    }
}

