package com.java.EngineeringAnimuthyam;
// Part-4
public class Palandrome2 {

    static void main() {

        boolean palandrome = true;
        String s = "abccba";
        int n = s.length();
        for(int i=0;i<n/2;i++){
            if(s.charAt(i)!=s.charAt(n-i-1)){
                palandrome = false;
                break;
            }
        }
        if(palandrome){
            System.out.println("It is a palandrome");
        }else {
            System.out.println("It is not a palandrome");
        }



    }
}
