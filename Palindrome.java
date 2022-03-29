package com.company;
import java.util.Scanner;

public class Palindrome {

        public static void main(String[] args) {

            Scanner sc=new Scanner(System.in);
            String A=sc.next();
            /* Enter your code here. Print output to STDOUT. */
            int z = 0;
            for(int i=0;i<A.length()/2;i++){
                if(A.charAt(i) == A.charAt(A.length()-(i + 1)))
                    z = -1;
                else{
                    z = -2;
                    break;
                }
            }
            if(z == -1)
                System.out.println("Yes");
            else if(z == -2)
                System.out.println("No");
            else if(z == 0)
                System.out.println("Yes");

        }
    }
