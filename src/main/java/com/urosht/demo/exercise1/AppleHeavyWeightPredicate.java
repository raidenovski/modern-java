package com.urosht.demo.exercise1;

import com.urosht.demo.utils.Apple;

public class AppleHeavyWeightPredicate implements ApplePredicate {

    @Override
    public boolean test(Apple apple) {
        return apple.getWeight() > 150;
    }
}
