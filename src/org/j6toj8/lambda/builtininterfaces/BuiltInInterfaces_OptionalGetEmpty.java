package org.j6toj8.lambda.builtininterfaces;

import java.util.Optional;

public class BuiltInInterfaces_OptionalGetEmpty {

  public static void main(String[] args) {
    // tag::code[]
    Optional<String> optionalWithValue = Optional.of("value");
    System.out.println(optionalWithValue.get()); // retrieve value correctly

    Optional<String> emptyOptional = Optional.empty();
    System.out.println(emptyOptional.get()); // throws exception
    // end::code[]
  }

}
