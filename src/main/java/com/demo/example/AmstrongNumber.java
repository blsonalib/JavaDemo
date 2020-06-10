package com.demo.example;
/*
153 = 1*1*1 + 5*5*5 + 3*3*3
     = 1+125+27
     = 153
 */
public class AmstrongNumber {
    public static void main(String[] args) {
        int n = 153;
        int r, sum =0,temp;
        temp =n;
        while(n>0){
            r = n%10;     //3
            n =n/10;   //15
            sum = sum + r*r*r;
        }
       if(temp == sum)
           System.out.println("Number is an Amstong");
       else
           System.out.println("Number is not an Amstrong");
    }
}
