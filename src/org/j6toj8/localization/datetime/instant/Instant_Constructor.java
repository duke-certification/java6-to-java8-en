package org.j6toj8.localization.datetime.instant;

import java.time.Instant;

public class Instant_Constructor {

  public static void main(String[] args) {
    // tag::code[]
    Instant instant = new Instant(); // NOT COMPILING! - has no default constructor
    System.out.println(instant);
    // end::code[]
  }
}
