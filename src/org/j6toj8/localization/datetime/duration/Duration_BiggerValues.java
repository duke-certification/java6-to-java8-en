package org.j6toj8.localization.datetime.duration;

import java.time.Duration;

public class Duration_BiggerValues {

  public static void main(String[] args) {
    // tag::code[]
    System.out.println(Duration.ofMinutes(120)); // 120 minutes
    System.out.println(Duration.ofMinutes(121)); // 2 hours and 1 minute
    System.out.println(Duration.ofMinutes(119)); // 1 hour and 59 minutes
    System.out.println(Duration.ofSeconds(10000)); // 2 hours, 46 minutes and 40 seconds
    // end::code[]
  }
}
