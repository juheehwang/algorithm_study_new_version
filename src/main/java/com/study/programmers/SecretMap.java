package com.study.programmers;

import java.util.Arrays;

public class SecretMap {

    public static void main(String[] args) {

        int[] arr1 = {46, 33, 33 ,22, 31, 50};
        int[] arr2 = {27 ,56, 19, 14, 14, 10};
        String[] solution = solution(6, arr1, arr2);
        for (int i = 0; i<solution.length; i++){

            System.out.println(solution[i]);
        }
    }

    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = {};
        String[] binaryArr = new String[n];

        for(int i = 0; i < n; i++){
            String binary1 = Long.toBinaryString(arr1[i] | arr2[i]);
            binaryArr[i]  = binary1.length() == n? binary1 : "0".repeat(n-binary1.length())+binary1 ;
        }

        answer = new String[n];

        for(int i = 0; i < n ; i++){
            char[] chars = binaryArr[i].toCharArray();
            char[] newChars = new char[chars.length];
            for(int j = 0; j < chars.length; j++){
                newChars[j] = chars[j] == '0'? ' ': '#';
            }

            answer[i] = String.valueOf(newChars);
        }

        return answer;
    }
}
