package com.exercises.bitwiseOperations;

public class FindUnique {
    public static void main(String[] args) {
        int[] arr = new int[]{2,4, 9,7,4,6,7,2,9};
        System.out.println(ans(arr));
//        System.out.println(2 ^ 0);
    }

    private static int ans(int[] arr) {
        int unique = 0;
        for(int a : arr){
            unique = unique ^ a;
        }
        return unique;
    }
}
