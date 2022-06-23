package com.leetCode;

import java.util.ArrayList;
import java.util.List;

public class NextMultipleOf5 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(73);
        list.add(67);
        list.add(38);
        list.add(33);
        ArrayList<Integer> ansList = (ArrayList<Integer>) gradingStudents(list);
    }
    public static List<Integer> gradingStudents(List<Integer> grades) {
        ArrayList<Integer> ansList = new ArrayList<Integer>();

        for(int i : grades){
            if(i < 38){
                ansList.add(i);
            }
            else if(nextMultipleOf5(i) - i < 3){
                ansList.add((nextMultipleOf5(i)));
            } else {
                ansList.add(i);
            }
        }
        return ansList;
    }

    static int nextMultipleOf5(int n){
        return ((n / 5) + 1) * 5 ;
    }
}
