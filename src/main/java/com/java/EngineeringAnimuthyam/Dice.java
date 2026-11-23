package com.java.EngineeringAnimuthyam;

import java.util.Scanner;

public class Dice {

    static void main() {

        Scanner sc = new Scanner(System.in);

        int dice = (int) (Math.random() *6) +1;
        System.out.println(dice);




        while(dice!=6){

             dice = (int) (Math.random() *6) +1;
            System.out.println("Press enter to roll again");
             sc.nextLine();
            System.out.println("Roll Again -> " +dice);

        }

        System.out.println(dice);
        System.out.println("GameOver");
        sc.close();

    }

}
