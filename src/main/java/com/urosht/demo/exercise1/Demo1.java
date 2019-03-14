package com.urosht.demo.exercise1;

import com.urosht.demo.utils.Apple;
import com.urosht.demo.utils.Color;

import java.util.ArrayList;
import java.util.List;

public class Demo1 {

    /**
     * Using traditional method
     * @param apples
     * @param color
     * @return
     */
    public static List<Apple> filterApplesByColor(List<Apple> apples, Color color) {
        final List<Apple> result = new ArrayList<>();
        for (Apple apple : apples) {
            if (apple.getColor().equals(color)) {
                result.add(apple);
            }
        }
        return result;
    }

    /**
     * Using the new method to pass behavior as a parameter allows us to filter by an abstract criteria
     * @param apples
     * @param applePredicate
     * @return
     */
    public static List<Apple> filterApples(List<Apple> apples, ApplePredicate applePredicate) {
        final List<Apple> result = new ArrayList<>();
        for (Apple apple : apples) {
            if (applePredicate.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }

    public static void prettyPrintApples(List<Apple> apples, AppleFormatter appleFormatter) {
        for (Apple apple : apples) {
            final String output = appleFormatter.accept(apple);
            System.out.println(output);
        }
    }

}
