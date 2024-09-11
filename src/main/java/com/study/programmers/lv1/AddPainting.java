package com.study.programmers.lv1;

public class AddPainting {

    public static void main(String[] args) {
        int[] ints = {1,2,3,4};

        int reuslt = solution(4,1, ints);
        System.out.println(reuslt);
    }

    public static int solution(int n, int m, int[] section) {
        int answer = 1;

        int max = section[section.length-1];

        int diff = m;
        for(int i = section.length-2; i>=0; i--){
            diff = diff - (max - section[i]+1);
            System.out.println("first + " + diff);
            if(diff <= 0){
                answer ++;
                diff = m;
               i = i !=0 ? i-1 : i;
            }
            System.out.println("second + "+diff);
            max = section[i];

        }
        return answer;
    }

//    public static int solution1(int n, int m, int[] section){
//        int answer = 1;
//
//        int start = section[0];
//        int end = m + start;
//
//        for(int i = 1; i<section.length;i++) {
//
//
//        }}}
//
//
//
//
//
//    }
}
