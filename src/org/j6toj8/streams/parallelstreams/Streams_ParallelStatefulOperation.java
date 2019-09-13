package org.j6toj8.streams.parallelstreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Streams_ParallelStatefulOperation {

  public static void main(String[] args) {
    // tag::code[]
    List<String> synchronizedList = Collections.synchronizedList(new ArrayList<>());
    List<String> list = Arrays.asList("A", "B", "C");

    System.out.println("Order on forEachOrdered: ");
    list.parallelStream()
        .map(s -> {synchronizedList.add(s); return s;}) // side effect operation - changes the state of an object
        .forEachOrdered(System.out::println);
    
    System.out.println("Order on synchronizedList: ");
    for (String s : synchronizedList) {
      System.out.println(s);
    }
    // end::code[]
  }
}
