package com.exercises.BinarySearch;
//greatest number in an array that is <= target number
public class FloorOfANumber {
    public static void main(String[] args){
        int[] arr = new int[]{2, 3, 5, 9, 14, 16, 18};
        int target = 19;
        System.out.println(floor(arr, target)); //output in index of array not the number
    }

    static int floor(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) start = mid + 1;
            else if (target < arr[mid]) end = mid - 1;
            else return mid;
        }
        return end;
    }
}
