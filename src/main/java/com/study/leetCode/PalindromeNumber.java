package com.study.leetCode;

public class PalindromeNumber {

    public static void main(String[] args) {
        System.out.println(solution(121));
    }
    public static boolean solution(int s) {
        if(s == 0){
            return true;
        }
        if(s<0) {
            return false;
        }

        StringBuilder sb = new StringBuilder();
        System.out.println(sb.append(s).reverse());
        if(sb == null){
            return false;
        }
        Integer.parseInt(String.valueOf(sb.append(s).reverse()));

        return String.valueOf(s).equals(sb.append(s).reverse());
    }
}
