package com.demo.example;
//6 = 1+2+3 =6
//28 = 1+3+4+7+14 =28

public class PerfectNumber {
    public static void main(String[] args) {
        int n = 28;
        boolean b = isPerfect(n);
        if(b)
            System.out.println("Number is perfect number");
        else
            System.out.println("Number is not perfect");
    }

    private static boolean isPerfect(int n) {
        int sum = 0;
        for(int i=1;i<n;i++){
            if(n%i==0)
                sum += i;
        }
        if(sum == n)
            return true;
        return false;
    }
}