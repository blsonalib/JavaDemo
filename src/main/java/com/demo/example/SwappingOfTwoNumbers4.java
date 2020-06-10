package com.demo.example;

public class SwappingOfTwoNumbers4 {
    public static void main(String[] args) {
        int a =9;
        int b =10;
        b = a+b-(a=b);
        System.out.println(a+ " "+b);
    }
}
