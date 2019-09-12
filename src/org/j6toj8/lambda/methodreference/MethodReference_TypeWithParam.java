package org.j6toj8.lambda.methodreference;

import java.util.function.BiFunction;

public class MethodReference_TypeWithParam {

  public static void main(String[] args) {
    // tag::code[]
    // representation with lambda expression
    BiFunction<Integer, Integer, Integer> comparator1 = (x, y) -> x.compareTo(y);
    // representation with reference to compareTo method of type Integer (which takes a parameter)
    BiFunction<Integer, Integer, Integer> comparator2 = Integer::compareTo;

    // the results will be the same
    System.out.println(comparator1.apply(1, 2));
    System.out.println(comparator2.apply(1, 2));
    // end::code[]
  }
  
}
