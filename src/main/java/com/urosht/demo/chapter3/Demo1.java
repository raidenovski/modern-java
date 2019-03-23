package com.urosht.demo.chapter3;

import com.urosht.demo.utils.ItemsUtils;

import java.util.List;
import java.util.stream.Collectors;

public class Demo1 {

    public static void main(String[] args) {

        List<String> threeHighCaloricDishNames =
            ItemsUtils.getDishList()
                .stream()
                .filter(dish -> dish.getCalories() > 300)
                .map(dish -> dish.getName())
                .limit(3)
                .collect(Collectors.toList());

    }

}
