package com.java.EngineeringAnimuthyam;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main(String[] args) {

     List<Integer> num = Arrays.asList(1, 4, 5, 6, 7, 4, 33, 6);

        Object[] array = num.stream().filter(n -> n % 2 == 0)
                .distinct()
                .toArray();


        System.out.println(Arrays.toString(array));

    }


}
