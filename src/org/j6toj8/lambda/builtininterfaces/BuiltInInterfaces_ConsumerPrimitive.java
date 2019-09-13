package org.j6toj8.lambda.builtininterfaces;

import java.time.LocalDate;
import java.util.function.IntConsumer;
import java.util.function.ObjIntConsumer;

public class BuiltInInterfaces_ConsumerPrimitive {

  // tag::code[]
  public static void main(String[] args) {
    IntConsumer printer = x -> System.out.println(x);
    printer.accept(5); // will print '5'
    
    ObjIntConsumer<Object> printer2 = (x, y) -> { System.out.println(x); System.out.println(y); };
    printer2.accept(LocalDate.now(), 5); // will print the current date and then '5'
  }
  // end::code[]
  
}
