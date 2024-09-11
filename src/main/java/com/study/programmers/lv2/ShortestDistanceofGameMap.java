package com.study.programmers.lv2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ShortestDistanceofGameMap {

    static int[] dx = {0,0,-1,1};
    static int[] dy = {-1,1,0,0};
    static int[][] area;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int count = Integer.parseInt(st.nextToken());

        area = new int[M][N];
        for(int i =0; i<count; i++){
            st = new StringTokenizer(bufferedReader.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            for (int y = y1; y<y2;y++){
                for(int x= x1; x<x2; x++){
                    area[y][x] = 1;
                }
            }
        }

        for (int i =0; i<M; i++){
            for(int j=0; j<N; j++){
                if (area[i][j] == 0){

                }
            }
        }

    }

    public static int solution(int[][] maps){
        int result = 0;


        return result;
    }

}
