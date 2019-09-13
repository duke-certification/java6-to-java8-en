package org.j6toj8.localization.datetime.duration;

import java.time.Duration;
import java.time.LocalTime;

public class Duration_Between {

  public static void main(String[] args) {
    // tag::code[]
    LocalTime midnight = LocalTime.of(0, 0, 0);
    LocalTime noon = LocalTime.of (12, 0, 0);

    System.out.println(Duration.between(midnight, noon));
    
    System.out.println(Duration.between(noon, midnight));
    
    System.out.println(Duration.between(noon, noon));
    // end::code[]
  }
}
