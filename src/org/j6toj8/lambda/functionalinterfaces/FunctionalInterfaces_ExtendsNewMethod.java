package org.j6toj8.lambda.functionalinterfaces;

public class FunctionalInterfaces_ExtendsNewMethod {

  // tag::code[]
  @FunctionalInterface
  interface Executable { // functional interface
    void execute(); // functional method
  }

  @FunctionalInterface
  interface Application extends Executable {
    // It is NOT a functional interface as it has 2 abstract methods: execute (inherited) and init.
    void init();
  }
  // end::code[]
}
