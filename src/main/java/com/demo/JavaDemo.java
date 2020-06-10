package com.demo;

public class JavaDemo {
    public static void main(String[] args) {
     int a = 5;
     int b = 10;
     int c =1;
     if(a>b && b>c || a<b && b<c){
         System.out.println("A");
     }else if(c>b){
         System.out.println("B");
     }else{
         System.out.println("C");
     }
    }
}
