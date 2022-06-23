package com.leetCode;

import java.util.ArrayList;
import java.util.List;

public class DivisibleSumPairs {
    public static void main(String[] args) {
        List<Integer> al = new ArrayList<Integer>();
        al.add(1);
        al.add(3);
        al.add(2);
        al.add(6);
        al.add(1);
        al.add(2);
        int ans = divisibleSumPairs(3, al);
        System.out.println(ans);
    }
    public static int divisibleSumPairs(int k, List<Integer> ar) {
        // Write your code here
        int count = 0;
        for( int i = 0; i < ar.size(); i++){
            for(int j = i + 1; j < ar.size(); j++){
                
                if((ar.get(i) + ar.get(j)) % k == 0){
                    count++;
                }
            }
        }
        return count;

    }

}
