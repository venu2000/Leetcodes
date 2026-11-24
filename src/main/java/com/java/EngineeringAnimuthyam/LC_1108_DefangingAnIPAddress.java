package com.java.EngineeringAnimuthyam;

public class LC_1108_DefangingAnIPAddress {

    static void main() {

        String address = "1.1.1.1";
        String ans = "";
        for(int i=0; i<address.length();i++){

            if(address.charAt(i) == '.'){
                ans = address.replace(".", "[.]");
            }
        }
        System.out.println(ans);
    }
}

