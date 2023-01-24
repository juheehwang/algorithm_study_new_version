package com.study.programmers;

public class CountDivisorAndAddOfNums {

    public static void main(String[] args) {

        int solution = solution(24, 27);
        System.out.println(solution);
    }

    public static int solution(int left, int right) {
        int answer = 0;
        for(int i = left; i <= right; i++){
            int count =1;
           for(int j = 2; j <= i; j++){
               if(i%j == 0){
                   count++;
               }
           }
           if(count % 2 == 0){
               answer = answer + i;
           }else{
               answer = answer - i;
           }
        }
        return answer;

    }
}
