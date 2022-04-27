package com.exercises.BinarySearch;

import java.util.Arrays;
//does not work in case of single column matrix
public class SortedMatrixKK {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 1},
                {2, 2}
        };

        System.out.println(Arrays.toString(search(arr, 3)));
    }
    static int[] search(int[][] matrix, int target){
        int totalRows = matrix.length;
        int totalCols = matrix[0].length;

        if(totalRows == 1){
            return binarySearch(matrix, 0, 0, totalCols - 1, target);
        }

        int rStart = 0;
        int rEnd = totalRows - 1;
        int cMid = totalCols / 2;
        //run while till rows are reduced to 2
        //while(rows are > 2)
        while(rStart < (rEnd - 1)){
            int rMid = rStart + (rEnd - rStart) / 2;
            if(matrix[rMid][cMid] == target){
                return new int[]{rMid, cMid};
            }
            //colMid < target remove all rows above or before mid element row
            if(matrix[rMid][cMid] < target){
                rStart = rMid; // not cMid trying to reduce rows, not columns
            }
            //cMId>target remove all rows after mid element row
            else {
                rEnd = rMid;
            }
        }

        //only 2 rows remain
        //check if element id in midcolumn
        if(target == matrix[rStart][cMid]){
            return new int[]{rStart, cMid};
        }
        if(target == matrix[rStart + 1][cMid]){
            return new int[]{rStart + 1, cMid};
        }

        //search target in 1st part
        if (target <= matrix[rStart][cMid - 1]){
            return binarySearch(matrix, rStart, 0, cMid - 1, target);
        }
        //search target in 2nd part
        if(target >= matrix[rStart][cMid + 1] && target <= matrix[rStart][totalCols - 1]){
            return binarySearch(matrix, rStart, cMid + 1, totalCols - 1, target);
        }
        //search in 3rd part
        if(target <= matrix[rStart + 1][cMid - 1]){
            return binarySearch(matrix, rStart + 1, 0, cMid - 1, target);
        }
        //search in 4th part
        if(target >= matrix[rStart + 1][cMid + 1] && target <= matrix[rStart + 1][totalCols -1]){
            return binarySearch(matrix, rStart + 1, cMid + 1, totalCols - 1, target);
        }
        return new int[]{-1, -1};
    }

    static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target){
        while(cStart <= cEnd){
            int cMid = cStart + (cEnd - cStart) / 2;
            if(target == matrix[row][cMid]){
                return new int[]{row, cMid};
            }
            if(target > matrix[row][cMid]){
                cStart = cMid + 1;
            } else {
                cEnd = cMid - 1;
            }
        }
        return new int[]{-1, -1};
    }
}
