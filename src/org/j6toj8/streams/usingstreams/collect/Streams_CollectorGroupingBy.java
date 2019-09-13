package org.j6toj8.streams.usingstreams.collect;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams_CollectorGroupingBy {

  public static void main(String[] args) {
    // tag::code[]
    // Store the result of the stream in a map
    // The key is the name length
    // Value is a list of names that are that long
    Map<Object, List<String>> collect = Stream.of("Rinaldo", "Rodrigo", "Luiz", "Amélia", "Roseany")
      .collect(Collectors.groupingBy(s -> s.length()));
    
    System.out.println(collect);
    // end::code[]
  }
}
