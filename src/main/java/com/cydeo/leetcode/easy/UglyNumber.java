package com.cydeo.leetcode.easy;

public class UglyNumber {

    static boolean recursiveSolution(int n){
        if (n==0)return false;
        if (n==1)return true;

        if (n%2==0)return recursiveSolution(n/2);
        if (n%3==0)return recursiveSolution(n/3);
        if (n%5==0)return recursiveSolution(n/5);

        return false;
    }


    public boolean iterativeSolution(int n) {

        if(n==0) return false;

        while( n%2==0) n=n/2;

        while( n%3==0) n=n/3;

        while( n%5==0) n=n/5;

        return n==1 ;

    }
}
