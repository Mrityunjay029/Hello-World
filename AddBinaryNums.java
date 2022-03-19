package com.company;

import java.util.Scanner;

public class AddBinaryNums {
    public static void main(String[] args){
        int len;
        int len1;
        int i;
        int dec1 = 0;
        int dec2 = 0;
        Scanner sc = new Scanner(System.in);
        len = sc.nextInt();
        int binary1[] = new int[len];
        for(i=0;i<len;i++){
            binary1[i] = sc.nextInt();
        }
        for(i=0;i<len;i++){
            dec1 = (int) (dec1 + (binary1[i] * Math.pow(2,(len-(1 + i)))));
        }
        System.out.println(dec1);

        len1 = sc.nextInt();
        int binary2[] = new int[len1];
        for(i=0;i<len1;i++){
            binary2[i] = sc.nextInt();
        }
        for(i=0;i<len1;i++){
            dec2 = (int) (dec2 + (binary2[i] * Math.pow(2,(len1-(1 + i)))));
        }
        System.out.println(dec2);

        int sum = dec1 + dec2;

        int q = -1;
        int rem;
        int j =0;
        int store = 0;
        int array[] = new int[100];
        while(q != 0){
            rem = sum % 2;
            q = sum / 2;
            sum = sum / 2;
            array[j] = rem;
            store =j;
            j++;
        }
        System.out.println("Binary sum is" + "=");
        for(j = store;j>=0;j--){
            System.out.print(array[j]);
        }
    }
}
