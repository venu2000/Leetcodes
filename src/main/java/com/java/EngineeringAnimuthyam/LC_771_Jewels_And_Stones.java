package com.java.EngineeringAnimuthyam;

public class LC_771_Jewels_And_Stones {

    static void main() {

        String jewels = "aA";
        String stones = "aAAbbbb";
         int ans = 0;

        for(int i = 0 ; i<jewels.length();i++){
            for(int j=0; j<stones.length();j++){

                if(jewels.charAt(i) == stones.charAt(j)){
                    ans = ans +1;
                }
            }
        }
        System.out.println(ans);
    }
}
