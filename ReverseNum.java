package com.company;

import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args){
        int num;
        int rev = 0;
        int remainder;
        Scanner sc = new Scanner(System.in);
        //Taking Input of the number to be reversed
        num = sc.nextInt();
        while(num != 0){
            remainder = num % 10;
            rev = rev * 10 + remainder;
            num = num / 10;
        }
        //Printing reversed value
        System.out.println(rev);
    }
}
