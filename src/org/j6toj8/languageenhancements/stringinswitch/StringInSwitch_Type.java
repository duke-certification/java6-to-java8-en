package org.j6toj8.languageenhancements.stringinswitch;

public class StringInSwitch_Type {

  // tag::code[]
  public static void main(String[] args) {
    
    Long month = 1L;
    
    switch (month) { // NOT COMPILING - Long is not a supported type.
    case 1L:
      System.out.println("January");
      break;
    case 2L:
      System.out.println("February");
      break;
    default:
      break;
     }
  }
  // end::code[]
}
