package com.demo.stringmethod;

import java.io.IOException;

public class SyStemInMethod {
    public static void main(String[] args) throws IOException {
        int inChar;
        System.out.println("Enter a Character:");

            inChar = System.in.read();
            System.out.print("You entered ");
            System.out.println((char)inChar);
   }
}
