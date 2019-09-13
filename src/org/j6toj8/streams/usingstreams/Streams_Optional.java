package org.j6toj8.streams.usingstreams;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class Streams_Optional {

  public static void main(String[] args) {
    // tag::code[]
    // Example without Chaining Optional Calling
    Optional<Integer> max = Stream.of(7, 2, 1)
        .max(Comparator.naturalOrder());
    
    max.ifPresent(System.out::println);
    
    // Example by Chaining Optional Calling
    Stream.of(7, 2, 1)
        .max(Comparator.naturalOrder())
        .ifPresent(System.out::println);
    // end::code[]
  }
}
