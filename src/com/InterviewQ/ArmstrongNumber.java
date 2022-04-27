package com.InterviewQ;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        System.out.println(isArmstrong(num));
    }

    static boolean isArmstrong(int num) {
        if(num == sumOfPowers(num)){
            return true;
        }
        return false;
    }

    static int sumOfPowers(int num) {
        int totalDigits = numOfDigits(num);
        double sum = 0;
        while(num != 0){
            sum = sum + Math.pow(num % 10, totalDigits);
            num /= 10;
        }
        return (int)sum;
    }

    static int numOfDigits(int num) {
        int count = 0;
        while(num != 0){
            num /= 10;
            count++;
        }
        return count;
    }
}
