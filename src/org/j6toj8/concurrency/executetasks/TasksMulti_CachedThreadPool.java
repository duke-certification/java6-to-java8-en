package org.j6toj8.concurrency.executetasks;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TasksMulti_CachedThreadPool {

  public static void main(String[] args) {
    // tag::code[]
    ExecutorService executor = null;
    try {
      executor = Executors.newCachedThreadPool(); // thread cached executor
      executor.execute(() -> System.out.println("Task 1 - Executor Thread: " + Thread.currentThread().getName()));
      executor.execute(() -> System.out.println("Task 2 - Executor Thread: " + Thread.currentThread().getName()));
      executor.execute(() -> System.out.println("Task 3 - Executor Thread: " + Thread.currentThread().getName()));
      executor.execute(() -> System.out.println("Task 4 - Executor Thread: " + Thread.currentThread().getName()));
      executor.execute(() -> System.out.println("Task 5 - Executor Thread: " + Thread.currentThread().getName()));
    } finally {
      if (executor != null) {
        executor.shutdown();
      }
    }
    // end::code[]
  }
  
}
