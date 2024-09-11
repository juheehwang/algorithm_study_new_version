package com.study.programmers.lv1;

import java.util.Stack;

public class ClawMachine {

    public static void main(String[] args) {

        int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int[] moves = {1,5,3,5,1,2,1,4};
        solution(board, moves);
    }

    public static int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for (int move : moves) {
            int real = move -1;
            for (int j = 0; j < board.length; j++) {
                if(board[j][real] == 0){
                    continue;
                }
                if (!stack.isEmpty()&& stack.peek() == board[j][real]) {
                    stack.pop();
                    board[j][real] = 0;
                    answer = answer+2;
                    System.out.println("answer = "+answer);
                }
                stack.push(board[j][real]);
                System.out.println(stack);
                break;

            }
        }
       // System.out.println(stack);
        return answer;
    }
}
