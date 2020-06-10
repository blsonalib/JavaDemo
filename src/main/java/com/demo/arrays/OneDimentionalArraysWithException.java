package com.demo.arrays;

import java.util.Random;

public class OneDimentionalArraysWithException {
    public static void main(String[] args) {
        Random r = new Random();
        int arr[] = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(50);
            //  System.out.println(arr[i]);
        }
        try {
            System.out.println(arr[25]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Maximum index of the array is 19");
        }
        for (int i : arr)
            System.out.println(i);
    }
}
