package org.j6toj8.lambda.lambdaexpression;

import java.util.function.UnaryOperator;

public class LambdaExpression_SimpleComplete {

  public static void main(String[] args) {
    // tag::code[]
    // complete lambda expression
    UnaryOperator<Double> square1 = (Double x) -> { return Math.pow(x, 2); };
    // simplified lambda expression
    UnaryOperator<Double> square2 = (x) -> Math.pow(x, 2);
    // end::code[]
  }
}
