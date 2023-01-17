package com.study.leetCode;

public class ClimbingStars {

    public static void main(String[] args) {

      int result =  climbStairs(2);
        System.out.println(result);
    }

    public static int climbStairs(int n){
        int[] array = new int[n+1];

     for(int i = 0; i<=n; i++){
         if( i==0 || i==1){
              array[i] =1;
         }else{
            array[i]= array[i-1]+ array[i-2];
         }
         System.out.println("array["+i+"]"+ array[i]);
     }

     return array[n];
    }

}
