package com.leetCode;

public class LibraryFine {
    public static void main(String[] args) {
        int ans = libraryFine(14, 7, 2018, 5, 7, 2018);
        System.out.println(ans);
    }
    public static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
        // Write your code here
            if(y1 == y2){
                if(m1 == m2){
                    if(d1 == d2){
                        return 0;
                    } else {
                        return 15 * (d1 - d2);
                    }
                } else {
                    return 500 * (m1 - m2);
                }
                
            } else {
                return 10000;
            }
    
        }
    
}
