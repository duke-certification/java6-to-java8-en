package org.j6toj8.lambda.builtininterfaces;

import java.time.LocalDate;
import java.util.function.Supplier;

public class BuiltInInterfaces_SupplierExample {

  // tag::code[]
  public static void main(String[] args) {
    Supplier<LocalDate> supplier = () -> LocalDate.now();
    System.out.println(supplier.get()); // will print the current date
  }
  // end::code[]
  
}
