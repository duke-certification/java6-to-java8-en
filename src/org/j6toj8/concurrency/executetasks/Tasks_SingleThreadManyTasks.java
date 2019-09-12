package org.j6toj8.concurrency.executetasks;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Tasks_SingleThreadManyTasks {

  public static void main(String[] args) {
    // tag::code[]
    ExecutorService executor = null;
    try {
      executor = Executors.newSingleThreadExecutor(); // executor with a single thread
      executor.execute(() -> System.out.println("Task 1 - Executor Thread: " + Thread.currentThread().getName()));
      executor.execute(() -> System.out.println("Task 2 - Executor Thread: " + Thread.currentThread().getName()));
      executor.execute(() -> System.out.println("Task 3 - Executor Thread: " + Thread.currentThread().getName()));
      System.out.println("Main Thread: " + Thread.currentThread().getName());
    } finally {
      if (executor != null) {
        executor.shutdown();
      }
    }
    // end::code[]
  }
  
}
