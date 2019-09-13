package org.j6toj8.collections.mergemap;

import java.util.Arrays;
import java.util.List;

public class Collections_FlatMap {

  public static void main(String[] args) {
    // tag::code[]
    List<String> list = Arrays.asList("Manoel");
    
    System.out.println("\n With map: ");
    // com map - String letters become Stream within Stream
    list.stream()
      .map(s -> Arrays.stream(s.split("")))
      .forEach(System.out::println);
    
    System.out.println("\n With flatMap: ");
    // with flatMap - String letters become data of the Stream
    list.stream()
      .flatMap(s -> Arrays.stream(s.split("")))
      .forEach(System.out::println);
    // end::code[]
  }
}
