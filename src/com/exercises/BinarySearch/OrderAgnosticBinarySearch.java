package com.exercises.BinarySearch;

import java.util.Scanner;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[]{-21, -15, -7, -1, 0, 12, 25, 36, 41, 58, 62, 78, 85, 98};
        int target = new Scanner(System.in).nextInt();
        System.out.println(orderAgnosticBinarySearch(arr, target));
    }

    static int orderAgnosticBinarySearch(int[] arr, int target) {
        int start = 0, end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(arr[mid] == target) return mid;

            if(isAsc){
                if(target > arr[mid]){
                    start = mid + 1;
                } else if (target < arr[mid]) {
                    end = mid - 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else if (target < arr[mid]){
                    start = mid + 1;
                }
            }
        }
        return -1;

    }


}
