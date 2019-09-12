package org.j6toj8.streams.usingstreams.collect;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams_CollectorToMap {

  public static void main(String[] args) {
    // tag::code[]
    // Store the result of the stream in a map
    // The key is its own name (s -> s)
    // Value is the name length
    Map<String, Integer> collect = Stream.of("Rinaldo", "Rodrigo", "Luiz", "Amélia", "Roseany")
      .collect(Collectors.toMap(s -> s, s -> s.length()));
    
    System.out.println(collect);
    // end::code[]
  }
}
