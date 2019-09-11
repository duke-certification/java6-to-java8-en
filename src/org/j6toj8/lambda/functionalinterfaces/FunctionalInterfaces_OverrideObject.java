package org.j6toj8.lambda.functionalinterfaces;

public class FunctionalInterfaces_OverrideObject {

  // tag::code[]
  @FunctionalInterface
  interface Executable { // functional interface
    void execute(); // functional method

    // overriding Object methods
    @Override
    String toString();
    @Override
    boolean equals(Object obj);
    @Override
    int hashCode();
  }
  // end::code[]
}
