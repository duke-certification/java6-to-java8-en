package org.j6toj8.languageenhancements.stringinswitch;

public class StringInSwitch_Complete {

  // tag::code[]
  public static void main(String[] args) {
    
    String month = "jan";
    
    switch (month) {
    case "jan":
      System.out.println("January");
      break;
    case "feb":
      System.out.println("February");
      break;
    case "mar":
      System.out.println("March");
      break;
    default:
      break;
    }
  }
  // end::code[]
}
