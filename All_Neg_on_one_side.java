package com.company;

import java.util.Scanner;

public class All_Neg_on_one_side {
    public static void main(String[] args){
        int n;
        int temp;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();

        for(int i =0;i<(n - 1);i++){
            for (int j= (i + 1); j<n ;j++){
                if(arr[i] < 0 && arr[j] > 0){
                 temp = arr[i];
                 arr[i] = arr[j];
                 arr[j] = temp;
                }
            }
        }
        for(int i = 0;i<n;i++)
            System.out.println(arr[i]);
    }
}