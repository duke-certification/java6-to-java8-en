package org.j6toj8.streams.parallelstreams;

import java.util.Arrays;
import java.util.List;

public class Streams_ParallelForEach {

  public static void main(String[] args) {
    // tag::code[]
    List<String> list = Arrays.asList("A", "B", "C");

    System.out.println("Sequential: ");
    list.stream() // create a sequential stream
        .forEach(System.out::println);

    System.out.println("Parallel: ");
    list.parallelStream() // create a parallel stream
        .forEach(System.out::println);
    // end::code[]
  }
}
