package com.demo.pattern;
/*
1 2 3 4 5
2 3 4 5 1
3 4 5 1 2
4 5 1 2 3
5 1 2 3 4
 */
public class Pattern7 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                int k = j+i-1;
                if(k>5)
                System.out.print(k-5+" ");
                else
                    System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}
