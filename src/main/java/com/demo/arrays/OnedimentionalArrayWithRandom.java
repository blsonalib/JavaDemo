package com.demo.arrays;

import java.util.Random;

public class OnedimentionalArrayWithRandom {
    public static void main(String[] args) {
        Random r = new Random();
        int arr[]=new int[3];
        for(int i=0;i<arr.length;i++){
            arr[i]=r.nextInt(20);
          //  System.out.println(arr[i]);
        }
        System.out.println(24);
        for (int i:arr)
            System.out.println(i);
    }
}
