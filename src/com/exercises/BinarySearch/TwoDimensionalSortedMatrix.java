package com.exercises.BinarySearch;

import java.util.Arrays;
//https://www.youtube.com/watch?v=FOa55B9Ikfg
//https://leetcode.com/problems/search-a-2d-matrix/discuss/1926493/0ms-fast-and-easy-to-understand-java-solution
//https://leetcode.com/problems/search-a-2d-matrix/discuss/1896560/Java-Simple-Solution-oror-Binary-Search
public class TwoDimensionalSortedMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1,3,5},
                {10,11,16,20},
                {23,34,60},
                {64, 68, 71, 76}
        };
        System.out.println((searchMatrix(arr, 34)));
//        System.out.println(arr.length);
//        System.out.println(arr[0].length);
    }
    static boolean searchMatrix(int[][] matrix, int target) {
        int totalRows = matrix.length;
        int totalCols = matrix[0].length;
        int start = 0;
        int end = totalRows * totalCols - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            int midElement = matrix[mid/totalCols][mid%totalCols];
            if(midElement == target){
                return true;
            }
            if(midElement < target){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return false;

    }
}
