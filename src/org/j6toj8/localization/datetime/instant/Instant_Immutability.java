package org.j6toj8.localization.datetime.instant;

import java.time.Instant;

public class Instant_Immutability {

  public static void main(String[] args) {
    // tag::code[]
    Instant instant = Instant.ofEpochMilli(1000000000000L);
    System.out.println(instant);
    instant.plusSeconds(60); // missed call - new date/time was not stored in a variable
    System.out.println(instant);
    instant = instant.plusSeconds(60); // useful call - date/time stored in variable
    System.out.println(instant);
    // end::code[]
  }
}
