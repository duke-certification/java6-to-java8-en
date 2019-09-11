package org.j6toj8.lambda.lambdaexpression;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class LambdaExpression_Shadowing {

  // tag::code[]
  public static void main(String[] args) {
    Double x = 2.0; // 'x' variable in method

    // NOT COMPILING - variable named 'x' already exists and cannot be declared in lambda expression variables
    BinaryOperator<Double> raiseToX = (Double y, Double x) -> Math.pow(y, x);
    
    // NOT COMPILING - variable named 'x' already exists and cannot be declared in lambda expression body
    UnaryOperator<Double> square = (Double y) -> {
      Double x = 2.0;
      return Math.pow(y, x);
    };
  }
  // end::code[]
}
