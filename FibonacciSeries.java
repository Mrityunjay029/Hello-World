package com.company;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args){
        int n,i;
        Scanner sc = new Scanner(System.in);
        //Taking input of n
        n = sc.nextInt();
        //Declaring array
        int array[] = new int[n];
        array[0] = 0;
        array[1] = 1;
        for (i=2;i<n;i++){
            array[i] = array[i-1] + array[i-2];
        }
        for (i=0;i<n;i++){
            System.out.print(array[i] + " ");
        }
    }
}
