package com.exercises.bitwiseOperations;
//check if n is in powers of 2 in binary form
// 10(in binary == 2 in decimal), 100(in binary == 4 in decimal) == 2 * 2, 1000(in binary == 8 in decimal) = 2*2*2
public class PowerOf2 {
    public static void main(String[] args) {
        int n = 6;
        boolean ans = (n & (n - 1)) == 0;
        if(n == 0) ans  = false;
        System.out.println(ans);
    }
}
