package org.j6toj8.localization.datetime.localtime;

import java.time.LocalDate;
import java.time.LocalTime;

public class LocalTime_Constructor {

  public static void main(String[] args) {
    // tag::code[]
    LocalTime localTime = new LocalTime(); // NOT COMPILING! - has no default constructor
    System.out.println(localTime);
    // end::code[]
  }
}
