package com.company;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        int m,n;
        Scanner sc = new Scanner(System.in);
        //Input for 1st number
        m = sc.nextInt();
        //Input for 2nd number
        n = sc.nextInt();
        //Addition
        System.out.println(m+n);
        //Subtraction
        System.out.println(m-n);
        //Multiplication
        System.out.println(m*n);
        //Division
        System.out.println(m/n);
    }
}
