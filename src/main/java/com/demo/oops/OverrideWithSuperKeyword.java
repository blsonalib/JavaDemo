package com.demo.oops;

public class OverrideWithSuperKeyword {
    public static void main(String[] args) {
       Derive2 d = new Derive2();
       d.show();
    }
}
class Base2{
 public void show(){
     System.out.println("This is base class");
 }
}
class Derive2 extends Base2{

    public void show(){
        super.show();
        System.out.println("This is derived class");
    }
}