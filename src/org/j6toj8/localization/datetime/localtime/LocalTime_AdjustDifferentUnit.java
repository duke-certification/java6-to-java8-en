package org.j6toj8.localization.datetime.localtime;

import java.time.LocalTime;

public class LocalTime_AdjustDifferentUnit {

  public static void main(String[] args) {
    // tag::code[]
    LocalTime localTime = LocalTime.of(9, 59, 59);
    System.out.println(localTime);
    System.out.println(localTime.plusSeconds(2)); // + 2 seconds, turns the minute
    System.out.println(localTime.plusSeconds(62)); // + 62 seconds, turns the hour
    System.out.println(localTime.plusMinutes(2)); // + 2 minutes, turns the hour
    System.out.println(localTime.minusNanos(1000000000)); // - 1 second (in nanos), turns the minute
    // end::code[]
  }
}
