package com.demo;

public class SwitchCaseForString {
    public static void main(String[] args) {
        String s = "good";
        switch (s){
            case "bye":
                System.out.println("bye");
                break;
            case "BYE":
                System.out.println("BYE");
                break;
            case "Hi":
                System.out.println("Hi");
                break;
            default:
                System.out.println("Invalid");
        }
    }
}
