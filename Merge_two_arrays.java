package com.company;

import java.util.Scanner;

public class Merge_two_arrays {
    public static void main(String[] args){
        int n,m;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ;i<n;i++)
            arr[i] = input.nextInt();
        m = input.nextInt();
        int arr1[] = new int[m];
        for(int i = 0;i<m;i++)
            arr1[i] = input.nextInt();
        merge(arr,arr1,n,m);
    }
    public static void merge(int arr[] , int arr1[] , int n , int m){
        int arr2[] = new int[m + n];
        for(int i = 0;i<(m+n);i++){
            if(i < n)
                arr2[i] = arr[i];
            else
                arr2[i] = arr1[i -n];
        }
        for(int i=0;i<(m+n);i++)
            System.out.println(arr2[i]);
    }
}
