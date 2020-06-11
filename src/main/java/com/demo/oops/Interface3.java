package com.demo.oops;

public interface Interface3 {
    static void show(){
        System.out.println("This show Method");
    }
}
interface Interface4 extends Interface3 {

    static void show(){
      System.out.println("This is not show method");
   }

}
class MainJava{
    public static void main(String[] args) {
        Interface3.show();
        Interface4.show();
    }
}