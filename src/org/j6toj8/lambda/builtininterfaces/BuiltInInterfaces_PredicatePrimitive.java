package org.j6toj8.lambda.builtininterfaces;

import java.util.Random;
import java.util.function.IntPredicate;

public class BuiltInInterfaces_PredicatePrimitive {

  // tag::code[]
  public static void main(String[] args) {
    IntPredicate dice = x -> x == new Random().nextInt(7);
    System.out.println(dice.test(1)); // tests if the generated number is equal to 1
  }
  // end::code[]

}
