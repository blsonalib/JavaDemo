package com.demo.oops;

public interface Interface2 {
    public void show();
}
class MainClass{
    public static void main(String[] args) {
    Interface2 i = () -> System.out.println("this is method");
     i.show();
    }
}