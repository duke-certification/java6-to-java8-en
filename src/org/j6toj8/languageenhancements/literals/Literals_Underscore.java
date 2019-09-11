package org.j6toj8.languageenhancements.literals;

public class Literals_Underscore {

  public static void main(String[] args) {

    // tag::code[]
    int i1 = 1_000_000; // int with underscore - is the same as writing 1000000
    int i2 = 10_00_00_0; // underscore can be anywhere between 2 numbers
    int i3 = _1000; // NOT COMPILING - underscore can't be at the beginning
    int 14 = 1000_; // NOT COMPILING - underscore can't be at the end
    int i5 = 1___000; // COMPILES - Multiple underscore is allowed as long as they are between 2 numbers
    int i6 = 0x_100; // NOT COMPILING - between base marker is not allowed
    int i7 = 0xF_F; // COMPILES - Although they are letters, they represent numerical values of this base

    long l1 = 12_345_6_7890_123456_789L; // long with underscore
    long l2 = 12_345_6_789_L; // NOT COMPILING - cannot be next to a type marker

    double d1 = 100_000.01; // double with underscore
    double d2 = 10_.01; // NOT COMPILING - underscore must be between numbers
    double d3 = 10._01; // NOT COMPILING - underscore must be between numbers
    // end::code[]
  }
}
