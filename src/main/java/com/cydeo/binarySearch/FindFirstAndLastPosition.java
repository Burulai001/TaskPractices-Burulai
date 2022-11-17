package com.cydeo.binarySearch;

import java.util.Arrays;

public class FindFirstAndLastPosition {
    public static void main(String[] args) {
        int[] arr = {3, 7, 7, 7, 7, 9, 11, 11, 11};
        int target = 11;
        System.out.println(Arrays.toString(BinarySearchSolution(arr, target)));
    }

    static int[] BruteForceSolution(int[] arr, int target) {
        //O(n),O(1)

        int[] a = {-1, -1};
        if (arr.length == 1 && arr[0] == target) {
            a[0] = 0;
            a[1] = 1;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                a[0] = i;
                break;
            }
        }


        for (int j = arr.length - 1; j >= 0; j--) {
            if (arr[j] == target) {
                a[1] = j;
                break;
            }
        }
        return a;

    }


    static int[] BinarySearchSolution(int[] arr, int target) {
        // O(log n)

        int[] ans = {-1, -1};
        //check for first occurrence if target first
        ans[0] = search(arr, target, true);

        if (ans[0] != -1) {
            ans[1] = search(arr, target, false);
        }
        return ans;

    }

    // this method just returns the index value of target
    static int search(int[] arr, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            //find the middle element
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // potential ans found
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;

    }

}



