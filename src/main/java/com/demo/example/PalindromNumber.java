package com.demo.example;
//121 535
import java.util.Scanner;

public class PalindromNumber {
    public static void main(String[] args) {
        int r , s=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n = sc.nextInt();
        int temp = n;
        while (n>0){
            r = n%10;    //1
            n = n/10;     //12
            s = s*10+r;
        }
        if(temp == s)
            System.out.println("Number is palindrom");
        else
            System.out.println("Number is not palindrom");
    }
}
