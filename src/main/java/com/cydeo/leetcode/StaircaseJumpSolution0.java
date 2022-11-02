package com.cydeo.leetcode;

public class StaircaseJumpSolution0{

    public static void main(String[] args) {
        int n=3;
        System.out.println("Total number of to climb the "+ n + " staircase are "+solution(n)+" ways.");
    }
    public static int solution(int n) {
    //create an array and initialize the base conditions
        if (n<=0 || n==1)
            return 1;

        if (n==2)
            return 2;

        int[] arr = new int[n +1];
        arr[1]=1;
        arr[2]=2;
        arr[3]=4;

        // run for loop using base values keep on getting the further values
        for (int i=4;i<=n;i++){
            arr[i] = arr[i-1] + arr[i-2] + arr[i-3];
        }

        return arr[n];              // O(n), O(n)

    }
}
