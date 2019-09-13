package org.j6toj8.lambda.builtininterfaces;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.function.Supplier;

public class BuiltInInterfaces_SupplierUseCase {

  // tag::code[]
  public static String validateAge(int age, Supplier<String> supplier) {
    if (age < 18) {
      return "Under age!";
    } else {
      return "Major age! Validation performed at " + supplier.get();
    }
  }
  
  public static void main(String[] args) {
    Supplier<String> supplier = () -> LocalDate.now().atTime(LocalTime.now()).format(DateTimeFormatter.ISO_DATE_TIME);
    System.out.println(validateAge(17, supplier));
    System.out.println(validateAge(18, supplier));
  }
  // end::code[]
  
}
