package com.demo.oops;

public class StaticAndNonStatic {
    public static void main(String[] args) {
      // ABCD.show();
       ABCD a = new ABCD();
       ABCD b = new ABCD();
       a.show();
       b.show();
    }
}
class ABCD{
   int num1;
    static  int num2;
    public void show(){
        num2 =9;
        System.out.println("Increament the value");
    }
}