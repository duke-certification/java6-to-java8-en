package org.j6toj8.languageenhancements.stringinswitch;

public class StringInSwitch_ConstantOnly {

  // tag::code[]
  private static final String FEB = "feb";
  private static String jan = "jan";
  
  public static void getMonthName(final String may) {
    
    String month = "jan";
    
    final String mar = "mar";
    String apr = "apr";
    
    switch (month) {
    case jan: // WON'T COMPILE - jan is a common attribute, can change at runtime
      System.out.println("January");
      break;
    case FEB: // COMPILES - FEB is a compilation time constant, its value never changes
      System.out.println("February");
      break;
    case mar: // COMPILES - mar is a constant at compilation time, its value never changes
      System.out.println("March");
      break;
    case apr: // WON'T COMPILE - apr is a common variable, can change at runtime
      System.out.println("April");
      break;
    case may: // WON'T COMPILE - may is final but not constant, may change at runtime
      System.out.println("May");
      break;
     }
  }
  // end::code[]
}
