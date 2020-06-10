package com.demo.oops;

public class FinalExample {
    public static void main(String[] args) {
        Q q = new Q();
        q.show();
    }
}
class P{
   public void show(){
        System.out.println("In a p");
    }
}
class Q extends P{
    public void show(){
        System.out.println("In a Q");
    }
}