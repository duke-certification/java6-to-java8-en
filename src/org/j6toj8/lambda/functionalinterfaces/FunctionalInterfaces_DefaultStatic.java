package org.j6toj8.lambda.functionalinterfaces;

public class FunctionalInterfaces_DefaultStatic {

  // tag::code[]
  @FunctionalInterface
  interface Executable { // functional interface
    void execute(); // functional method

    // additional static methods are allowed
    static void execute(Executable... executables) {
      for (Executable executable : executables) {
        executable.execute();
      }
    }

    // additional default methods are allowed
    default void executeTwice() {
      execute();
      execute();
    }
  }
  // end::code[]
}
