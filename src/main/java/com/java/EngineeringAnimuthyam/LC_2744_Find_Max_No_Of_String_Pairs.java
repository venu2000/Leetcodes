package com.java.EngineeringAnimuthyam;

public class LC_2744_Find_Max_No_Of_String_Pairs {


    static void main() {

      String[]  words = {"cd","ac","dc","ca","zz"};

System.out.println(maximumNumberOfStringPairs(words));
    }


    public static String reverse(String s){
        String rev = "";
        for(int i=s.length()-1;i>=0;i--){
            rev = rev+s.charAt(i);

        }
        return  rev;

    }

    public static int maximumNumberOfStringPairs(String[] words) {

        int ans = 0;
        for (int i = 0; i < words.length - 1; i++) {

            for (int j = i + 1; j < words.length; j++) {

                String a = words[i];
                String b = words[j];
                String reverse = reverse(b);
             //   System.out.println(a +" " + reverse);

                if (reverse.equals(a)) {

              //      System.out.println(a +" " + reverse);
                    ans++;
                //    System.out.println(ans);

                }

            }
        }
        return ans;
    }

}
