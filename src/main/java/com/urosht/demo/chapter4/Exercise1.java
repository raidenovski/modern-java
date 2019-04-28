package com.urosht.demo.chapter4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Exercise1 {

  public static void main(String[] args) {

    List<Transaction> transactions = initList();
    // 1. Find all transactions in 2011 and sort them by value asc
    transactions.stream()
        .filter(t -> 2011 == t.getYear())
        .sorted(Comparator.comparingInt(t -> t.getValue()));

    // 2. What are all the unique cities where the traders work?
    transactions.stream()
        .map(t -> t.getTrader().getCity())
        .distinct();

    // 3. Find all traders from Cambridge and sort them by name
    transactions.stream()
        .filter(t -> "Cambridge".equals(t.getTrader().getCity()))
        .sorted((t1, t2) -> t1.getTrader().getName().compareTo(t2.getTrader().getName()));

    // 4. Return a string of all traders' names sorted alphabetically
    transactions.stream()
        .map(Transaction::getTrader)
        .sorted(Comparator.comparing(t -> t.getName()));

    // 5. Are any traders  based in Milan?
    transactions.stream()
        .map(Transaction::getTrader)
        .filter(t -> "Milan".equals(t.getCity()));

    // 6. Print the values of all transactions from the traders living in Cambridge
    // TODO
    // 7. Find the transaction with the smallest value

  }

  private static List<Transaction> initList() {

    final Trader raoul = new Trader("Raoul", "Cambridge");
    final Trader mario = new Trader("Mario", "Milan");
    final Trader alan = new Trader("Alan", "Cambridge");
    final Trader brian= new Trader("Brian", "Cambridge");

    return Arrays.asList(
        new Transaction(brian, 2011, 300),
        new Transaction(raoul, 2012, 1000),
        new Transaction(raoul, 2011, 400),
        new Transaction(mario, 2012, 710),
        new Transaction(mario, 2012, 700),
        new Transaction(alan, 2012, 950));
  }

}
