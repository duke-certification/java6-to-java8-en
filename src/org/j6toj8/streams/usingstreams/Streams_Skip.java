package org.j6toj8.streams.usingstreams;

import java.util.stream.IntStream;

public class Streams_Skip {

  public static void main(String[] args) {
    // tag::code[]
    IntStream.range(0, 4) // stream from 0 to 3
      .skip(2) // ignore 2 elements
      .forEach(System.out::println); // prints the elements
    // end::code[]
  }
}
