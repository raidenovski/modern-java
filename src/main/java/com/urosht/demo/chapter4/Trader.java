package com.urosht.demo.chapter4;

import java.util.StringJoiner;

public class Trader {

  private final String name;
  private final String city;

  public Trader(String name, String city) {
    this.name = name;
    this.city = city;
  }

  public String getName() {
    return name;
  }

  public String getCity() {
    return city;
  }


  @Override
  public String toString() {
    return new StringJoiner(", ", Trader.class.getSimpleName() + "[", "]")
        .add("name='" + name + "'")
        .add("city='" + city + "'")
        .toString();
  }
}
