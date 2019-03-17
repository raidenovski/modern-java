package com.urosht.demo.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Apple {

    private Color color;
    private Integer weight;

    public Apple(Integer weight) {
        this.weight = weight;
    }
}
