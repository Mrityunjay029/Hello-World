package com.company;

public class Panagrams {
    public static void main(String[] args) {
        String str = "abcdefghijklmnopqrstuvwxyz";
        String str1 = "Apdeafs@k lsmnl";
        int arr[] = new int[26];
        int index = 0;
        str1 = str1.toLowerCase();
        for(int i=0;i<str1.length();i++){
            char ch = str1.charAt(i);
            index = str.indexOf(ch);
            if(index != -1) {
                arr[index]++;
                if (arr[index] > 1)
                    break;
            }
        }
        for(int i=0;i<26;i++){
            if(arr[i] > 1){
                System.out.println(str.charAt(i));
                break;
            }
        }
    }
}
