package com.company;

import java.util.Scanner;

public class SwapVar {
    public static void main(String[] args){
        int x , y;
        int temp;
        Scanner sc = new Scanner(System.in);
        // taking input for x
        x = sc.nextInt();
        // taking input for y
        y = sc.nextInt();
        //Swapping
        temp = x;
        x = y;
        y = temp;
        // printing swapped values
        System.out.println(x);
        System.out.println(y);
    }
}
