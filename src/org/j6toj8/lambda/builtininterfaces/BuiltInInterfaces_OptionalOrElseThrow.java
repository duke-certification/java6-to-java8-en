package org.j6toj8.lambda.builtininterfaces;

import java.util.Optional;

public class BuiltInInterfaces_OptionalOrElseThrow {

  // tag::code[]
  public static void main(String[] args) {
    Optional<String> emptyOptional = Optional.empty();
    Optional<String> optionalWithValue = Optional.of("value");

    // In this case the value present in Optional will be printed as it is filled
    String orElseThrow1 = optionalWithValue.orElseThrow(() -> new RuntimeException());
    System.out.println(orElseThrow1);
    
    // In this case exception will be thrown because Optional is not populated
    String orElseThrow2 = emptyOptional.orElseThrow(() -> new RuntimeException());
  }
  // end::code[]

}
