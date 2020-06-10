package com.demo.example;

public class SwappingOfTwoNumbers2 {
    public static void main(String[] args) {
        int a = 4;
        int b = 5;
        a = a + b;   //9
        b = a - b;   //4
        a = a - b;   //5
        System.out.println("Value of a : "+a);
        System.out.println("Value of b : "+b);
    }
}
