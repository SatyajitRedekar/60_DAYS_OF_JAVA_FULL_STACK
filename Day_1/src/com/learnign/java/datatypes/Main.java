package com.learnign.java.datatypes;

class Main{
    public static void main(String[] args){
        System.out.println("INTEGRAL NUMBERS");
        System.out.println();
        System.out.println("byte Range:");
        System.out.println("--------------");
        byte a = 100;
        System.out.println("Example byte value : "+ a);
        System.out.println("Minimum byte value " + Byte.MAX_VALUE); // -2^7 (8 bits)
        System.out.println("Maximum byte value : " + Byte.MAX_VALUE); // 2^7 - 1
        System.out.println();

        System.out.println();
        System.out.println("short Range:");
        System.out.println("--------------");
        short b = 20000;
        System.out.println("Example short value : "+ b);
        System.out.println("Minimum short value " + Short.MAX_VALUE); // -2^15 (16 bits)
        System.out.println("Maximum short value : " + Short.MAX_VALUE); // 2^15 - 1
        System.out.println();

        System.out.println();
        System.out.println("int Range:");
        System.out.println("--------------");
        int c = 1000000;
        System.out.println("Example int value : "+ c);
        System.out.println("Minimum int value " + Integer.MAX_VALUE); // -2^31 (32 bits)
        System.out.println("Maximum int value : " + Integer.MAX_VALUE); // 2^31 - 1
        System.out.println();

        System.out.println();
        System.out.println("Long Range:");
        System.out.println("--------------");
        long d = 9223372036854775807L;
        System.out.println("Example long value : "+ d);
        System.out.println("Minimum long value " + Long.MAX_VALUE); // -2^63 (64 bits)
        System.out.println("Maximum long value : " + Long.MAX_VALUE); // 2^63 - 1
        System.out.println();

        System.out.println("DECIMAL NUMBERS");
        float e = 3.128725f; // ~7 significant digit (after 7 digits start to round off)
        System.out.println("Float Examples :");
        System.out.println("------------------");
        System.out.println("Original float value : " + e);
        System.out.println("Smallest positive float : " + Float.MIN_VALUE);
        System.out.println("Largest positive float : " + Float.MAX_VALUE);
        System.out.println("Smallest negative float : -" + Float.MIN_VALUE);
        System.out.println("Largest negative float : -" + Float.MAX_VALUE);
        System.out.println();

        double f = 315.12872154215d; // ~15 significant digit (after 15 digits start to round off)
        System.out.println("double Examples :");
        System.out.println("------------------");
        System.out.println("Original float value : " + f);
        System.out.println("Smallest positive float : " + Double.MIN_VALUE);
        System.out.println("Largest positive float : " + Double.MAX_VALUE);
        System.out.println("Smallest negative float : -" + Double.MIN_VALUE);
        System.out.println("Largest negative float : -" + Double.MAX_VALUE);
        System.out.println();

        System.out.println("Character Examples:");
        System.out.println("---------------------");
        System.out.println("or");
    }
}