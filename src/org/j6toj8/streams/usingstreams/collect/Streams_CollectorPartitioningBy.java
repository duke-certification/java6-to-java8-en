package org.j6toj8.streams.usingstreams.collect;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams_CollectorPartitioningBy {

  public static void main(String[] args) {
    // tag::code[]
    // Store the result of the stream in a map
    // Keys are true or false
    // Value is a list of values that meet or not the partitioning rule
    Map<Boolean, List<String>> collect = Stream.of("Rinaldo", "Rodrigo", "Luiz", "Amélia", "Roseany")
      .collect(Collectors.partitioningBy(s -> s.startsWith("R")));
    
    System.out.println(collect);
    // end::code[]
  }
}
