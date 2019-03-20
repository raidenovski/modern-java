package com.urosht.demo.utils;

import com.urosht.demo.utils.Dish.Type;

import java.util.Arrays;
import java.util.List;

public class ItemsUtils {

    public static List<Dish> getDishList() {
        return Arrays.asList(
            new Dish("pork", false, 900, Type.MEAT),
            new Dish("beef", false, 700, Type.MEAT),
            new Dish("chicken", false, 400, Type.MEAT),
            new Dish("french fries", false, 530, Type.OTHER),
            new Dish("rice", false, 350, Type.OTHER),
            new Dish("fruit", false, 120, Type.OTHER),
            new Dish("pizza", false, 550, Type.OTHER),
            new Dish("prawns", false, 300, Type.FISH),
            new Dish("salmon", false, 450, Type.FISH)
        );
    }

}
