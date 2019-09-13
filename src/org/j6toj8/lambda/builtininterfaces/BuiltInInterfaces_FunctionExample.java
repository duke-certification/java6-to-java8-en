package org.j6toj8.lambda.builtininterfaces;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BuiltInInterfaces_FunctionExample {

  // tag::code[]
  public static void main(String[] args) {
    Function<Integer, Double> duplicate = x -> x * 2.5;
    System.out.println(duplicate.apply(3)); // multiply 3 * 2.5

    BiFunction<Integer, Integer, Double> multiplyAndDuplicate = (x, y) -> x * y * 2.5;
    System.out.println(multiplyAndDuplicate.apply(3, 4)); // multiply 3 * 4 * 2.5
  }
  // end::code[]

}
