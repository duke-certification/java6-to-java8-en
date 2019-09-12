package org.j6toj8.lambda.builtininterfaces;

import java.util.function.IntBinaryOperator;
import java.util.function.IntUnaryOperator;

public class BuiltInInterfaces_OperatorPrimitive {

  // tag::code[]
  public static void main(String[] args) {
    IntUnaryOperator sumTwo = x -> x + 2;
    System.out.println(sumTwo.applyAsInt(7)); // sum 7 + 2

    IntBinaryOperator sumNumbers = (x, y) -> x + y;
    System.out.println(sumNumbers.applyAsInt(1, 5)); // sum 1 + 5
  }
  // end::code[]

}
