package com.exercises.bitwiseOperations;

public class NoOfSetBits {
    public static void main(String[] args) {
        int n = 47;
        int count = 0;
        System.out.println((Integer.toBinaryString(n)));
//        System.out.println(n );

        while(n > 0){
            count++;
            System.out.print(count + "---");
            n = n - (n & -n);
            System.out.println(n + "--" +(Integer.toBinaryString(n)));
        }

//        while (n > 0) {
//            count++;
//            System.out.print(count + "---");
//            n = n & (n - 1);
//            System.out.println(n + "--" +(Integer.toBinaryString(n)));
//        }
        System.out.println(count);
    }
}
