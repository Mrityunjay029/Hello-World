package com.company;

import java.util.Scanner;

public class KthLargestSmallest {
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        FindKthLargestSmallest(arr , n);
    }
    public static void FindKthLargestSmallest(int arr[] , int m){
        int temp;
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<(m-1);i++){
            for(int j = (i + 1);j<m;j++){
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Enter the value of K");
        int k = sc.nextInt();
        System.out.println("Kth Smallest Value is:" + arr[k-1]);
        System.out.println("Kth Largest Value is:" + arr[m-k]);
    }
}
