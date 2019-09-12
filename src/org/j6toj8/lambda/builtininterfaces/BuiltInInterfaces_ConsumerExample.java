package org.j6toj8.lambda.builtininterfaces;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class BuiltInInterfaces_ConsumerExample {

  // tag::code[]
  public static void main(String[] args) {
    Consumer<Object> printer = x -> System.out.println(x);
    printer.accept(LocalDate.now()); // will print the current date
    
    BiConsumer<Object, Object> printer2 = (x, y) -> { System.out.println(x); System.out.println(y); };
    printer2.accept(LocalDate.now(), LocalTime.now()); // will print the current date and then the current time
  }
  // end::code[]
  
}
