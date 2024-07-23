package com.study.programmers.lv1;

public class CleanDesktop {

    public static void main(String[] args) {
        String[] wall = {"..........", ".....#....", "......##..", "...##.....", "....#....."};
        solution(wall);
    }

    public static int[] solution(String[] wallpaper) {
        int[] answer = new int[4];
            int xmin =100000000;
            int xmax=0;
            int ymin=100000000;
            int ymax=0;

        for (int i = 0; i< wallpaper.length; i++){
            System.out.println("iiiii "+ i);
            if(wallpaper[i].contains("#")){
                xmin = Math.min(xmin, i);
                xmax = Math.max(xmax,i);

                ymin = Math.min(ymin,wallpaper[i].indexOf("#"));
                ymax = Math.max(ymax,wallpaper[i].lastIndexOf("#"));
            }
        }

        answer[0] = xmin;
        answer[1] = ymin;
        answer[2] = xmax+1;
        answer[3] = ymax+1;
        return answer;
    }
}
