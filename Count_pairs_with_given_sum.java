package com.company;

import java.util.Scanner;

public class Count_pairs_with_given_sum {
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<n;i++)
            arr[i] = sc.nextInt();

        int num = count(arr , n);
        System.out.println(num);
    }
    public static int count(int arr[] , int n){
        int k = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("SUM : ");
        int sum = input.nextInt();
        for(int i = 0;i<(n-1);i++){
            for(int j = (i + 1);j<n;j++){
                if(sum == arr[i] + arr[j])
                    k++;
            }
        }
        return k;
    }
}
