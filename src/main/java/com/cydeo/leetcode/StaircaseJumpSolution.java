package com.cydeo.leetcode;

public class StaircaseJumpSolution {
    public static void main(String[] args) {

        int n = 5;
        System.out.println("Total number of to climb the " + n + " staircase are " + climbStairs(n) + " ways.");
    }


    public static int climbStairs(int n) {

        if (n == 0)
            return 1;
        if (n == 1)
            return 1;
        if (n == 2)
            return 2;
        if (n==3)
            return 4;
                                                                                    // 3                   4
        return climbStairs(n-1) + climbStairs(n-2) + climbStairs(n-3);  // n=(2)+(1)+(1)=4  n=(4)+(2)+(1)=7
    }

}









