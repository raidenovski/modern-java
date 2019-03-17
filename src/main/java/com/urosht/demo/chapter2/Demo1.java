package com.urosht.demo.chapter2;

import com.urosht.demo.utils.Apple;
import com.urosht.demo.utils.Color;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Demo1 {

    public static void main(String[] args) {

        // creating a function that invokes the constructor that only takes an Integer argument
        Function<Integer, Apple> c1 = Apple::new;
        // applying the function and getting an apple of wanted weight
        Apple a1 = c1.apply(150);

        // creating a bifunction that invokes the all-args constructor
        BiFunction<Color, Integer, Apple> c2 = Apple::new;
        Apple a2 = c2.apply(Color.GREEN, 100);


    }

}
