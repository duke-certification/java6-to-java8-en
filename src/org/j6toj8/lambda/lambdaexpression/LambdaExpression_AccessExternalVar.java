package org.j6toj8.lambda.lambdaexpression;

import java.util.function.UnaryOperator;

public class LambdaExpression_AccessExternalVar {

  // tag::code[]
  public static void main(String[] args) {
    final Double x1 = 2.0;
    Double x2 = 2.0;
    Double x3 = 2.0;

    // COMPILES - external variable 'x1' is final and can be used in lambda expression
    UnaryOperator<Double> raiseToX1 = (Double y) -> Math.pow(y, x1);
    
    // COMPILES - external variable 'x2' is not final, but never changed, so it can be used inside the lambda expression
    UnaryOperator<Double> raiseToX2 = (Double y) -> Math.pow(y, x2);

    // NOT COMPILING - external variable 'x3' is changed within this method, so it cannot be used within the lambda expression
    UnaryOperator<Double> raiseToX3 = (Double y) -> Math.pow(y, x3);
    
    x3 = 3.0; // changing variable 'x3' does not allow it to be used in lambda expressions
  }
  // end::code[]
}
