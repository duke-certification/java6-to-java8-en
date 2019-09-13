package org.j6toj8.concurrency.concurrentpackage;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Concurrency_CopyOnWriteArrayList {

  public static void main(String[] args) {
    // tag::code[]
    List<String> list = new CopyOnWriteArrayList<String>();
    list.add("A");
    list.add("B");
    list.add("C");
    
    for (String string : list) {
      System.out.println(string);
      if (string.equals("A")) {
        list.add("D");
      }
    }
    
    System.out.println("Final list: " + list);
    // end::code[]
  }
  
}
