package com.demo.example;

public class VarArgsExample {
    public static void main(String[] args) {
        Display display = new Display();
        display.show(5,2,6,8,7,10,9);
        display.show(5);
       // display.show("shib","rina");
    }
}
class Display{
    public void show(int ...n){
        for(int i:n) {
            System.out.println(i);
        }
    }
    public void show(int n){
        System.out.println(n);
    }
}