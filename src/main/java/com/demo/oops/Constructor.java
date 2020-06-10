package com.demo.oops;

public class Constructor {
    public static void main(String[] args) {
        ABC a = new ABC(2);
    }
}
class ABC{
 public ABC(){
     System.out.println("This is cons");
 }
public ABC(int a){
     System.out.println("This is int");
 }
 public ABC(double a){
     System.out.println("This is double");
 }
}