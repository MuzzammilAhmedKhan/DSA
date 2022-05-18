package com.exercises.recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 55, 66, 78};
        int target = 1;
        System.out.println(search(arr, target, 0, arr.length - 1));
    }

    static int search(int[] arr, int target, int s, int e){
        if(s > e){
            return -1;
        }

        int m = s + (e - s) / 2;
        if(arr[m] == target){
            return m;
        }
        if(arr[m] < target){
            return search(arr, target, m + 1, e);
        }

        return search(arr, target, s, m - 1);

    }



}
