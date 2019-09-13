package org.j6toj8.lambda.lambdaexpression;

import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class LambdaExpression_Block {

  public static void main(String[] args) {
    // tag::code[]
    UnaryOperator<Double> square = (Double x) -> {
      double pow = Math.pow(x, 2);
      return pow;
    };

    Consumer<Double> print = (Double x) -> {
      double pow = Math.pow(x, 2);
      System.out.println(pow);
    };
    // end::code[]
  }
}
