package org.j6toj8.streams.usingstreams;

import java.util.Arrays;

public class Streams_Distinct {

  public static void main(String[] args) {
    // tag::code[]
    // Create a common string array
    String[] array = new String[] { "A", "B", "C", "A", "B", "F" };
    
    Arrays.stream(array)
        .distinct() // ignore repeated elements
        .forEach(System.out::println);
    // end::code[]
  }
}
