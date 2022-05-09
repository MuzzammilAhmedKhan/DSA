package com.exercises.cyclicSort;

public class LCFindDuplicateNumber {
    public static void main(String[] args) {
        int[] arr = new int[]{1,3,4,2,2};
        System.out.println(findDuplicate(arr));
        System.out.println(findDuplicate1(arr));
    }

    public static int findDuplicate(int[] nums) {
        int i = 0;
        while(i < nums.length){
            if(i != nums[i] - 1){
                int correctIndex = nums[i] - 1;
                if(nums[i] != nums[correctIndex]){
                    swap(nums, i , correctIndex);
                } else {
                    return nums[i];
                }
            }
            else {
                i++;
            }
        }
        return -1;
    }

    public static int findDuplicate1(int[] nums) {
        int i = 0;
        while(i < nums.length){
            if(i != nums[i] - 1){
                int correctIndex = nums[i] - 1;
                if(nums[i] != nums[correctIndex]){
                    swap(nums, i , correctIndex);
                } else {
                    return nums[i];
                }
            }
            else {
                i++;
            }
        }
        return -1;
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
