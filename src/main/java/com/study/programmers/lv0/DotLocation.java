package com.study.programmers.lv0;

public class DotLocation {
    public int solution(int[] dot) {
        int x = 0;
        int y = 0;
        x = dot[0] > 0 ? x+1 :x -1;
        y = dot[1] > 0 ? y+1 :y -1;
        int sum = x + y;

        if(sum == 0) {
            return x > 0 ? 2 : 4;
        } else{
            return sum > 0 ? 1 : 3;
        }
    }
}
