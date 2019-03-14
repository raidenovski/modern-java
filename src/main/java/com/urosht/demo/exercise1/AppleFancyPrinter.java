package com.urosht.demo.exercise1;

import com.urosht.demo.utils.Apple;

public class AppleFancyPrinter implements AppleFormatter {

    @Override
    public String accept(Apple apple) {
        final String characteristic = apple.getWeight() > 150 ? "heavy" : "light";
        return "A " + characteristic + " " + apple.getColor() + " apple";
    }
}
