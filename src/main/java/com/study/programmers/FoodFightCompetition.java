package com.study.programmers;

public class FoodFightCompetition {
    public static void main(String[] args) {
        int[] newInt = {1, 3, 4, 6};

        String s = anotherSolution(newInt);
        System.out.println(s);

    }
    public static String solution(int[] food) {
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder stringBuilder1 = new StringBuilder();
        for(int i =1; i<food.length;i++){
             if(food[i]/2>=1){
                for(int j =1;j<=food[i]/2;j++){
                    stringBuilder.append(i);
                }
            }
        }
        stringBuilder1.append(stringBuilder).append(0).append(stringBuilder.reverse());

        return stringBuilder1.toString();
    }

    public static String anotherSolution(int[] food){
        String answer="0";
        for(int i = food.length-1; i>0;i--){
            for(int j=0; j<food[i]/2;j++){
                answer = i+answer +i;
            }
        }
        return answer;
    }
}
