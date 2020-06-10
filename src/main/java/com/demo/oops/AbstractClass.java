package com.demo.oops;

public class AbstractClass {
    public static void main(String[] args) {
        Ramesh r = new Suresh();
        r.call();
        r.move();
        r.dance();
        r.cook();
    }
}
abstract class Ramesh{
    public void call(){
        System.out.println("calling");
    }
    public abstract void move();
    public abstract void dance();
    public abstract void cook();
}
abstract class Mahesh extends Ramesh{
    public void move(){
        System.out.println("Moving ...");
    }
}
class Suresh extends Mahesh{
    public void dance(){
        System.out.println("Dancing...");
    }
    public void cook(){
        System.out.println("Cooking");
    }
}