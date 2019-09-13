package org.j6toj8.streams.usingstreams;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class Streams_MaxMinCount {

  public static void main(String[] args) {
    // tag::code[]
    Optional<Integer> max = Stream.of(7, 2, 1, 8, 4, 9, 2, 8) // stream from multiple Integer
        .max(Comparator.naturalOrder()); // get the greatest stream number
    System.out.println("Max: " + max.get());

    Optional<Integer> min = Stream.of(7, 2, 1, 8, 4, 9, 2, 8) // stream from multiple Integer
        .min(Comparator.naturalOrder()); // get the smallest stream number
    System.out.println("Min: " + min.get());

    long count = Stream.of(7, 2, 1, 8, 4, 9, 2, 8) // stream from multiple Integer
        .count(); // get the number of stream elements
    System.out.println("Count: " + count);
    // end::code[]
  }
}
