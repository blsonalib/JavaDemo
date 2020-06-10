package com.demo.arrays;

public class TwoDimentionalArrays1 {
    public static void main(String[] args) {
        int arr[][]={
                      {2,3,6,7,8},
                      {1,3,8,9,0},
                      {3,6,7,9,4}
                    };
        /*for(int i=0;i<3;i++){
            for(int j=0;j<5;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }*/
        for(int[] i : arr){
            for (int j:i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
