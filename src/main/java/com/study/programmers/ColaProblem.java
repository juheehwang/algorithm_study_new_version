package com.study.programmers;

public class ColaProblem {
    public static void main(String[] args) {

        int a = 3;
        int b = 1;
        int n = 20;

        int firstReturn = n/a*b; // 8
        int firstLeft = n%a;   // 0

        int secondReturn = (firstReturn+firstLeft) / a; // 1
        int secondLeft = (firstReturn+firstLeft) % a; // 3

        int thirdReturn = (secondReturn+secondLeft) / a; // 1
        int thirdLeft = (secondLeft+secondReturn) % a; //1

        int result = firstReturn + secondReturn + thirdReturn;

        int solution1 = diffSolution(3, 1, 20);


    }

    public static int solution(int a, int b, int n) {

        int returned = (n/a)*b;
        int left = n%a;
        int temp = returned+left;
        int answer = returned;

        while(temp>=a){
            returned = (temp / a) * b;
            left = temp % a;
            temp = returned+left;
            answer += returned;
        }
        return answer;
    }

    public static int diffSolution(int a, int b, int n) {


        return (n > b ? n - b : 0) / (a - b) * b;
    }
}
