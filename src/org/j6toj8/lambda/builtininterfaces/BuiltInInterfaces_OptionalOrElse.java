package org.j6toj8.lambda.builtininterfaces;

import java.util.Optional;

public class BuiltInInterfaces_OptionalOrElse {

  // tag::code[]
  public static void main(String[] args) {
    // Example with empty Optional
    Optional<String> emptyOptional = Optional.empty();

    // the two variables below will have the string "default value" because optional is empty
    String orElse = emptyOptional.orElse("default value"); // get the String directly
    String orElseGet = emptyOptional.orElseGet(() -> { return "default value"; }); // get String through lambda expression
    
    System.out.println(orElse);
    System.out.println(orElseGet);
    
    // Example with Optional with value
    Optional<String> optionalWithValue = Optional.of("value");

    // the two variables below will use the value present in optional as it is already filled
    String orElse2 = optionalWithValue.orElse("default value");
    String orElseGet2 = optionalWithValue.orElseGet(() -> { return "default value"; });
    
    System.out.println(orElse2);
    System.out.println(orElseGet2);
  }
  // end::code[]

}
