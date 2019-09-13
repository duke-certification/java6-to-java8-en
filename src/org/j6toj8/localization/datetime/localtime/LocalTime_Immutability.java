package org.j6toj8.localization.datetime.localtime;

import java.time.LocalTime;

public class LocalTime_Immutability {

  public static void main(String[] args) {
    // tag::code[]
    LocalTime localTime = LocalTime.of(9, 31, 5);
    System.out.println(localTime);
    localTime.plusHours(1); // missed call - the new time was not stored in a variable
    System.out.println(localTime);
    localTime = localTime.plusHours(1); // useful call - time stored in variable
    System.out.println(localTime);
    // end::code[]
  }
}
