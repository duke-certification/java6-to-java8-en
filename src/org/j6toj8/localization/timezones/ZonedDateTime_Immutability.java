package org.j6toj8.localization.timezones;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTime_Immutability {

  public static void main(String[] args) {
    // tag::code[]
    ZonedDateTime zonedDateTime = ZonedDateTime.of(2019, 5, 20, 9, 20, 3, 300, ZoneId.of("America/Sao_Paulo"));
    System.out.println(zonedDateTime);
    zonedDateTime.plusHours(1); // missed call - new date/time was not stored in a variable
    System.out.println(zonedDateTime);
    zonedDateTime = zonedDateTime.plusHours(1); // useful call - date/time stored in variable
    System.out.println(zonedDateTime);
    // end::code[]
  }
}
