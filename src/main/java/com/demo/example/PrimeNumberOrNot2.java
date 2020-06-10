package com.demo.example;

public class PrimeNumberOrNot2 {
    public static void main(String[] args) {
        int num = 3;
        boolean b = isPrime(num);
        if(b)
            System.out.println("Number is prime");
        else
            System.out.println("Number is not prime");
    }

    private static boolean isPrime(int num) {
        for(int i=2;i<num;i++){
            if(num%i==0){
                return false;
            }
            break;
        }
        return true;
    }
}
