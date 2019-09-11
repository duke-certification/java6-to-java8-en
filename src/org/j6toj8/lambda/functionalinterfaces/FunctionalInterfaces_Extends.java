package org.j6toj8.lambda.functionalinterfaces;

public class FunctionalInterfaces_Extends {

  // tag::code[]
  @FunctionalInterface
  interface Executable { // functional interface
    void execute(); // functional method
  }
  
  @FunctionalInterface
  interface Application extends Executable {
    // It is also a functional interface
  } 
  // end::code[]
}
