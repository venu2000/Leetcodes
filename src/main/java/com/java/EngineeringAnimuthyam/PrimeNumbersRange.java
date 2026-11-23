package com.java.EngineeringAnimuthyam;

import java.util.Scanner;

public class PrimeNumbersRange {

    static void main() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd number");
        int num2 = sc.nextInt();
rangeOf(num1, num2);



    }


    public static boolean isPrime(int num){
        if(num <=1){
            return false;
        }
        for(int i=2 ; i<= Math.sqrt(num); i++){
            if(num %i==0){
                return false;
            }
        }
        return true;
    }



    public static void rangeOf(int num1, int num2) {
        System.out.println("the prime numbers from " + num1 + "to" + num2);
        for (int i = num1; i <= num2; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }





}
