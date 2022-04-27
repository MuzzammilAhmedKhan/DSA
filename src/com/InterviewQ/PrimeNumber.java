package com.InterviewQ;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a numner: ");
        int num = sc.nextInt();
        System.out.println(isPrime(num));
    }

    static boolean isPrime(int num) {
        if (num == 1){
            return false;
        }
        for (int i = 2; i <= num / 2; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}
