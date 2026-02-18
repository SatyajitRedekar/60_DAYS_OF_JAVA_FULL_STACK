package com.learning.java.Day_1.ten_projects;
import java.util.Scanner;

public class simple_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your equation : ");
        int num1 = sc.nextInt();
        String operator = sc.next();
        int num2 = sc.nextInt();

        if (operator.equals("+")) {
            System.out.println(num1+num2);
        }else if (operator.equals("-")) {
            System.out.println(num1-num2);
        }else if (operator.equals("/")) {
            System.out.println(num1/num2);
        } else if (operator.equals("*")) {
            System.out.println(num1*num2);
        }else {
            System.out.println("Enter the valid operator !");
        }

    }
}
