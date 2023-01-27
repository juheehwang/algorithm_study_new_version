package com.study.programmers;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class KthNumbers {

    public static void main(String[] args) {

        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        int[] solution = solution(array, commands);
        System.out.println("Solution : "+solution);
    }

    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i = 0; i < commands.length; i++){
        List<Integer> newList = new ArrayList<>();
            for(int j = (commands[i][0]-1); j < commands[i][1]; j++){
                newList.add(array[j]);
            }
            newList.sort(Comparator.naturalOrder());
            answer[i] = newList.get(commands[i][2]-1);
        }
        return answer;
    }
}
