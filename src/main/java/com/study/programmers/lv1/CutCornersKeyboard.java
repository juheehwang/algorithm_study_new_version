package com.study.programmers.lv1;

import java.util.HashMap;
import java.util.Map;

public class CutCornersKeyboard {

    public static void main(String[] args) {
        String[] keymap = {"AB", "AAB"};
        String[] targets = {"B"};

        solution(keymap,targets);
    }

    public static int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];

        Map<Character, Integer> keyMaps = new HashMap<>();

        // char를 키로 만든 후 최소값을 값으로 넣는 map 만들기
        for(int i = 0; i< keymap.length;i++){
            char[] chars = keymap[i].toCharArray();

            for(int j =0; j<keymap[i].length();j++){
                if(!keyMaps.containsKey(chars[j])){
                    keyMaps.put(chars[j],j+1);
                    continue;
                }
                keyMaps.put(chars[j],Math.min(keyMaps.get(chars[j]),j+1)) ;
            }
        }

        //keyMaps 바탕으로 타겟 문자열 합하기
        for(int i = 0; i<targets.length;i++){
            int min = 0;
            char[] charsA = targets[i].toCharArray();
            for (int j =0; j< targets[i].length(); j++){
                if(keyMaps.containsKey(charsA[j]) && min != -1){
                    min += keyMaps.get(charsA[j]);
                    continue;
                }
              min=-1;
            }
            answer[i] = min;
        }
        return answer;
    }
}
