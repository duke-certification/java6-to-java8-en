package org.j6toj8.lambda.lambdaexpression;

import java.util.function.BinaryOperator;

public class LambdaExpression_VarType {

  public static void main(String[] args) {
    // tag::code[]
    // NOT COMPILING - if the type of one of the parameters is entered, all of them must be entered.
    BinaryOperator<Double> raiseToX = (Double y, x) -> Math.pow(y, x);
    
    // COMPILES - all parameters with informed types
    BinaryOperator<Double> raiseToX2 = (Double y, Double x) -> Math.pow(y, x);
    // end::code[]
  }
}
