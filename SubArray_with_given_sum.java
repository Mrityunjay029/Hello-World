package com.company;

import java.util.Scanner;

public class SubArray_with_given_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int sum;
        int index = -1;
        int index1 = -1;

        n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.println("Enter the value of SUM:");
        int sum1 = sc.nextInt();

        int z = 0;
        for (int i = 0; i < n; i++) {
            index = i;
            sum = 0;
            for (int j = i; j < n; j++) {
                sum = sum + arr[j];
                index1 = j;
                if (sum == sum1) {
                    System.out.println("The sum lies from position " + (index +1) + " to " + (index1 + 1));
                    z = -1;
                    break;
                }
            }
            if (sum == sum1)
                break;
        }
        if (z != -1)
            System.out.println(" The sub-array does not exist");
    }
}