package com.company;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int i;
        for(i=1;i<=10;i++){
            System.out.println( n + "X" + i + "=" + (n * i));
        }
    }
}
