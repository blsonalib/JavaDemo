package com.demo.example;

public class SwappingOfTwoNumbers3 {
    public static void main(String[] args) {
        int a = 4;
        int b = 5;
        a = a^b ;  //XOR  1 1=0 00=0 10=1 01=1
        b = a^b;
        a = a^b;
        System.out.println("Value of a: "+a);
        System.out.println("Value of b: "+b);
    }
}
