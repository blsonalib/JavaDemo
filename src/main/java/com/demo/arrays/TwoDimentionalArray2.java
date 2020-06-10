package com.demo.arrays;

public class TwoDimentionalArray2 {
    public static void main(String[] args) {
        String arr[][] ={
                            {"Siya","Jaya"},
                            {"Rekha","shushma"}
                        };
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
