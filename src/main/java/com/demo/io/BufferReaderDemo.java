package com.demo.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderDemo {
    public static void main(String[] args) throws IOException {
        System.out.println("enter the number");
        InputStreamReader ip = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(ip);
        int i = Integer.parseInt(b.readLine()) ;
        System.out.println(i);
    }
}
