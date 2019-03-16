package com.urosht.demo.chapter2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class WorkingWithConsumer {

    public static void main(String[] args) {

        forEach(Arrays.asList(1,2,3,4,5), (Integer i) -> System.out.println(i));
    }

    /**
     * This method can be used to perform void operations on each element from the list
     * @param list
     * @param consumer
     * @param <T>
     */
    public static <T> void forEach(List<T> list, Consumer<T> consumer) {
        for (T t : list) {
            consumer.accept(t);
        }
    }

}
