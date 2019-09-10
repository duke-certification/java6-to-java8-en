package org.j6toj8.languageenhancements.literals;

public class Literals_Prefix {

  public static void main(String[] args) {

    // tag::code[]
    int i1 = 0567; // octadecimal - base 8 - starts with 0
    int i2 = 0xFA1; // hexadecimal - base 16 - starts with 0x
    int i3 = 0b0101; // binary - base 2 - starts with 0b
    
    long l1 = 0xABCL; // long can also be hexadecimal - starts with 0x and ends with L
    // end::code[]
  }
}
