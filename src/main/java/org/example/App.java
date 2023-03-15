package org.example;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Object number1 = 10, number2 = 20.5;
        double num1 = getDoubleUsingSwitch(number1);
        double num2 = getDoubleUsingSwitch(number2);
        // Take input from the user
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the operator (+,-,*,/)");

        char operation = sc.next().charAt(0);

        double output = switch (operation) {
            case '+' -> num1 + num2;
            case '-' -> num1 - num2;
            case '*' -> num1 * num2;
            case '/' -> num1 / num2;
            default -> {
                System.out.println("You enter wrong input");
                yield 0;
            }
        };

        System.out.println("The final result:");

        System.out.println();

        // print the final result
        System.out.println(num1 + " " + operation + " " + num2 + " = " + output);
    }

    static double getDoubleUsingSwitch(Object o) {
        return switch (o) {
            case Integer i -> i.doubleValue();
            case Float f -> f.doubleValue();
            case Double d -> d;
            case String s -> Double.parseDouble(s);
                default -> 0d;
        };
    }
}
