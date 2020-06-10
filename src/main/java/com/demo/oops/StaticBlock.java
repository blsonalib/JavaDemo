package com.demo.oops;

public class StaticBlock {
    static String s = "";
    static {
           s = "Hello World";
    }
    public static void main(String[] args) {
        System.out.println("The String value : "+s);
    }

}
