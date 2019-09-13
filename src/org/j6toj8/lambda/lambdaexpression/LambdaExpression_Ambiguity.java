package org.j6toj8.lambda.lambdaexpression;

public class LambdaExpression_Ambiguity {

  // tag::code[]
  @FunctionalInterface
  interface Runner {
    void run();
  }

  @FunctionalInterface
  interface Pilot {
    void run();
  }

  static class Executor {
    void execute(Runner runner) {
      runner.run();
    }

    String execute(Pilot pilot) {
      pilot.run();
      return "running";
    }
  }

  public static void main(String[] args) {
    Executor executor = new Executor();
    // NOT COMPILING - cannot determine type of lambda expression below
    executor.execute(() -> System.out.println("execute"));
  }
  // end::code[]
}
