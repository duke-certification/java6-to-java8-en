package org.j6toj8.concurrency.executetasks;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Tasks_SingleThreadFuture {

  public static void main(String[] args) {
    // tag::code[]
    ExecutorService executor = null;
    try {
      executor = Executors.newSingleThreadExecutor();
      Future<?> task = executor.submit(() -> System.out.println("Task running"));

      // check if the task is finished
      System.out.println("Task already completed? " + task.isDone());

      // try to cancel the task
      System.out.println("Trying to cancel the task. Got it? " + task.cancel(true));

      // check if the task has been canceled
      System.out.println("Task was canceled? " + task.isCancelled());
    } finally {
      if (executor != null) {
        executor.shutdown();
      }
    }
    // end::code[]
  }
  
}
