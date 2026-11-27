package com.java.EngineeringAnimuthyam;

public class LargestNum {

    static void main() {

        int arr[] = {23,89,11,43,23,90,48,97};
        int ans = 0;
        for(int i = 0; i<=arr.length-1 ; i++){
            if(arr[i]>ans){

                ans = arr[i];

                //ans = Math.max(arr[i],ans);

            }
        } System.out.println(ans);


    }
}
