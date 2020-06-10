package com.demo.example;

public class PrimeNumberOrNot {
    public static void main(String[] args) {
        int n = 29;
        boolean isPrime = true;
        for(int i=2;i<n;i++){
            if(n%i==0) {
                isPrime = false;
                break;
            }
        }
      if(isPrime)
          System.out.println(n+" Number is prime number");
      else
          System.out.println("Number not prime");
    }
}
