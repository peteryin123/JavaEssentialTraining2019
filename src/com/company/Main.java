package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        var scanner = new Scanner(System.in);

        System.out.print("Enter a numeric value: ");
        var number = scanner.nextDouble();

        System.out.print("Enter a numeric value: ");
        var number2 = scanner.nextDouble();

        double divide = number / number2;
        System.out.print("The answer is " + divide);
    }
}
