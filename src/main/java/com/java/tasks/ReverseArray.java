package com.java.tasks;

import java.util.Arrays;

public class ReverseArray {

    static void main() {

        int[] a = {10,30,76,90,34,67,12};
        int[]b = new int[a.length];

        for (int i =a.length-1 ; i>=0;i--){

            b[a.length-i-1] = a[i];



        }
        System.out.println(Arrays.toString(b));




    }


}
