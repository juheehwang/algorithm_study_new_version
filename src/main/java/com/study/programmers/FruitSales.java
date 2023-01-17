package com.study.programmers;

import java.util.*;
import java.util.stream.Collectors;

public class FruitSales {

    public static void main(String[] args) {
        int[] score = {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2};

        int result = newSolution(4, 3, score);
        System.out.println(result);
    }

    public int oldError(int k, int m, int[] score) {
        int answer = 0;

        Map<Integer, Integer> scoreMap = new HashMap<>();

        for (int j : score) {
            if (scoreMap.containsKey(j)) {
                scoreMap.replace(j, scoreMap.get(j) + 1);
            } else {

                scoreMap.put(j, 1);
            }
        }

        int left = score.length%m;


        if(left ==0){
            for(int i=0;i<k+1;i++){
                 answer+=k*m*i;
            }
        }else{
            while (left>0){
            }
        }
        return answer;
    }

    public static int newSolution(int k, int m, int[] score){
        int answer = 0;


        List<Integer> scoreList = Arrays.stream(score).boxed().sorted(Collections.reverseOrder()).collect(Collectors.toList());

        int boxCount = score.length % m;
            for(int i = 0; i<scoreList.size()-boxCount;i++ ){

                int i1 = i*m+(m-1);
                if(i1>scoreList.size()-boxCount){
                    break;
                }
                    answer += scoreList.get(i1) * m;
            }

        return answer;
    }
}
