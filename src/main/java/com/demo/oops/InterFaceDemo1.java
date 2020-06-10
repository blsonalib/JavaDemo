package com.demo.oops;

import java.net.NetworkInterface;

class Main{
    public static void main(String[] args) {
      InterFaceDemo1 n =new NewInterface1();
      n.show();
    //  n.display();
    }
}
 interface InterFaceDemo1 {
    public void show();
}
class NewInterface1 implements InterFaceDemo1 {

    @Override
    public void show() {
        System.out.println("This is show method");
    }
    public void display(){
        System.out.println("This is display method");
    }
}
