package org.j6toj8.streams.usingstreams.collect;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams_CollectorToCollect {

  public static void main(String[] args) {
    // tag::code[]
    // store Stream result in an ArrayList
    Collection<Integer> collect = Stream.of(1, 2, 3, 4)
      .collect(Collectors.toCollection(ArrayList::new));
    System.out.println("ArrayList: " + collect);
    
    // store Stream result in a HashSet
    Collection<Integer> collect2 = Stream.of(1, 2, 3, 4)
      .collect(Collectors.toCollection(HashSet::new));
    System.out.println("HashSet: " + collect2);
    
    // store Stream result in a LinkedList
    Collection<Integer> collect3 = Stream.of(1, 2, 3, 4)
      .collect(Collectors.toCollection(LinkedList::new));
    System.out.println("LinkedList: " + collect3);

    // store Stream result in a TreeSet
    Collection<Integer> collect4 = Stream.of(1, 2, 3, 4)
      .collect(Collectors.toCollection(TreeSet::new));
    System.out.println("TreeSet: " + collect4);
    // end::code[]
  }
}
