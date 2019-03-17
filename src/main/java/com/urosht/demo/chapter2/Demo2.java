package com.urosht.demo.chapter2;

import com.urosht.demo.utils.Apple;
import com.urosht.demo.utils.Color;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Demo2 {

    /**
     * Trying to sort apples by weight
     * @param args
     */
    public static void main(String[] args) {

        List<Apple> inventory = Arrays.asList(
            new Apple(Color.GREEN, 100),
            new Apple(Color.RED, 150),
            new Apple(Color.GREEN, 200));

        // step 1 - passing code
        inventory.sort(new AppleComparator());

        // step 2 - use anonymous class
        inventory.sort(new Comparator<Apple>() {
            @Override
            public int compare(Apple o1, Apple o2) {
                return o1.getWeight().compareTo(o2.getWeight());
            }
        });

        // step 3 - use lambda
        inventory.sort((a1, a2) -> a1.getWeight().compareTo(a2.getWeight()));

        // step 4 - use method reference
        inventory.sort(Comparator.comparing(Apple::getWeight));

        // we can also do `.reversed()` for reversed comparison
        inventory.sort(Comparator.comparing(Apple::getWeight).reversed());

        // or chain comparators
        inventory.sort(Comparator.comparing(Apple::getWeight).reversed().thenComparing(Apple::getColor));

    }



}