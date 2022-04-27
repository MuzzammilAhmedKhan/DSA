package com.exercises.BinarySearch;

public class RotationCount {
    public static void main(String[] args) {
        int[] arr = new int[]{15, 18, 2, 3, 6, 12};
        System.out.println(rotationCount(arr));
        int[] arr1 = new int[]{4,5,6,7,0,1,2};
        System.out.println(rotationCountWithDuplicates(arr1));
    }

    static int rotationCount(int[] arr){
        return findPivot(arr) + 1;
    }

    static int rotationCountWithDuplicates(int[] arr){
        return findPivotWithDuplicates(arr) + 1;
    }

    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start = (end - start) / 2;
            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if(arr[mid] < arr[mid - 1]){
                return mid - 1;
            }
            if(arr[start] > arr[mid]){
                end = mid - 1;
            }
            if(arr[start] < arr[mid]){
                start = mid + 1;
            }
        }
        return -1;
    }

    static int findPivotWithDuplicates(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }
            if(arr[mid] == arr[start] && arr[mid] == arr[end]){
                //check if start is pivot
                if(arr[start] > arr[start + 1]){
                    return start;
                }
                start++;
                //check if end id pivot
                if(arr[end] < arr[end - 1]){
                    return end - 1;
                }
                end--;
            }
            if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])){
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        return -1;
    }
}
