package com.InterviewQ;

import java.util.Scanner;

public class NumberReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        System.out.println(reverse(num));
    }

    static int reverse(int num) {
        int digit = 0, reverse = 0;
        while(num != 0){
            digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }
        return reverse;
    }
}
