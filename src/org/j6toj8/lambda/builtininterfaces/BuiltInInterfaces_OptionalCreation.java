package org.j6toj8.lambda.builtininterfaces;

import java.util.Optional;

public class BuiltInInterfaces_OptionalCreation {

  // tag::code[]
  // method example without Optional
  private static String retrieveMonthName(int month) {
    if (month == 1) {
      return "January";
    } else {
      return null;
    }
  }
  
  // method example returning Optional
  private static Optional<String> retrieveMonthNameOptional(int month) {
    if (month == 1) {
      return Optional.of("January"); // create Optional with value
    } else {
      return Optional.empty(); // create empty Optional
    }
  }
  
  public static void main(String[] args) {
    String monthName1 = retrieveMonthName(1);
    if (monthName1 != null) { // validates if value exists through traditional comparison '! = null'
      System.out.println(monthName1);
    }
    
    Optional<String> monthName2 = retrieveMonthNameOptional(1);
    if (monthName2.isPresent()) { // validates if Optional has a filled value
      System.out.println(monthName2.get()); // retrieve value within Optional
    }
  }
  // end::code[]
  
}
