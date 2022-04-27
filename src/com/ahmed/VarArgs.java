package com.ahmed;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(2,8,9,66,45,78,15,45);
    }

//    static void multiple(int a,int b, String ...a){
//
//    }

    static void fun(int ...v){ //variable length arguments of integers, takes as array
        System.out.println(Arrays.toString(v));
    }
}
