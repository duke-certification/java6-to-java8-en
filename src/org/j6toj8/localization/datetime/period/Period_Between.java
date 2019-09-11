package org.j6toj8.localization.datetime.period;

import java.time.LocalDate;
import java.time.Period;

public class Period_Between {

  public static void main(String[] args) {
    // tag::code[]
    LocalDate birth = LocalDate.of(1990, 8, 6);
    LocalDate today = LocalDate.now();
    Period age = Period.between(birth, today);
    System.out.println(age);
    // end::code[]
  }
}
