package com.exercises.BinarySearch;
//index out of bounds exception for end elements because, array is infinite and size keeps doubling
public class FindElementInInfiniteArray {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 3, 5, 6, 7, 8, 10, 11, 12, 15, 20, 23, 30, 45, 68, 81, 95, 135};
        int target =15;
        System.out.println(searchRange(arr, target));
    }
    static int searchRange(int[] arr, int target){
        //move in small blocks of the array (sub array)
        int start = 0;
        int end = 1;
        //start with an array of size 2 from index 0 (array size = 2 from index 0)
        //if element not found in the size, double the size of the array from the next element (array size = 4, from index 2)
        //newStart = end  + 1; newEnd = end + size of box( previous box) * 2
        //size  of box = end - start + 1;
        while(target > arr[end]){
            int newStart = end + 1;
            end = end + (end - start + 1) * 2;
            start = newStart;
        }
        //if element < end , i.e, element is between start and end, perform Binary search on the sub array
        return search(arr, target, start, end);
    }
    static int search(int[] arr, int target, int start, int end){
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target > arr[mid]){
                start = mid + 1;
            } else if(target < arr[mid]){
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
