package org.j6toj8.lambda.functionalinterfaces;

public class FunctionalInterfaces_Implement {

  // tag::code[]
  @FunctionalInterface
  interface Executable { // functional interface
    String execute(); // functional method
  }
  
  class Person implements Executable {

    // COMPILES!
    // functional interfaces, such as Executable, were not meant to be implemented this way but they are possible, and code compiles normally.

    @Override
    public String execute() {
      return "Executing";
    }
  }
  // end::code[]
  
}
