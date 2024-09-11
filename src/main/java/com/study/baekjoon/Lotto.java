package com.study.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Lotto {
    static int n;
    static int[] arr;
    static boolean[] visit;
    static int[] result;

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            if(n==0) break;

            arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            result = new int[6];
            visit= new boolean[n];
            solution(0,0);
            System.out.println(sb);
        }


    }

    public static void solution(int k, int depths){
        if(depths == 6){
            for(int val : result){
                sb.append(val).append(" ");
            }
            sb.append("\n");
            return;
        }

        for(int i = k; i<n; i++){
            if(!visit[i]){
                visit[i] = true;
                result[depths] = arr[i];
                solution(i,depths+1);
                visit[i]=false;
            }
        }

    }
}
