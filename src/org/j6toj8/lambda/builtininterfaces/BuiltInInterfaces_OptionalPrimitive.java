package org.j6toj8.lambda.builtininterfaces;

import java.util.OptionalInt;

public class BuiltInInterfaces_OptionalPrimitive {

  public static void main(String[] args) {
    // tag::code[]
    OptionalInt optionalWithValue = OptionalInt.of(5);
    OptionalInt emptyOptional = OptionalInt.empty();

    if (optionalWithValue.isPresent()) {
      System.out.println(optionalWithValue.getAsInt());
    }
    if (emptyOptional.isPresent()) {
      System.out.println(emptyOptional.getAsInt());
    }
    // end::code[]
  }

}
