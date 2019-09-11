package org.j6toj8.localization.formats.decimalformat;

import java.text.DecimalFormat;

public class DecimalFormat_Instance {

  public static void main(String[] args) {
    // tag::code[]
    double d = 12345.67;

    // omit all empty positions, use separator every 3 places
    DecimalFormat instance1 = new DecimalFormat("###,###.###");
    System.out.println("###,###.###: " + instance1.format(d));

    // omits empty positions in decimal, uses separator every 3 places
    DecimalFormat instance2 = new DecimalFormat("000,000.###");
    System.out.println("000,000.###: " + instance2.format(d));

    // omits empty positions on integer, uses separator every 3 places
    DecimalFormat instance3 = new DecimalFormat("###,###.000");
    System.out.println("###,###.000: " + instance3.format(d));

    // displays all positions, uses separator every 3 boxes
    DecimalFormat instance4 = new DecimalFormat("000,000.000");
    System.out.println("000,000.000: " + instance4.format(d));

    // omits all empty positions, does not use separator
    DecimalFormat instance5 = new DecimalFormat("###.##");
    System.out.println("###.##: " + instance5.format(d));

    // displays all positions, does not use separator
    DecimalFormat instance6 = new DecimalFormat("000000.000");
    System.out.println("000000.000: " + instance6.format(d));

    // omits all empty positions, does not separator and decimal places
    DecimalFormat instance7 = new DecimalFormat("###");
    System.out.println("###: " + instance7.format(d));
    // end::code[]
  }
}
