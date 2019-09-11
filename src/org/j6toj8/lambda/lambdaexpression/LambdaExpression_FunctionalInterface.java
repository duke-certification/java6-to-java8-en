package org.j6toj8.lambda.lambdaexpression;

public class LambdaExpression_FunctionalInterface {

  // tag::code[]
  @FunctionalInterface
  interface Executable { // functional interface
    String execute(); // functional method
  }

  private static void executeAndPresentMessage(Executable executable) {
    String message = executable.execute();
    System.out.println(message);
  }

  public static void main(String[] args) {

    // with anonymous class
    executeAndPresentMessage(new Executable() {
      @Override
      public String execute() {
        return "performed with anonymous class";
      }
    });

    // with lambda expression
    executeAndPresentMessage(() -> { return "performed with lambda expression"; });
  }
  // end::code[]
}
