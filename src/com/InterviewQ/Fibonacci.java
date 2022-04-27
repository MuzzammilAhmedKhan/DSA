package com.InterviewQ;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int num1 = 0, num2 = 1;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(num1 + " " + num2 + " ");
        for(int i = 2; i <= n; i++){
            int num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
            System.out.print(num3 + " ");
        }
    }
}
