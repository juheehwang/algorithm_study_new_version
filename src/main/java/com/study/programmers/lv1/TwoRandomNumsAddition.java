package com.study.programmers.lv1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TwoRandomNumsAddition {
    public static void main(String[] args) {
        int[] nums = {2,1,3,4,1};
        System.out.println(solution(nums));
    }
    public static int[] solution(int[] numbers) {
        int[] answer = {};

        Map<Integer,Integer> addtions = new HashMap<>();

        for(int i = 1; i < numbers.length; i++){
            for(int y = 0; y < i; y++){
                if(!addtions.containsKey(numbers[i]+numbers[y])){
                    addtions.put(numbers[i]+numbers[y],1);
                }
            }
        }

        List<Integer> list = addtions.keySet().stream().sorted().collect(Collectors.toList());

        answer = new int[list.size()];

       for(int i = 0; i<list.size();i++ ){
           answer[i] = list.get(i);
       }
       return answer;

    }
}
