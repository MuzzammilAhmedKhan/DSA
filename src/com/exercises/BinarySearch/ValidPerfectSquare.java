package com.exercises.BinarySearch;

public class ValidPerfectSquare {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(2147483647));
    }
    static boolean isPerfectSquare(int num) {
        long start = 1;
        long end = num;
        boolean ans = false;
        while(start <= end){
            long mid = start + (end - start) / 2;
            if(mid * mid == num){
                return true;
            }
            if(mid * mid < num){
                start = mid + 1;
            } else{
                end = mid - 1;
            }
        }
        return ans;
    }
}
