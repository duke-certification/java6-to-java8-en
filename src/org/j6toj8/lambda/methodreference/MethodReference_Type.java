package org.j6toj8.lambda.methodreference;

import java.util.function.Function;

public class MethodReference_Type {

  public static void main(String[] args) {
    // tag::code[]
    // representation with lambda expression
    Function<Integer, Double> intToDouble1 = x -> x.doubleValue();
    // representation with reference to the doubleValue method
    Function<Integer, Double> intToDouble2 = Integer::doubleValue;

    // the results will be the same
    System.out.println(intToDouble1.apply(8));
    System.out.println(intToDouble2.apply(8));
    // end::code[]
  }
  
}
