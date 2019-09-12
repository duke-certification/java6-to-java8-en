package org.j6toj8.streams.usingstreams.primitives;

import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class Streams_Generate {

  public static void main(String[] args) {
    // tag::code[]
    // Create infinite stream of random numbers
    System.out.println(" infinity IntStream of random numbers");
    IntStream.generate(() -> new Random().nextInt())
      .limit(3)
      .forEach(System.out::println);
    
    System.out.println("\n infinity DoubleStream of random numbers");
    DoubleStream.generate(Math::random)
      .limit(3)
      .forEach(System.out::println);
    // end::code[]
  }
}
