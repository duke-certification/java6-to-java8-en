package org.j6toj8.languageenhancements.stringinswitch;

public class StringInSwitch_Empty {

  // tag::code[]
  public static void main(String[] args) {
    
    String month = "jan";
    switch (month) {} // COMPILES - switch may be empty even if it's useless
  }
  // end::code[]
}
