package org.j6toj8.lambda.lambdaexpression;

import java.util.Arrays;
import java.util.List;

public class LambdaExpression_ForEach {

  public static void main(String[] args) {
    // tag::code[]
    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
    list.forEach((number) -> { System.out.println(number); });
    // end::code[]
  }
}
