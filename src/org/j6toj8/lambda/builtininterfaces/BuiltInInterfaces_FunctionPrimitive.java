package org.j6toj8.lambda.builtininterfaces;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.IntToDoubleFunction;
import java.util.function.ToDoubleBiFunction;

public class BuiltInInterfaces_FunctionPrimitive {

  // tag::code[]
  public static void main(String[] args) {
    IntToDoubleFunction duplicate = x -> x * 2.5;
    System.out.println(duplicate.applyAsDouble(3)); // multiply 3 * 2.5

    ToDoubleBiFunction<Integer, Integer> multiplyAndDuplicate = (x, y) -> x * y * 2.5;
    System.out.println(multiplyAndDuplicate.applyAsDouble(3, 4)); // multiply 3 * 4 * 2.5
  }
  // end::code[]

}
