package org.j6toj8.streams.usingstreams;

import java.util.Arrays;

public class Streams_Sorted {

  public static void main(String[] args) {
    // tag::code[]
    // Create a common string array
    String[] array = new String[] { "G", "T", "Y", "A", "B", "C", "A", "B", "F" };
    
    Arrays.stream(array)
        .sorted() // orders using the natural order
        .forEach(System.out::println);
    // end::code[]
  }
}
