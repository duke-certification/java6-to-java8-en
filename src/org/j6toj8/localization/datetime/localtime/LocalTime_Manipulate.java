package org.j6toj8.localization.datetime.localtime;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class LocalTime_Manipulate {

  public static void main(String[] args) {
    // tag::code[]
    LocalTime localTime = LocalTime.of(9, 26, 12);
    System.out.println(localTime);
    System.out.println("+2 hours: " + localTime.plusHours(2));
    System.out.println("+2 minutes: " + localTime.plusMinutes(2));
    System.out.println("+2 seconds: " + localTime.plusSeconds(2));
    System.out.println("+2 nanoseconds: " + localTime.plusNanos(2));
    System.out.println("+2 microseconds: " + localTime.plus(2, ChronoUnit.MICROS));
    System.out.println("+2 milliseconds: " + localTime.plus(2, ChronoUnit.MILLIS));
    System.out.println("-2 hours: " + localTime.minusHours(2));
    System.out.println("-2 minutes: " + localTime.minusMinutes(2));
    System.out.println("-2 seconds: " + localTime.minusSeconds(2));
    System.out.println("-2 nanoseconds: " + localTime.minusNanos(2));
    System.out.println("-2 microseconds: " + localTime.minus(2, ChronoUnit.MICROS));
    System.out.println("-2 milliseconds " + localTime.minus(2, ChronoUnit.MILLIS));
    // end::code[]
  }
}
