package com.urosht.demo.chapter2;

import com.urosht.demo.utils.Apple;
import com.urosht.demo.utils.Color;

import java.util.function.Predicate;

public class ComposingPredicates {

    public static void main(String[] args) {

        Predicate<Apple> redApple = (Apple a) -> a.getColor().equals(Color.RED);

        // we can negate predicates
        Predicate<Apple> notRedApple = redApple.negate();

        // chain them
        Predicate<Apple> redAndHeavyApple = redApple.and(apple -> apple.getWeight() > 150);

        // or construct more complexed predicates
        Predicate<Apple> redAndHeavyAppleOrGreen =
            redApple.and(apple -> apple.getWeight() > 150)
                    .or(apple -> Color.GREEN.equals(apple.getColor()));

        // when using complexed predicates with or(), make sure to use them like so:
        // a.or(b).and(c) == (a || b) && c
        // a.and(b).or(c) == (a && b) || c
    }
}
