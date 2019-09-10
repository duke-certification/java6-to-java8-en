package org.j6toj8.languageenhancements.literals;

public class Literals_Complete {

  public static void main(String[] args) {

    // tag::code[]
    int i1 = 1; // int
    int i2 = 1_000_000; // int with underscore
    int i3 = 0567; // octadecimal
    int i4 = 0xFA1; // hexadecimal
    int i5 = 0b0101; // binary
    
    long l1 = 1L; // long with L
    long l2 = 1l; // long with l
    long l3 = 12_345_6_7890_123456_789L; // long with underscore
    long l4 = 0xFA1L; // hexadecimal long
    
    double d1 = 1.00; // double
    double d2 = 100_000.01; // double with underscore
    double d3 = 1D; // double with D
    double d4 = 3.1E2; // cientific notation = 3.1 * 10^2 = 3.1 * 100 = 310.0
    
    float f1 = 1.00F; // float
    // end::code[]
  }
}
