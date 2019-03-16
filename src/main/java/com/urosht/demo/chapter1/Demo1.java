package com.urosht.demo.chapter1;

import com.urosht.demo.utils.Apple;
import com.urosht.demo.utils.Color;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Demo1 {

    public static void main(String[] args) {

        List<Apple> inventory = new ArrayList<>();
        inventory.add(new Apple(Color.GREEN, 155));
        inventory.add(new Apple(Color.GREEN, 100));
        inventory.add(new Apple(Color.RED, 130));

        // using anonymous inner class
        List<Apple> redApples = filterApples(inventory, new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return Color.RED.equals(apple.getColor());
            }
        });

        // USING LAMBDASS!!! :)
        List<Apple> redApplesWithLambdas = filterApples(inventory, (Apple apple) -> Color.RED.equals(apple.getColor()));

        // Sorting using the Comparator interface as anonymous class
        inventory.sort(new Comparator<Apple>() {
            @Override
            public int compare(Apple a1, Apple a2) {
                return a1.getWeight().compareTo(a2.getWeight());
            }
        });

        // Sorting using lambdas
        inventory.sort((Apple a1, Apple a2) -> a1.getWeight().compareTo(a2.getWeight()));

    }

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
