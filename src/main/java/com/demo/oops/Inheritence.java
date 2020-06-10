package com.demo.oops;

public class Inheritence {
    public static void main(String[] args) {
      Derive d = new Derive(3);
    }
}
class Base{
    public Base(){
        System.out.println("This is Base class");
    }
    public Base(int i){
        System.out.println("This is parameter class Of Base");
    }
}
class Derive extends Base{
  public Derive(){
     System.out.println("This is derived class");
  }
    public Derive(int i){
      super(3);
        System.out.println("This is derived class with parameters");
    }
}