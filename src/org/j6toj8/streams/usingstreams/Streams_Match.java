package org.j6toj8.streams.usingstreams;

import java.util.stream.Stream;

public class Streams_Match {

  public static void main(String[] args) {
    // tag::code[]
    boolean anyMatch = Stream.of(7, 2, 1, 8, 4, 9, 2, 8) // stream from multiple Integer
        .anyMatch(e -> e > 5); // check if any element is greater than 5
    System.out.println("anyMatch: " + anyMatch);

    boolean allMatch = Stream.of(7, 2, 1, 8, 4, 9, 2, 8) // stream from multiple Integer
        .allMatch(e -> e > 5); // check if ALL elements are greater than 5
    System.out.println("allMatch: " + allMatch);
    
    boolean noneMatch = Stream.of(7, 2, 1, 8, 4, 9, 2, 8) // stream from multiple Integer
        .noneMatch(e -> e > 5); // checks that NO element is greater than 5
    System.out.println("noneMatch: " + noneMatch);

    // end::code[]
  }
}
