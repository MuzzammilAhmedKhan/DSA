package com.exercises;

public class ReverseOfNumber {
    public static void main(String[] args) {
        int num = 123456789;
//        while(num != 0){
//            System.out.print(num % 10);
//            num /= 10;
//        }
        int ans = 0;
        while(num != 0){
            int rem = num % 10;
            ans = ans * 10 + rem;
            num /= 10;
        }
        System.out.println(ans);
    }
}
