package org.j6toj8.streams.parallelstreams;

import java.util.stream.IntStream;

public class Streams_ParallelPerformance {

  public static void main(String[] args) {
    // tag::code[]
    long start = System.currentTimeMillis();
    IntStream.range(0, Integer.MAX_VALUE) // sequential stream
      .mapToDouble(n -> Math.pow(n, 2))
      .average()
      .ifPresent(n -> System.out.println("Sequential Stream time: " + (System.currentTimeMillis() - start)));
    
    long start2 = System.currentTimeMillis();
    IntStream.range(0, Integer.MAX_VALUE)
      .parallel() // parallel stream
      .mapToDouble(n -> Math.pow(n, 2))
      .average()
      .ifPresent(n -> System.out.println("Parallel Stream time: " + (System.currentTimeMillis() - start2)));
    // end::code[]
  }
}
