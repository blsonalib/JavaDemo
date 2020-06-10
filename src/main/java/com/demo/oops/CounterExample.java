package com.demo.oops;

public class CounterExample {

    public static void main(String[] args) {
        Count obj1 = new Count();
        obj1.show();
        Count obj2 = new Count();
        obj2.show();
        Count obj3 = new Count();
        obj3.show();
    }
}
class Count{
    static int i = 0;
    public void show(){
        i++;
        System.out.println(i);
    }
}