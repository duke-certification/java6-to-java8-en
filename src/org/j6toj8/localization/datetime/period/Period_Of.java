package org.j6toj8.localization.datetime.period;

import java.time.Period;

public class Period_Of {

  public static void main(String[] args) {
    // tag::code[]
    System.out.println(Period.ofDays(2)); // period of 2 days
    System.out.println(Period.ofMonths(2)); // period of 2 months
    System.out.println(Period.ofWeeks(2)); // period of 2 weeks
    System.out.println(Period.ofYears(2)); // period of 2 years
    System.out.println(Period.of(2, 1, 3)); // 2 years, 1 month and 3 days
    // end::code[]
  }
}
