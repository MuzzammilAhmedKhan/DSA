package com.leetCode;

import java.util.ArrayList;
import java.util.List;

public class MigratoryBirds {
    public static void main(String[] args) {
        int[] arr = {1, 4, 4, 4, 5, 3};
        ArrayList<Integer> al = new ArrayList<Integer>();
        for(int i : arr){
            al.add(i);
        }
        migratoryBirds(al);
    }

    public static int migratoryBirds(List<Integer> arr) {
        int[] freqArr = new int[6];
        for(int i = 0; i < arr.size(); i++){
            freqArr[arr.get(i)]++;
        }

        int max = 0;
        int minIndex = freqArr.length - 1;
        for(int i = 1; i < freqArr.length; i++){
            if(freqArr[i] == 0){
                continue;
            }
            if(max < freqArr[i]){
                max = freqArr[i];
                minIndex = i;
            }
        }

        return minIndex;

    }

}
