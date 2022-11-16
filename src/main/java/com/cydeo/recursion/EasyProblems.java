package com.cydeo.recursion;

public class EasyProblems {

    public int recursion(int someValue) {
        if (someValue == 10) {
            return someValue;
        }
        return recursion(someValue+1);
    }

    public String reverseString(String input){
        if (input.equals("")){
            return "";
        }
        return reverseString(input.substring(1))+ input.charAt(0);
    }


  public static boolean isPalindrome(String input){
        if (input.length()==0 || input.length()==1){
            return true;
        }

       if (input.charAt(0)==input.charAt(input.length()-1)){
           return isPalindrome(input.substring(1,input.length()-1));
       }

        return false;
    }

    public static String findBinary(int decimal,String result) {
        if (decimal==0)
            return result;

        result=decimal%2+result;
        return findBinary(decimal/2,result);
    }


    public static int recursiveSummation(int inputNumber){
        if (inputNumber<=1)
            return inputNumber;
        return inputNumber+recursiveSummation(inputNumber-1);
    }

    public static void mergeSort(int[] data,int start, int end){
        if (start<end){
            int mid=(start+end)/2;
            mergeSort(data,start,mid);
            mergeSort(data,mid +1,end);
            merge(data,start,mid,end);
        }
    }


    public static void merge(int[] data,int start, int mid, int end){
        //build temp array to avoid modifying the original array
        int[]temp=new int[end-start+1];
        int i=start, j=mid+1,k=0;

        //while both sub-array have values, then try and merge them in sorted order
        while (i<=mid && j<=end){
            if (data[i]<=data[j]){
                temp[k++]=data[i++];
            }else {
                temp[k++]=data[j++];
            }
        }

        while (i<=mid){
            temp[k]=data[i];
            k++;i++;
        }
    }
















}
