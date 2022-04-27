package com.exercises.BinarySearch;
//Find Smallest Letter Greater Than Target
//Given a characters array letters that is sorted in non-decreasing order and a character target,
// return the smallest character in the array that is larger than target.
public class NextGreatest {
    public static void main(String[] args) {
        char[] ch = new char[]{'c','f','j'};
        char target = 'c';
        System.out.println(nextGreatestLetter(ch, target));
    }

    static char nextGreatestLetter(char[] letters, char target) {
        int start = 0, end = letters.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if (target >= letters[mid]) start = mid + 1;
            else if (target <= letters[mid]) end = mid - 1;
        }
        return letters[start % letters.length];
    }
}
