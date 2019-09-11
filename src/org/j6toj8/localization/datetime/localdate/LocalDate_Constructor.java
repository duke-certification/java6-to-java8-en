package org.j6toj8.localization.datetime.localdate;

import java.time.LocalDate;

public class LocalDate_Constructor {

  public static void main(String[] args) {
    // tag::code[]
    LocalDate localDate = new LocalDate(); // NOT COMPILING! - has no default constructor
    System.out.println(localDate);
    // end::code[]
  }
}
