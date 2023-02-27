package org.example;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 1, 1, 2);

        int result = numbers.stream().filter(n -> n%2==0).map(n -> n*n).reduce(0, (a, b) -> a+b);

        List<String> strs = Arrays.asList("Larb it is my cybername",
                "You don't know who i am",
                "I am from your brain",
                "Scare me");

        List<String> resultList = strs.stream().filter(n -> !n.contains("Larb")).toList();

        System.out.println(resultList);


    }
}