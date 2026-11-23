package com.java.EngineeringAnimuthyam;

//Part-5
public class Functions {


    static void main() {

        fun("Venu", 5);
        fun("naveena", 5);

        System.out.println(car());

    }

    public static void fun(String s , int n){

        for(int i=0; i<=n;i++){
            System.out.println(s);
        }
    }

    //return statement
    public static String car(){
        return "Benz";
    }




}
