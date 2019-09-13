package org.j6toj8.localization.datetime.localdate;

import java.time.LocalDate;
import java.time.Month;

public class LocalDate_Immutability {

  public static void main(String[] args) {
    // tag::code[]
    LocalDate localDate = LocalDate.of(2019, Month.MAY, 20);
    System.out.println(localDate);
    localDate.plusDays(1); // missed call - new date was not stored in a variable
    System.out.println(localDate);
    localDate = localDate.plusDays(1); // useful call - date stored in variable
    System.out.println(localDate);
    // end::code[]
  }
}
