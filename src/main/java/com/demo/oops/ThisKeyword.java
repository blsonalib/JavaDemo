package com.demo.oops;

public class ThisKeyword {
    public static void main(String[] args) {
        This t = new This(7);
        t.show();
    }
}
class This{
    private int x = 1;    //instance
   public This(int x){    //local
       this.x = x;             //current instance
   }
   public void show(){
       System.out.println(x);
   }
}