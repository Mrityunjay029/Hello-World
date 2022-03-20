package com.company;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        reverseArray(arr , n);
    }
    public static void reverseArray(int m[] , int k){
        int temp;
        for(int j = 0;j<k/2; j++){
            temp = m[j];
            m[j] = m[(k-1)-j];
            m[(k-1)-j] = temp;
        }
        System.out.println("Reversed array is:");
        for(int j =0;j<k;j++){
            System.out.println(m[j]);
        }
    }
}
