package com.exercises.cyclicSort;

import java.util.ArrayList;
import java.util.List;

public class LCFindDisappearedNumbers {
    public static void main(String[] args) {
        int[] arr= new int[]{4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(arr));
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int correctIndex = nums[i] - 1;
            if(nums[i] != nums[correctIndex]){
                swap(nums, i, correctIndex);
            } else {
                i++;
            }
        }

        List<Integer> ans = new ArrayList<Integer>();
        for(int index = 0; index< nums.length; index++){
            if(index != nums[index] - 1){
                ans.add(index + 1);
            }
        }

        return ans;

    }

    static void swap(int[] arr,int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
