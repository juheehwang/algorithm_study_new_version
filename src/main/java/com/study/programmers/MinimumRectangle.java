package com.study.programmers;

public class MinimumRectangle {

    public static void main(String[] args) {

        int[][] size = {{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}};
        int solution = solution(size);
        System.out.println("solution "+ solution);
    }
    public static int solution(int[][] sizes) {
        int answer = 0;
        int vMax = sizes[0][0];
        int hMax = sizes[0][1];

        for(int i = 0; i < sizes.length; i++){
            for(int j = 0; j<2; j++){
                if(sizes[i][0]< sizes[i][1]){
                    int temp = sizes[i][0];
                    sizes[i][0] = sizes[i][1];
                    sizes[i][1] = temp;
                }
            }
        }

        for(int i = 1; i < sizes.length; i++){
            if(vMax < sizes[i][0] ){
                vMax = sizes[i][0];
            }
            if(hMax < sizes[i][1]){
                hMax = sizes[i][1];
            }
        }
        answer = vMax * hMax;
        return answer;
    }
}
