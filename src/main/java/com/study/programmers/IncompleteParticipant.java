package com.study.programmers;

import java.util.*;

public class IncompleteParticipant {
    public static void main(String[] args) {

        String[] parti = {"leo", "kiki", "eden"};
        String[] comple = {"kiki", "eden"};
        String solution = solution(parti, comple);
        System.out.println(solution);
    }

    public static String solution(String[] participant, String[] completion) {
        String answer = "";

        Map<String,Integer> completeMap = new HashMap<>();

        for (String s : participant) {
            if(completeMap.containsKey(s)){
                completeMap.replace(s,completeMap.get(s)+1);
            }else {
                completeMap.put(s, 1);
            }
        }
        for (String s: completion){
           if(completeMap.containsKey(s) ){
               completeMap.replace(s, completeMap.get(s)-1);
           }
        }

        for(int i=0;i < participant.length;i++){
            if(completeMap.get(participant[i])>0){
                answer = participant[i];
            }
        }

        return answer;
    }
}
