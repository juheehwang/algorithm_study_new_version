package com.study.baekjoon;


import java.util.Scanner;

public class Treasure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        int[] a = new int[n];
        int[] b = new int[n];

        for(int i=0; i<a.length; i++) {
            a[i] = sc.nextInt();
        }
        for(int i=0; i<b.length; i++) {
            b[i] = sc.nextInt();
        }

        sum = solution(n, a, b);
        System.out.println(sum);


    }
    public static int solution(int n, int[] a, int[] b){

        for(int i = 0;i < n; i++){
            for(int j = i+1; j < n; j++) {
                if (a[j] > a[i]) {
                    int temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
                if (b[j] < b[i]) {
                    int temp1 = b[j];
                    b[j] = b[i];
                    b[i] = temp1;
                }
            }
        }
        int answer = 0;
        for (int i = 0; i< n; i++){
            answer += a[i]*b[i];
        }

        return answer;

    }
}
