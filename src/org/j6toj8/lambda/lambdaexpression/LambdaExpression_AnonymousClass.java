package org.j6toj8.lambda.lambdaexpression;

public class LambdaExpression_AnonymousClass {

  public static void main(String[] args) {
    // tag::code[]
    // with anonymous class
    new Thread(new Runnable() {
      @Override
      public void run() {
        System.out.println("Executing.");
      }
    }).run();

    // with lambda expression
    new Thread(() -> System.out.println("Executing.")).run();
    // end::code[]
  }
}
