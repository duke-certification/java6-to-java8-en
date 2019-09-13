package org.j6toj8.localization.datetime.period;

import java.time.Period;

public class Period_BiggerValues {

  public static void main(String[] args) {
    // tag::code[]
    System.out.println(Period.of(0, 60, 2)); // 60 months and 2 days
    System.out.println(Period.of(0, 30, 50)); // 30 months and 50 days
    System.out.println(Period.of(5, 200, 1000)); // 5 years, 200 months and 1000 days
    // end::code[]
  }
}
