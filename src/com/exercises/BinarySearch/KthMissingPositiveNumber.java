package com.exercises.BinarySearch;
//https://leetcode.com/problems/kth-missing-positive-number/
//https://www.youtube.com/watch?v=PM0sn2ggtlE&t=656s
public class KthMissingPositiveNumber {
    public static void main(String[] args) {
        int[] arr = new int[]{2,3,4,7,11};
        int k = 5;
        System.out.println(findKthPositive(arr, k));
    }
    static int findKthPositive(int[] arr, int k) {
        if(k < arr[0]){
            return k;
        }
        int start = 0;
        int end = arr.length - 1;
        int closestMid = 0;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] - (mid + 1) < k){
                closestMid = mid + 1;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return k + closestMid;
    }
}
