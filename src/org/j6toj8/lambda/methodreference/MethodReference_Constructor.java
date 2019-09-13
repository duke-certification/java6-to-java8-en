package org.j6toj8.lambda.methodreference;

import java.util.function.Function;

public class MethodReference_Constructor {

  public static void main(String[] args) {
    // tag::code[]
    // representation with lambda expression
    Function<String, Integer> stringToInteger1 = s -> new Integer(s);
    // representation with reference to the constructor
    Function<String, Integer> stringToInteger2 = Integer::new;

    // the results will be the same
    System.out.println(stringToInteger1.apply("1"));
    System.out.println(stringToInteger2.apply("1"));
    // end::code[]
  }
  
}
