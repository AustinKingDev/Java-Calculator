package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner value1 = new Scanner(System.in);
        System.out.println("Enter first value");
        int firstValue = value1.nextInt();

        Scanner operator = new Scanner(System.in);
        System.out.println("operator");
        String firstOp = operator.nextLine();

        Scanner value2 = new Scanner(System.in);
        System.out.println("Enter second value");
        int secondValue = value2.nextInt();


        if (firstOp.contains("+")) {
            int addition = firstValue + secondValue;
            System.out.println(addition);
        }
        else if (firstOp.contains("-")) {
            int subtraction = firstValue - secondValue;
            System.out.println(subtraction);
        }
        else if (firstOp.contains("*")) {
            int multiplication = firstValue * secondValue;
            System.out.println(multiplication);
        }
        else if (firstOp.contains("/")) {
            int division =  firstValue / secondValue;
            System.out.println(division);
        }
    }
}
