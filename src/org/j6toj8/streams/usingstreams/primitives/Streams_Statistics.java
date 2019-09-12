package org.j6toj8.streams.usingstreams.primitives;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class Streams_Statistics {

  public static void main(String[] args) {
    // tag::code[]
    IntSummaryStatistics summaryStatistics = IntStream.range(0, 10).summaryStatistics();
    System.out.println("Count: " + summaryStatistics.getCount());
    System.out.println("Max: " + summaryStatistics.getMax());
    System.out.println("Min: " + summaryStatistics.getMin());
    System.out.println("Sum: " + summaryStatistics.getSum());
    System.out.println("Average: " + summaryStatistics.getAverage());
    // end::code[]
  }
}
