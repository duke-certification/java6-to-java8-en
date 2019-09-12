package org.j6toj8.concurrency.executetasks;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Tasks_ShutdownNow {

  public static void main(String[] args) {
    // tag::code[]
    ExecutorService executor = null;
    try {
      executor = Executors.newSingleThreadExecutor();
      executor.execute(() -> System.out.println("Executor Thread: " + Thread.currentThread().getName()));
      System.out.println("Main Thread: " + Thread.currentThread().getName());
    } finally {
      if (executor != null) {
        executor.shutdownNow(); // TRIES to shut down all threads immediately
      }
    }
    // end::code[]
  }
  
}
