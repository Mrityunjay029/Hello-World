package com.company;

import java.util.Scanner;

public class Cyclically_rotate_array_by_one {
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n;i++)
            arr[i] = sc.nextInt();
        Rotate(arr,n);
    }
    public static void Rotate(int arr[] , int m){
        int temp;
        for(int i =0;i<(m-1);i++){
            temp = arr[i];
            arr[i] = arr[m -1];
            arr[m - 1] = temp;
        }
        for (int i = 0;i<m;i++)
            System.out.println(arr[i]);
    }
}