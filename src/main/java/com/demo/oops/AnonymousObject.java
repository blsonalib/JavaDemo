package com.demo.oops;

public class AnonymousObject {
    public static void main(String[] args) {
       // Anonymous a = new Anonymous();
       // a.show();
        new Anonymous().show();
    }
}
class Anonymous{
    int i = 5;
    void show(){
        System.out.println(i);
    }

}