package com.java.tasks;

import java.util.Scanner;

public class TextUnitlExit {

    static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Text");
        String s = sc.nextLine();
        while (!s.equalsIgnoreCase("exit")){

            System.out.println(s);
            System.out.println("Enter Text again");
            s = sc.nextLine();


        }
        System.out.println("You Entered EXIT");




    }
}
