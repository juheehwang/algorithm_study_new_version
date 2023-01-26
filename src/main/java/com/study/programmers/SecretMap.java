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
        String[] newArr1 = new String[n];

        for(int i = 0; i < arr1.length; i++){
            String binary1 = Long.toBinaryString(arr1[i]);
            String binary2 = Long.toBinaryString(arr2[i]);
            String result1 = binary1.length() == n? binary1 : "0".repeat(n-binary1.length())+binary1 ;
            String result2 = binary2.length() == n? binary2 : "0".repeat(n-binary2.length())+binary2 ;
            String sumNums = String.valueOf(Long.parseLong(result1)+Long.parseLong(result2));
            newArr1[i] = sumNums.length() != n ? "0".repeat(n-sumNums.length())+sumNums : sumNums;
        }

        answer = new String[n];
        for(int i = 0; i < n ; i++){
            char[] chars = newArr1[i].toCharArray();
            char[] newChars = new char[chars.length];
            for(int j = 0; j < chars.length; j++){
                newChars[j] = chars[j]== '0'? ' ': '#';
            }

            answer[i] = String.valueOf(newChars);
        }

        return answer;
    }
}
