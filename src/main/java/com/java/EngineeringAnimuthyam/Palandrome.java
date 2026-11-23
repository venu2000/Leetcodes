package com.java.EngineeringAnimuthyam;


//Part 4- Engineering Animuthyam
public class Palandrome {

    static void main() {


        String s = "abba";
        
        String reverse = "";
        for (int i = s.length()-1; i >= 0; i--) {

            reverse = reverse + s.charAt(i);
            System.out.println(reverse);
        }

        if (s.equals(reverse)){
            System.out.println("Its a Palandrome");
            
        }else{
            System.out.println("It is not a palandrome");
        }


    }
}
