package org.j6toj8.streams.usingstreams.collect;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams_CollectorAveragingInt {

  public static void main(String[] args) {
    // tag::code[]
    // Calculate the average length of each name
    Double collect = Stream.of("Rinaldo", "Rodrigo", "Luiz", "Amélia", "Roseany")
      .collect(Collectors.averagingInt(s -> s.length()));
    
    System.out.println(collect);
    // end::code[]
  }
}
