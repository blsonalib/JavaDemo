package com.demo.oops;

class CallByValue {


    public static void main(String[] args) {
         B b = new B();
         System.out.println(b.x+" "+b.y);
         A.setValue(b);
        System.out.println(b.x+" "+b.y);
    }
}
class A{
    public static void setValue(B b){
        b.x =20;
        b.y =30;
    }
}
class B{
    int x,y;
}