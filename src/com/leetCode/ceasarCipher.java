package com.leetCode;

public class ceasarCipher {
    public static void main(String[] args) {
        String str = "-ab-cde*(^&*^fg-hijkl-mnopq-rs+(!@~tuv-wxyz-ABCD-EFG?HI-JK:>LMNO-PQRS{]TU-VWXYZ";
        String ans = caesarCipher(str, 2);
        System.out.println(ans);
    }

    public static String caesarCipher(String s, int k) {
        // Write your code here
        StringBuilder ans = new StringBuilder();
        k %= 26;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if ((ch >= 'a' && ch <= 'z')) {
                char newCh = (char) (ch + k);
                if (newCh > 122) {
                    newCh -= 26;
                }
                ans.append(newCh);
            } else if (ch >= 'A' && ch <= 'Z') {
                char newCh = (char) (ch + k);
                if (newCh > 90) {
                    newCh -= 26;
                }
                ans.append(newCh);
            } else {
                ans.append(ch);
            }

        }
        return ans.toString();

    }
    
}
