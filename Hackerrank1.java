package com.company;
import java.util.Scanner;
import java.lang.Math;
public class Hackerrank1 {
    public static void main(String[] args) {
        String A = "hello";
        String B = "world";
        String s1 = A.substring(0,1);
        s1 = s1.toUpperCase();
        String s2 = A.substring(1,A.length());
        String s3 = s1 + s2;

        String s4 = B.substring(0,1);
        s4 = s4.toUpperCase();
        String s5 = B.substring(1,B.length());
        String s6 = s4 + s5;

        System.out.println(s3 + " " +s6);
    }
}