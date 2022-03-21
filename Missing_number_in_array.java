package com.company;

import java.util.Scanner;

public class Missing_number_in_array {
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<n;i++)
            arr[i] = sc.nextInt();
        int missing = Miss(arr , n);
        if(missing != -250)
            System.out.println("Missing term is:" + missing);
        else
            System.out.println("No term is missing");
    }
    public static int Miss(int arr[] ,int m){
        int temp;
        int x = 0;
        int key = -250;
        for(int i=0;i<(m-1);i++) {
            for (int j = (i + 1); j < m; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
            for(int z = 0;z<(m - 1);z++){
                if(arr[z] != arr[z + 1] - 1){
                    key = arr[z] + 1;
                    break;
                }
            }
            return key;
        }
    }