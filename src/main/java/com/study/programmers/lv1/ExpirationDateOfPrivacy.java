package com.study.programmers.lv1;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class ExpirationDateOfPrivacy {

    public static void main(String[] args) {
        String[] terms = {"Z 3", "D 5"};
        String[] privacies = {"2019.01.01 D", "2019.11.15 Z", "2019.08.02 D", "2019.07.01 D", "2018.12.28 Z"};
        int[] result = solution("2020.01.01",terms,privacies);
        for (int i : result){
            System.out.println(" ii + "
             +       i);

        }
    }


    public static int[] solution(String today, String[] terms, String[] privacies) {
        int[] answer = new int[privacies.length];

        LocalDate date = LocalDate.parse(today.replace(".","-"));

        Map<String,Integer> termsMap = new HashMap<>();
        for (String term : terms) {
            String[] item = term.split(" ");
            termsMap.put(item[0], Integer.parseInt(item[1]));
        }
        System.out.println(termsMap);
        int count = 0;
        for(int i = 0; i<privacies.length;i++){
            String[] item = privacies[i].split(" ");
            LocalDate compare = LocalDate.parse(item[0].replace(".","-"));
            if(!date.isBefore(compare.plusMonths(termsMap.get(item[1])))){
                count++;
                answer[i]= i+1;
            }
        }
        int target = 0;
        int[] newA = new int[count];
        for(int i = 0; i<answer.length; i++){
            if(answer[i] != 0){
                System.out.println();
                newA[target++] = answer[i];
            }

        }
        return newA;
    }
}
