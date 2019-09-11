package org.j6toj8.languageenhancements.stringinswitch;

public class StringInSwitch_Default {

  // tag::code[]
  public static void main(String[] args) {

    String month = "jan";

    switch (month) {
    case "jan":
      System.out.println("January");
      break;
    default: // COMPILES - `Default` can be in any position
      break;
    case "jan": // NOT COMPILING - There is already case "jan"
      System.out.println("January2");
      break;
    case "mar":
      System.out.println("March");
      break;
    }
  }
  // end::code[]
}
