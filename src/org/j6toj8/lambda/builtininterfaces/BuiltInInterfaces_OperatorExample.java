package org.j6toj8.lambda.builtininterfaces;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class BuiltInInterfaces_OperatorExample {

  // tag::code[]
  public static void main(String[] args) {
    UnaryOperator<Integer> sumTwo = x -> x + 2;
    System.out.println(sumTwo.apply(7)); // sum 7 + 2

    BinaryOperator<Integer> sumNumbers = (x, y) -> x + y;
    System.out.println(sumNumbers.apply(1, 5)); // sum 1 + 5
  }
  // end::code[]

}
