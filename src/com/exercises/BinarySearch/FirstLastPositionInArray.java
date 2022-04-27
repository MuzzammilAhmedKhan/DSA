package com.exercises.BinarySearch;
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
//Find First and Last Position of Element in Sorted Array
//Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
//If target is not found in the array, return [-1, -1].
//You must write an algorithm with O(log n) runtime complexity.
//Input: nums = [5,7,7,8,8,10], target = 8
//Output: [3,4]
public class FirstLastPositionInArray {
    public static void main(String[] args) {
        int[] nums = new int[]{5, 7, 7, 7, 7, 8, 8, 10};
        int target = 7;
        int[] ans = new int[2];
        ans = searchRange(nums, target);
        for(int a : ans){
            System.out.print(a + " ");
        }

    }

    static int[] searchRange(int[] nums, int target){
        int[] arr = new int[]{-1, -1};
        arr[0] = search(nums, target, true);
        if(arr[0] != -1){
            arr[1] = search(nums, target, false);
        }
        return arr;
    }

    static int search(int[] nums, int target, boolean fromZeroIndex){
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target > nums[mid]){
                start = mid + 1;
            } else if (target < nums[mid]){
                end = mid - 1;
            } else {
                ans = mid;
                if(fromZeroIndex){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
