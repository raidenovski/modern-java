package com.urosht.demo.chapter1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class WorkingWithFunction {

    public static void main(String[] args) {

        // map the length of each string and return into another list
        List<Integer> list = map(Arrays.asList("lambdas", "in", "action"), (String s) -> s.length());
    }

    /**
     * A mapping function that takes in a list of any type, applies the function and returns a list of a different type.
     * @param list
     * @param function
     * @param <T>
     * @param <R>
     * @return
     */
    public static <T, R> List<R> map(List<T> list, Function<T, R> function) {
        List<R> result = new ArrayList<>();
        for (T t : list) {
            result.add(function.apply(t));
        }
        return result;
    }

}
