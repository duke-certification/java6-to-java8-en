package org.j6toj8.concurrency.concurrentpackage;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

public class Concurrency_LinkedBlockingDeque {

  public static void main(String[] args) {
    // tag::code[]
    BlockingDeque<String> queue = new LinkedBlockingDeque<String>();
    
    try {
      queue.offerFirst("ABC", 1, TimeUnit.SECONDS);
      queue.offerLast("DEF", 1, TimeUnit.SECONDS);
    } catch (InterruptedException e) {
      System.out.println("Failed to insert in less than 1 second.");
    }
    
    try {
      queue.pollFirst(1, TimeUnit.SECONDS);
      queue.pollLast(1, TimeUnit.SECONDS);
    } catch (InterruptedException e) {
      System.out.println("Failed to remove in less than 1 second.");
    }    
    // end::code[]
  }
  
}
