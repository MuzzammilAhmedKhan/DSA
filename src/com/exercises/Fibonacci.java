package com.exercises;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int a = 0, b = 1;
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.print(a + " " + b + " ");
        for(int i = 2; i <= n; i++){
             int c = a + b;

            a = b;
            b = c;
            System.out.print(c +" ");
        }
    }
}
