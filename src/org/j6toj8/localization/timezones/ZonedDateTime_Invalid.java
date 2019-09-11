package org.j6toj8.localization.timezones;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTime_Invalid {

  public static void main(String[] args) {
    // tag::code[]
    System.out.println(ZonedDateTime.of(2019, 4, 31, 9, 20, 3, 1000, ZoneId.of("America/Sao_Paulo"))); // throws exception: there is no April 31
    // end::code[]
  }
}
