package org.j6toj8.streams.usingstreams;

import java.util.Arrays;

public class Streams_ArraysStream {

  public static void main(String[] args) {
    // tag::code[]
    // Create a common string array
    String[] array = new String[] { "A", "B", "C" };
    // Create a stream from the array and, for each element, the println method is called.
    Arrays.stream(array).forEach(System.out::println); 
    // end::code[]
  }
}
