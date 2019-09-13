package org.j6toj8.streams.usingstreams.primitives;

import java.util.Arrays;
import java.util.List;

public class Streams_MapTo {

  public static void main(String[] args) {
    // tag::code[]
    List<Integer> list = Arrays.asList(1, 2, 3, 4);
    
    System.out.println(" Stream to IntStream");
    list.stream() // creates Stream<Integer>
      .mapToInt(Integer::intValue) // transform into IntStream
      .forEach(System.out::print);
    
    System.out.println("\n Stream to LongStream");
    list.stream() // creates Stream<Long>
      .mapToLong(Integer::longValue) // transform into LongStream
      .forEach(System.out::print);
    
    System.out.println("\n Stream to DoubleStream");
    list.stream() // creates Stream<Double>
      .mapToDouble(Integer::doubleValue) // transform into DoubleStream
      .forEach(System.out::print);
    // end::code[]
  }
}
