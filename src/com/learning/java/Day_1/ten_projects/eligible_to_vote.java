package com.learning.java.Day_1.ten_projects;
import java.util.Scanner;

public class eligible_to_vote {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age : ");
        byte age = sc.nextByte();

        if(age >= 18){
            System.out.println("You are eligible !");
        }else {
            System.out.println("You are not eligible !");
        }
    }
}
