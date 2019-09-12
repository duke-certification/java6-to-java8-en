package org.j6toj8.lambda.builtininterfaces;

import java.util.Optional;

public class BuiltInInterfaces_OptionalIfPresent {

  // tag::code[]
  public static void main(String[] args) {
    Optional<String> emptyOptional = Optional.empty();
    Optional<String> optionalWithValue = Optional.of("value");
    
    // The line below will not print anything as optional is empty
    emptyOptional.ifPresent(value -> System.out.println("Empty: " + value));
    // The line below will print, as optional has value
    optionalWithValue.ifPresent(value -> System.out.println("With Value: " + value ));
  }
  // end::code[]
  
}
