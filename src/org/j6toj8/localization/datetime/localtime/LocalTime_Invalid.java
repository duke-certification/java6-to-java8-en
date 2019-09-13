package org.j6toj8.localization.datetime.localtime;

import java.time.LocalTime;

public class LocalTime_Invalid {

  public static void main(String[] args) {
    // tag::code[]
    System.out.println(LocalTime.of(24, 2, 3)); // throw exception: time must be between 0 and 23
    // end::code[]
  }
}
