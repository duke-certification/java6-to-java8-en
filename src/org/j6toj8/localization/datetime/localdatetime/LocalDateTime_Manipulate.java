package org.j6toj8.localization.datetime.localdatetime;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class LocalDateTime_Manipulate {

  public static void main(String[] args) {
    // tag::code[]
    LocalDateTime localDateTime = LocalDateTime.of(2019, 5, 20, 9, 20, 12);
    System.out.println(localDateTime);
    System.out.println("+2 hours: " + localDateTime.plusHours(2));
    System.out.println("+2 minutes: " + localDateTime.plusMinutes(2));
    System.out.println("+2 seconds: " + localDateTime.plusSeconds(2));
    System.out.println("+2 nanoseconds: " + localDateTime.plusNanos(2));
    System.out.println("+2 microseconds: " + localDateTime.plus(2, ChronoUnit.MICROS));
    System.out.println("+2 milliseconds: " + localDateTime.plus(2, ChronoUnit.MILLIS));
    System.out.println("-2 hours: " + localDateTime.minusHours(2));
    System.out.println("-2 minutes: " + localDateTime.minusMinutes(2));
    System.out.println("-2 seconds: " + localDateTime.minusSeconds(2));
    System.out.println("-2 nanoseconds: " + localDateTime.minusNanos(2));
    System.out.println("-2 microseconds: " + localDateTime.minus(2, ChronoUnit.MICROS));
    System.out.println("-2 milliseconds: " + localDateTime.minus(2, ChronoUnit.MILLIS));
    System.out.println("+2 days: " + localDateTime.plusDays(2));
    System.out.println("+2 weeks: " + localDateTime.plusWeeks(2));
    System.out.println("+2 months: " + localDateTime.plusMonths(2));
    System.out.println("+2 years: " + localDateTime.plusYears(2));
    System.out.println("+2 decades: " + localDateTime.plus(2, ChronoUnit.DECADES));
    System.out.println("-2 days: " + localDateTime.minusDays(2));
    System.out.println("-2 weeks: " + localDateTime.minusWeeks(2));
    System.out.println("-2 months: " + localDateTime.minusMonths(2));
    System.out.println("-2 years: " + localDateTime.minusYears(2));
    System.out.println("-2 decades: " + localDateTime.minus(2, ChronoUnit.DECADES));
    // end::code[]
  }
}
