package org.j6toj8.streams.usingstreams;

import java.util.stream.IntStream;

public class Streams_Filter {

  public static void main(String[] args) {
    // tag::code[]
    IntStream.range(0, 4) // stream from 0 to 3
      .filter(e -> e % 2 == 0) // limited to even numbers (rest of division by 2 is 0)
      .forEach(System.out::println); // prints the elements
    // end::code[]
  }
}
