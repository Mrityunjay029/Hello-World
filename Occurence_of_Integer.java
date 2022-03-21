package com.company;

import java.util.Scanner;

public class Occurence_of_Integer {
    public static void main(String[] args) {
        int Occ = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.println("Enter value of k");
        int k = sc.nextInt();

            for (int i = 0; i < n; i++) {
                if (k == arr[i]) {
                    Occ++;
                }
            }
            if(Occ != 0)
                System.out.println("Occurence is:" + Occ);
            else
                System.out.println("Occurence is:" + 0);
        }
}