package org.j6toj8.localization.timezones;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class ZonedDateTime_Manipulate {

  public static void main(String[] args) {
    // tag::code[]
    ZonedDateTime zonedDateTime = ZonedDateTime.of(2019, 5, 20, 9, 20, 12, 1000, ZoneId.of("America/Sao_Paulo"));
    System.out.println(zonedDateTime);
    System.out.println("+2 hours: " + zonedDateTime.plusHours(2));
    System.out.println("+2 minutes: " + zonedDateTime.plusMinutes(2));
    System.out.println("+2 seconds: " + zonedDateTime.plusSeconds(2));
    System.out.println("+2 nanoseconds: " + zonedDateTime.plusNanos(2));
    System.out.println("+2 microseconds: " + zonedDateTime.plus(2, ChronoUnit.MICROS));
    System.out.println("+2 milliseconds: " + zonedDateTime.plus(2, ChronoUnit.MILLIS));
    System.out.println("-2 hours: " + zonedDateTime.minusHours(2));
    System.out.println("-2 minutes: " + zonedDateTime.minusMinutes(2));
    System.out.println("-2 seconds: " + zonedDateTime.minusSeconds(2));
    System.out.println("-2 nanoseconds: " + zonedDateTime.minusNanos(2));
    System.out.println("-2 microseconds: " + zonedDateTime.minus(2, ChronoUnit.MICROS));
    System.out.println("-2 milliseconds: " + zonedDateTime.minus(2, ChronoUnit.MILLIS));
    System.out.println("+2 days: " + zonedDateTime.plusDays(2));
    System.out.println("+2 weeks: " + zonedDateTime.plusWeeks(2));
    System.out.println("+2 months: " + zonedDateTime.plusMonths(2));
    System.out.println("+2 years: " + zonedDateTime.plusYears(2));
    System.out.println("+2 decades: " + zonedDateTime.plus(2, ChronoUnit.DECADES));
    System.out.println("-2 days: " + zonedDateTime.minusDays(2));
    System.out.println("-2 weeks: " + zonedDateTime.minusWeeks(2));
    System.out.println("-2 months: " + zonedDateTime.minusMonths(2));
    System.out.println("-2 years: " + zonedDateTime.minusYears(2));
    System.out.println("-2 decades: " + zonedDateTime.minus(2, ChronoUnit.DECADES));
    // end::code[]
  }
}
