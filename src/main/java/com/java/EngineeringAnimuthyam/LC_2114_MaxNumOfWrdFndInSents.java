package com.java.EngineeringAnimuthyam;

public class LC_2114_MaxNumOfWrdFndInSents

{

    static void main() {

       String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
int ans = 0;

       for(int i=0; i<sentences.length ; i++){
           int temp =1;
          // System.out.println(sentences[i]);
           String s = sentences[i];

           for(int j=0; j<s.length(); j++){

             if(s.charAt(j)==' '){
                  temp = temp+1;
               }


               }
           if(temp>ans){
               ans = temp;
           }


           }

        System.out.println(ans);
       }




    }


