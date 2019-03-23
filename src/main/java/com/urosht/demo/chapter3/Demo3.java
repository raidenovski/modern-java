package com.urosht.demo.chapter3;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Demo3 {

    public static void main(String[] args) {

        // traditional reduce operation of summing numbers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = 0;
        for (int x : numbers) {
            sum += x;
        }

        // reduce operation with lambdas
        int sumLambda = numbers.stream().reduce(0, (a, b) -> a + b);

        // or using a static reference for sum operation
        int sumLambdaStatic = numbers.stream().reduce(0, Integer::sum);

        // we can also exclude the initial value but return an Optional object
        Optional<Integer> maybeSum = numbers.stream().reduce(Integer::sum);
    }
}
