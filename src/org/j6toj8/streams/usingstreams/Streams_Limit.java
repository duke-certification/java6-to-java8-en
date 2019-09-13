package org.j6toj8.streams.usingstreams;

import java.util.stream.IntStream;

public class Streams_Limit {

  public static void main(String[] args) {
    // tag::code[]
    IntStream.range(0, 4) // stream from 0 to 3
      .limit(2) // limited to 2 elements
      .forEach(System.out::println); // prints the elements
    // end::code[]
  }
}
