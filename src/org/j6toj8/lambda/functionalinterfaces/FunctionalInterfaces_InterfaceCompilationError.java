package org.j6toj8.lambda.functionalinterfaces;

public class FunctionalInterfaces_InterfaceCompilationError {

  // tag::code[]
  @FunctionalInterface
  interface Executable { // function interface
    void execute(); // functional method
  }
  
  @FunctionalInterface
  interface Application extends Executable { // NOT COMPILING!
    // cannot be annotated as functional as it has 2 abstract methods
    void init();
  } 
  // end::code[]
}
