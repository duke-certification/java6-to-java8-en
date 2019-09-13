package org.j6toj8.lambda.methodreference;

import java.util.function.BiFunction;

public class MethodReference_Instance {

  // tag::code[]
  static class Converter {
    public String convert(Integer x, Integer y) {
      return String.valueOf(x) + " - " + String.valueOf(y);
    }
  }
  
  public static void main(String[] args) {
    Converter converter = new Converter(); // instance of the Converter class
    
    // representation with lambda expression
    BiFunction<Integer, Integer, String> convert1 = (x, y) -> converter.convert(x, y);
    // representation with reference to instance method
    BiFunction<Integer, Integer, String> convert2 = converter::convert;

    // the results will be the same
    System.out.println(convert1.apply(5, 8));
    System.out.println(convert2.apply(5, 8));
  }
  // end::code[]
  
}
