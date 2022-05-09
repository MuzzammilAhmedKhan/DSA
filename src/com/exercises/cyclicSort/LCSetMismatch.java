package com.exercises.cyclicSort;

import java.util.Arrays;

public class LCSetMismatch {
    public static void main(String[] args) {
        int[] arr = new int[]{8,7,3,5,3,6,1,4};
        System.out.println(Arrays.toString(findErrorNums(arr)));
    }
    public static int[] findErrorNums(int[] nums) {
        int i = 0;
        while(i < nums.length){

                int correctIndex = nums[i] - 1;
                if(nums[i] != nums[correctIndex]){
                    swap(nums, i, correctIndex);
                } else {
                    i++;
                }
        }

        for(int index = 0; index < nums.length; index++){
            if (index != nums[index] -1) {
                return new int[]{nums[index] , index + 1};
            }
        }

        return new int[] {-1, -1};
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
