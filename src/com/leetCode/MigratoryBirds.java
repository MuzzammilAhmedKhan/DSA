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
        // Write your code here
        int[] count = new int[6];
        for(int i = 0; i < arr.size(); i++){
            int temp = arr.get(i);
            count[temp]++;
        }

        int maxOccurances = 0;
        int minNumber = Integer.MAX_VALUE;
        for(int i = 1; i < count.length; i++){
            if(count[i] == 0){
                continue;
            }

            if(count[i] > maxOccurances){
                maxOccurances = count[i];
            }
            int exMax = maxOccurances;
            if(i < minNumber){
                minNumber = i;
            }
        }

        return minNumber;

    }

}
