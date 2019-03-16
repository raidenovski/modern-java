package com.urosht.demo.chapter1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Demo2 {

    /**
     * Abstracting away the list so we can filter anything with a predicate of anything
     *
     * @param list
     * @param predicate
     * @param <T>
     * @return
     */
    public static <T> List<T> filterAnything(List<T> list, Predicate<T> predicate) {
        List<T> result = new ArrayList<>();
        for (T e : list) {
            if (predicate.test(e)) {
                result.add(e);
            }
        }
        return result;
    }
}
