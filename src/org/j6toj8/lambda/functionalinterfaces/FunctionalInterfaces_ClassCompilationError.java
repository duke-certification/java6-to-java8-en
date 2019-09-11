package org.j6toj8.lambda.functionalinterfaces;

public class FunctionalInterfaces_ClassCompilationError {

  // tag::code[]
  @FunctionalInterface
  interface Executable { // functional interface
    void execute(); // functional method
  }
  
  @FunctionalInterface
  class Pilot { // NOT COMPILING!
    // only interfaces can be annotated with @FunctionalInterface
  } 
  // end::code[]
}
