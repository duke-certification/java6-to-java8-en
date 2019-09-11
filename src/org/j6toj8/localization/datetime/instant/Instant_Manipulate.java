package org.j6toj8.localization.datetime.instant;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class Instant_Manipulate {

  public static void main(String[] args) {
    // tag::code[]
    Instant instant = Instant.ofEpochMilli(1000000000000L);
    System.out.println(instant);
    System.out.println("+2 seconds: " + instant.plusSeconds(2));
    System.out.println("+2 nanoseconds: " + instant.plusNanos(2));
    System.out.println("+2 microseconds: " + instant.plus(2, ChronoUnit.MICROS));
    System.out.println("+2 milliseconds: " + instant.plus(2, ChronoUnit.MILLIS));
    System.out.println("-2 seconds: " + instant.minusSeconds(2));
    System.out.println("-2 nanoseconds: " + instant.minusNanos(2));
    System.out.println("-2 microseconds: " + instant.minus(2, ChronoUnit.MICROS));
    System.out.println("-2 milliseconds: " + instant.minus(2, ChronoUnit.MILLIS));
    System.out.println("+2 days: " + instant.plus(2, ChronoUnit.DAYS));
    System.out.println("+2 weeks: " + instant.plus(2, ChronoUnit.WEEKS)); // runtime error
    // end::code[]
  }
}
