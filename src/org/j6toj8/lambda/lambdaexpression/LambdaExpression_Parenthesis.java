package org.j6toj8.lambda.lambdaexpression;

import java.util.function.BinaryOperator;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class LambdaExpression_Parenthesis {

  public static void main(String[] args) {
    // tag::code[]
    // NOT COMPILING - parentheses are required when declaring the type of the lambda expression variable
    UnaryOperator<Double> square = Double x -> Math.pow(x, 2);
    
    // NOT COMPILING - parentheses are required when there is more than one variable in the lambda expression
    BinaryOperator<Double> raiseToX = y, x -> Math.pow(y, x);
    
    // NOT COMPILING - parentheses are required when there are no variables
    Supplier<Double> square2 = -> Math.pow(2, 2);
    
    // COMPILES - empty parentheses when there are no variables
    Supplier<Double> square3 = () -> Math.pow(2, 2);
    
    // COMPILES - no parentheses when there's only one variable and we don't write its type
    UnaryOperator<Double> square4 = x -> Math.pow(x, 2);
    // end::code[]
  }
}
