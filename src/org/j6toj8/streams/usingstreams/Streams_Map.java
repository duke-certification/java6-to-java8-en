package org.j6toj8.streams.usingstreams;

import java.util.stream.IntStream;

public class Streams_Map {

  public static void main(String[] args) {
    // tag::code[]
    IntStream.range(0, 4) // stream from 0 to 3
      .map(e -> e * 2) // multiply the elements by 2
      .forEach(System.out::println); // prints the elements
    // end::code[]
  }
}
