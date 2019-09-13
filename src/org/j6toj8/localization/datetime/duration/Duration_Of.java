package org.j6toj8.localization.datetime.duration;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class Duration_Of {

  public static void main(String[] args) {
    // tag::code[]
    System.out.println(Duration.ofNanos(2)); // 2 nanoseconds
    System.out.println(Duration.ofMillis(2)); // 2 milliseconds
    System.out.println(Duration.ofSeconds(2)); // 2 seconds
    System.out.println(Duration.ofMinutes(2)); // 2 minutes
    System.out.println(Duration.ofHours(2)); // 2 hours
    System.out.println(Duration.ofDays(2)); // 2 days (48 hours)
    System.out.println(Duration.ofSeconds(2, 200)); // 2,0000002 seconds (2 seconds e 200 nanoseconds)
    System.out.println(Duration.of(2, ChronoUnit.MICROS)); // 2 microseconds
    // end::code[]
  }
}
