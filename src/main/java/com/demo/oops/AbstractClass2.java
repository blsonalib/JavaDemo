package com.demo.oops;

import javax.crypto.spec.PSource;

public class AbstractClass2 {
    public static void main(String[] args) {
     Phone p = new Samsung();
     p.showConfig();
     Phone p1 = new Iphone();
     p1.showConfig();

    }
    public static void show(Phone phone){
        phone.showConfig();
    }

}
abstract class Phone{
    public abstract void showConfig();
}
class Iphone extends Phone{
    public void showConfig(){
        System.out.println("2GB Ram,IOS 9.3");
    }
}
class Samsung extends Phone{
    public void showConfig(){
        System.out.println("1GB Ram,j7");
    }
}