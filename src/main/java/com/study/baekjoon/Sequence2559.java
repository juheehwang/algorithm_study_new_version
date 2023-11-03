package com.study.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sequence2559 {

    public static void main(String[] args) throws IOException {
        int result = solution();
        System.out.println(result);
    }

    public static int solution() throws IOException {
        int max = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] array = new int[n];
        for(int i=0;i<n;i++){
            array[i]=Integer.parseInt(st.nextToken());
        }

        int num =0;
        while(num+k < n){
            int sum = 0;
            for(int i = num; i<num+k;i++){
                sum = sum +array[i];
            }
            if(sum >max){
                max = sum;
            }
            num = num+1;
        }

        return max;
    }

}
