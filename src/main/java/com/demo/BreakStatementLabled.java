package com.demo;

public class BreakStatementLabled {
    public static void main(String[] args) {
        sona:
     for (int i = 1;i<5;i++){
         for (int j =1;j<5;j++){
             if(i == 3){
                 break sona;
             }
             System.out.print(" * ");
         }
         System.out.println(" ");
     }
    }
}
