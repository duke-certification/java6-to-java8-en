package org.j6toj8.streams.usingstreams;

import java.util.Arrays;

public class Streams_Peek {

  public static void main(String[] args) {
    // tag::code[]
    // Create a common string array
    String[] array = new String[] { "G", "T", "Y", "A" };
    
    Arrays.stream(array)
        .peek(e -> System.out.println("Peek: " + e)) // watch what went through the stream
        .forEach(e -> System.out.println("ForEach: " + e));
    // end::code[]
  }
}
