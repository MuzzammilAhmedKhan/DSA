package com.exercises.BinarySearch;

public class PeakElementInMountainArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,3,1};
        int target = 3;
        int peak = peakElement(arr);
        int targetFromAscArr = orderAgnosticBinarySearch(arr, target, 0, peak);
        if(targetFromAscArr != -1){
            System.out.println(targetFromAscArr);
        } else {
            System.out.println(orderAgnosticBinarySearch(arr, target, peak + 1, arr.length - 1));
        }
    }

    static int peakElement(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            int mid = start + (end - start) / 2;

                if (arr[mid] > arr[mid + 1]) {
                    end = mid;
                } else {
                    start = mid + 1;
                }

        }
        return start;
    }


    static int orderAgnosticBinarySearch(int[] arr, int target, int start, int end){
        boolean isAsc = arr[start] < arr[end];
        while(start <= end){
            int mid = start + (end - start) / 2;

            if(target == arr[mid]){
                return mid;
            }

            if(isAsc){
                if(target > arr[mid]){
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if(target > arr[mid]){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
