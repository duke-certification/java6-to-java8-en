package org.j6toj8.concurrency.executetasks;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import sun.print.resources.serviceui;

public class Tasks_SingleThreadAwaitTermination {

  public static void main(String[] args) {
    // tag::code[]
    ExecutorService executor = null;
    try {
      executor = Executors.newSingleThreadExecutor();
      
      executor.execute(() -> System.out.println("Task 1 - Executor Thread: " + Thread.currentThread().getName()));
      executor.execute(() -> System.out.println("Task 2 - Executor Thread: " + Thread.currentThread().getName()));
      executor.execute(() -> System.out.println("Task 3 - Executor Thread: " + Thread.currentThread().getName()));
    } finally {
      if (executor != null) {
        executor.shutdown();
      }
    }
    
    if (executor != null) {
      try {
        System.out.println("Tasks completed? " + executor.isTerminated());
        executor.awaitTermination(1, TimeUnit.SECONDS);
        System.out.println("Tasks completed? " + executor.isTerminated());
      } catch (InterruptedException e) {
        System.out.println("Interruption error.");
      }
    }
    // end::code[]
  }
  
}
