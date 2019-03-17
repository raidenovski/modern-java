package com.urosht.demo.chapter2;

import java.util.function.Function;

public class ComposingFunctions {

    public static void main(String[] args) {

        Function<Integer, Integer> addOne = x -> x + 1;
        Function<Integer, Integer> multiplyBy2 = x -> x * 2;

        // use andThen() to chain the functions
        Function<Integer, Integer> addOneAndMultiplyBy2 = addOne.andThen(multiplyBy2);
        int result1 = addOneAndMultiplyBy2.apply(1); // 4

        // or compose to apply the second function o the first one
        Function<Integer, Integer> composeFunc = addOne.compose(multiplyBy2);
        int result2 = addOneAndMultiplyBy2.apply(1); // 3
    }
}
