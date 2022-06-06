package com.exercises.maths;

import java.util.ArrayList;

public class Factors {
    public static void main(String[] args) {
        factors(36);
        System.out.println("\n");
        factorsTillSQRT(36);
        System.out.println("\n");
        factorsWithoutRepeat(36);
        System.out.println("\n");
        factorsInAsc(36);
    }
    static void factors(int n){
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                System.out.print(i + " ");
            }
        }
        System.out.println("checks all numbers from 1 to n");
    }

    //for perfect squares prints root twice with other numbers
    //for 36 : 1 36 2 18 3 12 4 9 6 6 --- 6 printed twice
    static void factorsTillSQRT(int n){
        for(int i = 1; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                System.out.print(i + " " + (n / i) + " ");
            }
        }
        System.out.println("checks all numbers from 1 to sqrt(n)\n" +
                "for perfect squares prints root twice with other numbers\n" +
                "for 36 : 1 36 2 18 3 12 4 9 6 6 --- 6 printed twice");
    }
    //prints without repeated numbers but is still unsorted
    static void factorsWithoutRepeat(int n){
        for(int i = 1; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                if(i * i == n){
                    System.out.print(i + " ");
                }else {
                    System.out.print(i + " " + (n / i) + " ");
                }
            }
        }
        System.out.println("prints without repeated numbers but is still unsorted");
    }

    //prints in sorted order
    static void factorsInAsc(int n){
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 1; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                if(i * i == n){
                    System.out.print(i + " ");
                } else {
                    System.out.print(i + " ");
                    list.add(n / i); //numbers added in descending order
                }
            }
        }
        for(int i = list.size() - 1; i >= 0; i--){
            System.out.print(list.get(i) + " ");
        }
        System.out.println("prints in sorted order");
    }


}
