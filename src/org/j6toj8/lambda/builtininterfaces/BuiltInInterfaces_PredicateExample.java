package org.j6toj8.lambda.builtininterfaces;

import java.util.Random;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class BuiltInInterfaces_PredicateExample {

  // tag::code[]
  public static void main(String[] args) {
    Predicate<Integer> dice = x -> x.equals(new Random().nextInt(7));
    System.out.println(dice.test(1)); // tests if the generated number is equal to 1

    BiPredicate<Integer, Integer> doubleDice = (x, y) -> x.equals(new Random().nextInt(7)) || y.equals(new Random().nextInt(7));
    System.out.println(doubleDice.test(1, 2)); // tests if the first generated number equals 1 or if the second generated number equals 2
  }
  // end::code[]

}
