package org.j6toj8.lambda.lambdaexpression;

public class LambdaExpression_TypeInference {

  // tag::code[]
  @FunctionalInterface
  interface Executable {
    void execute(); // functional method without arguments
  }

  @FunctionalInterface
  interface Application {
    String run(); // functional method also without arguments
  }

  static class Executor {
    // this method can get a lambda expression with no arguments
    void doThis(Executable executable) {
      executable.execute();
    }

    // this method can also get a lambda expression without arguments
    void doThis(Application application) {
      application.run();
    }
  }

  public static void main(String[] args) {
    Executor executor = new Executor();
    executor.doThis(() -> { return "executing"; }); // will call execute that receives an Application
    executor.doThis(() -> { System.out.println("executing"); }); // will call execute that gets an Executable
  }
  // end::code[]
}
