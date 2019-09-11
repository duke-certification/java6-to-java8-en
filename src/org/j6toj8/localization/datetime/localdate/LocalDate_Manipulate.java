package org.j6toj8.localization.datetime.localdate;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class LocalDate_Manipulate {

  public static void main(String[] args) {
    // tag::code[]
    LocalDate localDate = LocalDate.of(2019, Month.MAY, 20);
    System.out.println(localDate);
    System.out.println("+2 days: " + localDate.plusDays(2));
    System.out.println("+2 weeks: " + localDate.plusWeeks(2));
    System.out.println("+2 months: " + localDate.plusMonths(2));
    System.out.println("+2 years: " + localDate.plusYears(2));
    System.out.println("+2 decades: " + localDate.plus(2, ChronoUnit.DECADES));
    System.out.println("-2 days: " + localDate.minusDays(2));
    System.out.println("-2 weeks: " + localDate.minusWeeks(2));
    System.out.println("-2 months: " + localDate.minusMonths(2));
    System.out.println("-2 years: " + localDate.minusYears(2));
    System.out.println("-2 decades: " + localDate.minus(2, ChronoUnit.DECADES));
    // end::code[]
  }
}
