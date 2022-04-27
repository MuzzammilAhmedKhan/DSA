package com.exercises.BinarySearch;

public class SquareRoot {
    public static void main(String[] args) {
        long x = 2147395599;
        long start = 0;
        long end = x;
        long ans = 0;
        while(start <= end){
            long mid = start + (end - start) / 2;
            if(mid * mid == x){
                ans = mid;
            }
            if(mid * mid < x){
                start = mid + 1;
                ans = mid;
            } else {
                end = mid - 1;
            }
        }
        System.out.println((int)ans);
    }
}
