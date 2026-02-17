package com.learnign.java.ten_projects;

import java.util.Scanner;
public class even_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        if(num%2==0){
            System.out.println("This is the even number !");
        }else {
            System.out.println("This is the odd number !");
        }
    }
}
