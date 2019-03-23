package com.urosht.demo.chapter3;

import com.urosht.demo.utils.ItemsUtils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo2 {

    public static void main(String[] args) {

        // 1. Given a list of numbers, how should we return a list of the square of each number?
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Answer - by passing a lambda and map them into the list
        List<Integer> squares =
            numbers.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());

        // 2. Given two lists of numbers, how would we return all pairs of numbers?
        // E.G: [1,2,3] and [3,4] = [(1,3), (1,4), (2,3), (2,4), (3,3), (3,4)]

        // Answer - Use a map and a flat map to iterate on the two lists and generate the pair
        List<Integer> numbers1 = Arrays.asList(1, 2, 3);
        List<Integer> numbers2 = Arrays.asList(3, 4);

        List<int[]> pairs =
            numbers1.stream()
                    .flatMap(i -> numbers2.stream()
                                        .map(j -> new int[] {i, j})
                    )
            .collect(Collectors.toList());

        // 3. How to extend the previous example to return only pairs which the sum is divisible by 3?

        // Answer - just adding a filter inside of the second iteration
        List<int[]> pairsDivisble =
            numbers1.stream()
                    .flatMap(i -> numbers2.stream()
                                        .filter(j -> (i + j) % 3 == 0)
                                        .map(j -> new int[]{i, j})
                    )
            .collect(Collectors.toList());

    }

}
