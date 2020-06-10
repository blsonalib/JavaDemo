package com.demo;

public class Ternaryoperator {
    public static void main(String[] args) {
       /* int i = 1;
        int j ;
        j = (i==1)?5:9;
        System.out.println(j);*/
     /* Object obj1;
       if(true){
           obj1 = new Integer(10);
       }else {
         obj1 =  new Double(12.9);
       }
        System.out.println(obj1);*/
     Object obj1;
     Object obj2;
     obj2 = (true)?new Float(12.9):new Double(9);
        System.out.println(obj2);
    }
}
