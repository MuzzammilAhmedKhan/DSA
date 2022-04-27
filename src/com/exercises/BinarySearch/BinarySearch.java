package com.exercises.BinarySearch;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[]{-21, -15, -7, -1, 0, 12, 25, 36, 41, 58, 62, 78, 85, 98};
        int target = new Scanner(System.in).nextInt();
        System.out.println(binarySearch(arr, target));
    }

    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if( target > arr[mid]){
                start = mid + 1;
            } else if (target == arr[mid]){
                return mid;
            }
        }
        return -1;
    }
}
