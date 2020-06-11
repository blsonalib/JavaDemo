package com.demo.oops;

public interface InterFace5 {
}
class Example implements InterFace5{
  public void show(){
      System.out.println("This is not a class");
  }
}
class MJava{
    public static void main(String[] args) {
        InterFace5 i = new Example();
        if(i instanceof InterFace5){
            System.out.println("I is object reference");
        }else {
            System.out.println("not reference");
        }
    }
}