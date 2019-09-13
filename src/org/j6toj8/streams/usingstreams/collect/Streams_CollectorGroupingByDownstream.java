package org.j6toj8.streams.usingstreams.collect;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams_CollectorGroupingByDownstream {

  public static void main(String[] args) {
    // tag::code[]
    // Store the result of the stream in a map
    // The key is the name length
    // Value is the names that have that size
    Map<Object, String> collect = Stream.of("Rinaldo", "Rodrigo", "Luiz", "Amélia", "Roseany")
      .collect(Collectors.groupingBy(s -> s.length(), Collectors.joining(",")));
    
    System.out.println(collect);
    // end::code[]
  }
}
