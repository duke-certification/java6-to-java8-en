package org.j6toj8.streams.usingstreams;

import java.util.stream.IntStream;

public class Streams_Pipeline {

  public static void main(String[] args) {
    // tag::code[]
    IntStream.range(0, 10) // 0 to 9 Stream
        .filter(e -> e % 2 == 0) // keep only even numbers
        .skip(2) // ignore the first two
        .limit(2) // limited to 3 elements
        .map(e -> e * 2) // multiply each element by 2
        .forEach(System.out::println); // print each element
    // end::code[]
  }
}
