package org.j6toj8.localization.datetime.localdatetime;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class LocalDateTime_Constructor {

  public static void main(String[] args) {
    // tag::code[]
    LocalDateTime localDateTime = new LocalDateTime(); // NOT COMPILING! - has no default constructor
    System.out.println(localDateTime);
    // end::code[]
  }
}
