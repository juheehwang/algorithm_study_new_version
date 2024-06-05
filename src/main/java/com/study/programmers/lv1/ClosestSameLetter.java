package com.study.programmers.lv1;

public class ClosestSameLetter {

    public static void main(String[] args) {
        String sss = "banana";
        for( int i : solution1(sss)) {
            System.out.println(i);
        }
    }
    public static int[] solution1(String s){

        int[] newInt = new int[s.length()];
        char[] stringChar = s.toCharArray();

        //처음 세팅
        newInt[0] = -1;

        //그다음부터 뺑뺑이
        for(int i = 1; i < s.length(); i++) {
            int min = 10000;
            boolean flag = false;
            for(int j = 0; j < i; j++) {
                if(stringChar[i] == stringChar[j]) {
                    int temp = i-j;
                    min = min < temp? min : temp;
                    flag = true;
                }
            }

            newInt[i]= flag? min: -1;
            flag = false;
        }
        return newInt;
    }
}
