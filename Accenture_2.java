package com.company;

import java.util.Scanner;

public class Accenture_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r = 7;
        int unit = 2;
        int n = 8;
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int i = 0;
        int total = r * unit;
        System.out.println(total);
        int sum = 0;
        while(sum < total){
            sum = sum + arr[i];
            i++;
            System.out.println(sum);
        }
        System.out.println(sum-total);
    }
}
