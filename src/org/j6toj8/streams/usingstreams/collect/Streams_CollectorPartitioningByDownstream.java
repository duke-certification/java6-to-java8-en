package org.j6toj8.streams.usingstreams.collect;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams_CollectorPartitioningByDownstream {

  public static void main(String[] args) {
    // tag::code[]
    // Store the result of the stream in a map
    // Keys are true or false
    // Value is a String which are the names that meet or not the partitioning rule.
    Map<Boolean, String> collect = Stream.of("Rinaldo", "Rodrigo", "Luiz", "Amélia", "Roseany")
      .collect(Collectors.partitioningBy(s -> s.startsWith("R"), Collectors.joining(",")));
    
    System.out.println(collect);
    // end::code[]
  }
}
