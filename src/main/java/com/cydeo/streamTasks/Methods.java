package com.cydeo.streamTasks;

import java.util.*;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

import static java.util.Arrays.stream;

public class Methods {

    public static void main(String[] args) {



//        ArrMax2();


//      long num = 6;
//        System.out.println("Factorial of 6 is: " + factorial(num));






    }


       static void ArrMax2() {
           int[] intArray = {6, 8, 3, 5, 1, 9};

          IntStream intStream = Arrays.stream(intArray);
           OptionalInt optionalInt = intStream.max();
           int maxAsInt = optionalInt.getAsInt();


           System.out.println("Maximum number = " + maxAsInt);
       }


                /* Task 1
   Write a function that can find the maximum number from an int Array
input: int[] array = {6, 8, 3, 5, 1, 9};
output: 9
*/





    static long factorial(long n) {
        return LongStream.rangeClosed(1, n)
                .reduce(1, (long a, long b) -> a * b);

        /*  Task 2
        Write a method that returns the factorial number of any given number.
FACTORIAL:
Factorial of a non-negative integer, is multiplication of all positive integers
smaller than or equal to n. For example factorial of 6 is 6*5*4*3*2*1 which is 720.
EXAMPLE:
Input: 5
Output: 120
Explanation: 5 * 4 * 3 * 2 * 1 = 120
*/
    }





    static void ArrFrequency(String[] str){
   //     List<String> stringList = Arrays.asList("Apple", "Banana", "apple", "Cherry", "Apple");
 //stringList.stream()
     //    .distinct().forEach(String::);
    }

    /*  Task 4
    Write a function that takes a String array as parameter, and
returns a map object that contains each element of array as key
and their occurrence counts as value.
● For calculating occurrence, array elements should be
checked by regarding case sensitivity.
● Order is not important.
     */
}
