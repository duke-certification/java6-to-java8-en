package org.j6toj8.streams.usingstreams;

import java.util.Arrays;
import java.util.stream.Stream;

public class Streams_FlatMap {

  public static void main(String[] args) {
    // tag::code[]
    // Create 3 distinct arrays
    String[] array1 = new String[] { "A", "B", "C" };
    String[] array2 = new String[] { "D", "E", "F" };
    String[] array3 = new String[] { "G", "H", "I" };
    
    Stream.of(array1, array2, array3) // create a stream of arrays
      .flatMap(a -> Arrays.stream(a)) // transform data from each array into a single data stream
      .forEach(System.out::println); // prints the elements
    // end::code[]
  }
}
