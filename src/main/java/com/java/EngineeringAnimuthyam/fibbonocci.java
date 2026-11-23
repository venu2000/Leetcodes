package com.java.EngineeringAnimuthyam;

import java.util.Scanner;

public class fibbonocci {


    static void main() {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n number");
        int n= sc.nextInt();
fib(n);
    }


    static void fib(int num) {
        int a = 0;
        int b = 1;
        for(int i = 0;i<=num;i++) {
            int temp = a;
            a= a+b;
            b = temp;


            System.out.println(temp);
        }

    }
}
