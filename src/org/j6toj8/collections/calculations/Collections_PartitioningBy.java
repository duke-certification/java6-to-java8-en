package org.j6toj8.collections.calculations;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Collections_PartitioningBy {

  public static void main(String[] args) {
    // tag::code[]
    List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
    
    Map<Boolean, List<Integer>> mapEvenOdd = list.stream()
      .collect(Collectors.partitioningBy(n -> n % 2 == 0));
    
    System.out.println("Even and odd map: " + mapEvenOdd);
    // end::code[]
  }
 }
