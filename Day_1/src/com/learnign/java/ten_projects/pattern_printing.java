package com.learnign.java.ten_projects;

public class pattern_printing {
    public static void main(String[] args) {
        for(int i = 0; i<10; i++) {
            System.out.println();
            for (int j = i; j<10; j++) {
                System.out.print("*");
            }
        }
    }
}
