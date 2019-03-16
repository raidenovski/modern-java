package com.urosht.demo.chapter2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class WorkingWithPredicate {

    public static void main(String[] args) {

        List<String> listOfStrings = new ArrayList<>();
        listOfStrings.add("");
        listOfStrings.add("foo");

        Predicate<String> nonEmptyStringPredicate = (String s) -> !s.isEmpty();
        List<String> nonEmptyList = filter(listOfStrings, nonEmptyStringPredicate);

    }

    /**
     * A method that can accept a list of any type and a predicate of any type for filtering
     *
     * @param list
     * @param predicate
     * @param <T>
     * @return
     */
    public static <T>List<T> filter(List<T> list, Predicate<T> predicate) {
        List<T> result = new ArrayList<>();
        for (T t : list) {
            if (predicate.test(t)) {
                result.add(t);
            }
        }
        return result;
    }

}
