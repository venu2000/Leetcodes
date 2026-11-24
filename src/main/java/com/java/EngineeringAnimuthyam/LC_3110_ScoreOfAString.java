package com.java.EngineeringAnimuthyam;

public class LC_3110_ScoreOfAString {

//Leetcode :
    static void main() {


        String s = "hello";
        int ans = 0;
        for(int i=0; i<s.length()-1; i++){

            int first = s.charAt(i);
            int second = s.charAt(i+1);
            int res = (Math.abs(first-second));

            ans = ans +res;
        }
        System.out.println(ans);
    }

}
