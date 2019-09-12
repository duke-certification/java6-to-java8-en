package org.j6toj8.streams.usingstreams.collect;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams_CollectorToMapDuplicateKey {

  public static void main(String[] args) {
    // tag::code[]
    // Store the result of the stream in a map
    // The key is the name length
    // Value is the names with that size
    Map<Object, Object> collect = Stream.of("Rinaldo", "Rodrigo", "Luiz", "Amélia", "Roseany")
      .collect(Collectors.toMap(s -> s.length(), s -> s, (s1, s2) -> s1 + "," + s2));
    
    System.out.println(collect);
    // end::code[]
  }
}
