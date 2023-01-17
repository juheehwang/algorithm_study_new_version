package com.study.programmers;

public class SmallSizeOfPartialString {
    public static void main(String[] args) {
        int result = countSmallNums("500220839878", "7");
        System.out.println("result "+result);
    }

    public static int countSmallNums(String t, String p){
        int count =0;
        Long comparedNum = Long.parseLong(p);

        for(int i=0; i<=t.length()-p.length();i++){

            if(comparedNum >= Long.parseLong(t.substring(i, i+p.length()))){
                count++;
            }
        }

        return count;
    }
}
