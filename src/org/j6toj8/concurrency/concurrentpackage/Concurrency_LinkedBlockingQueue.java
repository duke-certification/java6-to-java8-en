package org.j6toj8.concurrency.concurrentpackage;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class Concurrency_LinkedBlockingQueue {

  public static void main(String[] args) {
    // tag::code[]
    BlockingQueue<String> queue = new LinkedBlockingQueue<String>();
    
    try {
      queue.offer("ABC", 1, TimeUnit.SECONDS);
    } catch (InterruptedException e) {
      System.out.println("Failed to insert in less than 1 second.");
    }
    
    try {
      queue.poll(1, TimeUnit.SECONDS);
    } catch (InterruptedException e) {
      System.out.println("Failed to remove in less than 1 second.");
    }    
    // end::code[]
  }
  
}
