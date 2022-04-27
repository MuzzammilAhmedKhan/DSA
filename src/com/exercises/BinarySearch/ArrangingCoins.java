package com.exercises.BinarySearch;
//https://leetcode.com/problems/arranging-coins/
public class ArrangingCoins {
    public static void main(String[] args) {
        int n = 5;
        int start = 0;
        int end = n;
        int ans = 0;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(mid * (mid + 1) / 2 > n){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        System.out.println(end);
    }
}
