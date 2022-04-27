package com.exercises.BinarySearch;
//Find Smallest Letter Greater Than Target
//Given a characters array letters that is sorted in non-decreasing order and a character target,
// return the smallest character in the array that is larger than target.
//Input: letters = ["c","f","j"], target = "a"
//Output: "c"
//Note that the letters wrap around.
//For example, if target == 'z' and letters == ['a', 'b'], the answer is 'a'.
public class SmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        char[] arr = new char[]{'c','f','j'};
        char target = 'c';
        System.out.println(binarySearch(arr, target));
    }
    static char binarySearch(char[] arr, char target){
        int start = 0, end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target > arr[mid]){ // or    if(target >= arr[mid]).....
                start = mid + 1;   //       else if{target <= arr[mid])......
            } else {
                end = mid - 1;
            }
        }
        return arr[start % arr.length];
    }
}
