package com.urosht.demo.chapter2;

import com.urosht.demo.utils.Apple;

import java.util.Comparator;

public class AppleComparator implements Comparator<Apple> {

    @Override
    public int compare(Apple a1, Apple a2) {
        return a1.getWeight().compareTo(a2.getWeight());
    }
}
