package org.example;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 1, 1, 2);

        int result = numbers.stream().filter(n -> n%2==0).map(n -> n*n).reduce(0, (a, b) -> a+b);

        System.out.println("Hello world! " + result);


    }
}