package com.study.programmers;

import java.util.Map;

public class FindModIsOne {

    public static void main(String[] args) {

        int solution = solution(64);


        System.out.println("solution "+ solution);
    }

    public static int solution(int n) {
        int answer = 0;

       for(int i = 2; i < n; i++){
           if(n % i == 1){
               return i;
           }
       }

        return answer;
    }
}
