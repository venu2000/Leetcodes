package com.java.EngineeringAnimuthyam;

//LC_2011 Final value of Variable After Performing Operations
public class LC_2011 {

    static void main() {

        String[] operations = {"--X", "X++", "X++"};

        int ans = 0;
        for (int i = 0; i < operations.length; i++) {
            if (operations[i].equals("++X") || operations[i].equals("X++")) {
                ans = ans + 1;
            } else
                //if (operations[i].equals("--X") || operations[i].equals("X--")) {
                ans = ans - 1;

            }



        System.out.println(ans);
    }
}
