package com.leetCode;

public class TowerBreakers {
    public static void main(String[] args) {
        
    }
    public static int towerBreakers(int n, int m) {
        // for better understanding, logic is explained in the book
            if(m == 1 || n % 2 == 0){
                return 2;
            }
            else { // if(n == 1 || n % 2 != 0)
                return 1;
            }
        }
}

