package org.j6toj8.streams.usingstreams;

import java.util.stream.Stream;

public class Streams_ReuseStream {

  public static void main(String[] args) {
    // tag::code[]
    Stream<Integer> stream = Stream.of(7, 2, 1);
    stream.forEach(System.out::println); // print stream elements
    stream.forEach(System.out::println); // THROWS EXCEPTION - Stream was already closed
    // end::code[]
  }
}
