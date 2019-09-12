package org.j6toj8.concurrency.executetasks;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Tasks_SingleThreadSubmit {

  public static void main(String[] args) {
    // tag::code[]
    ExecutorService executor = null;
    try {
      executor = Executors.newSingleThreadExecutor();
      Future<?> task = executor.submit(() -> System.out.println("Executor Thread: " + Thread.currentThread().getName()));

      System.out.println("Task already completed? " + task.isDone());
      System.out.println("Task already completed? " + task.isDone());
      System.out.println("Task already completed? " + task.isDone());
      System.out.println("Task already completed? " + task.isDone());
    } finally {
      if (executor != null) {
        executor.shutdown();
      }
    }
    // end::code[]
  }
  
}
