package org.j6toj8.streams.usingstreams;

import java.util.Optional;
import java.util.stream.Stream;

public class Streams_FindFirstAny {

  public static void main(String[] args) {
    // tag::code[]
    Optional<Integer> findFirst = Stream.of(7, 2, 1, 8, 4, 9, 2, 8) // stream from multiple Integer
        .findFirst(); // get the first stream number
    System.out.println("First: " + findFirst.get());

    Optional<Integer> findAny = Stream.of(7, 2, 1, 8, 4, 9, 2, 8) // stream from multiple Integer
        .findAny(); // get any number from the stream
    System.out.println("Any: " + findAny.get());
    // end::code[]
  }
}
