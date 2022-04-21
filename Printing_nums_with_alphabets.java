package com.company;

public class Printing_nums_with_alphabets {
    public static void main(String[] args){
        String s = "aaaabccddd";
        s = s + '9';
        int count = 1;
        String word="";
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                count++;
            }
            else if(s.charAt(i) != s.charAt(i+1) && count == 1)
                word = word + s.charAt(i);
            else if(s.charAt(i) != s.charAt(i+1) && count != 1){
                word = word + s.charAt(i);
                word = word + count;
                count = 1;
            }
        }
        System.out.println(word);
    }
}
