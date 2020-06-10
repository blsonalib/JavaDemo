package com.demo.stringmethod;

import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        String s1,s2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of String  :");
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        //1st step
        int l1 = s1.length();
        int l2 = s2.length();
        System.out.println("Length of first string :"+l1);
        System.out.println("Length of second string :"+l2);
        //2nd step
        String s3 = s1.concat(s2);
        System.out.println("Concatenet of String :"+s3);
        //3rd step

        System.out.println("Uppercase :"+s1.toUpperCase());
    }
}
