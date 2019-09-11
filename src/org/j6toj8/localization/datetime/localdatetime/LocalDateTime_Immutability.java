package org.j6toj8.localization.datetime.localdatetime;

import java.time.LocalDateTime;

public class LocalDateTime_Immutability {

  public static void main(String[] args) {
    // tag::code[]
    LocalDateTime localDateTime = LocalDateTime.of(2019, 5, 20, 9, 20);
    System.out.println(localDateTime);
    localDateTime.plusHours(1); // missed call - new date/time was not stored in a variable
    System.out.println(localDateTime);
    localDateTime = localDateTime.plusHours(1); // useful call - date/time stored in variable
    System.out.println(localDateTime);
    // end::code[]
  }
}
