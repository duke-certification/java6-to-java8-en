package org.j6toj8.lambda.builtininterfaces;

import java.util.Optional;

public class BuiltInInterfaces_OptionalNullable {

  // tag::code[]
  public static void main(String[] args) {
    // Example trying to use .of and passing 'null' as argument
    try {
      Optional.of(null); // Throws NullPointerException on this line
    } catch (Exception e) {
      e.printStackTrace();
    }
    
    // Example using the correct method: .ofNullable
    Optional<String> ofNullable = Optional.ofNullable(null); // Cria um Optional vazio
    System.out.println(ofNullable.isPresent()); // Print 'false' as it has no value
  }
  // end::code[]
  
}
