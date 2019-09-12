package org.j6toj8.lambda.methodreference;

import java.util.function.Function;

public class MethodReference_Static {

  public static void main(String[] args) {
    // tag::code[]
    // representation with lambda expression
    Function<Integer, String> convertIntToStr1 = x -> String.valueOf(x);
    // representation with reference to the method
    Function<Integer, String> convertIntToStr2 = String::valueOf;

    System.out.println(convertIntToStr1.apply(5));
    System.out.println(convertIntToStr2.apply(5));
    // end::code[]
  }
  
}
