package org.j6toj8.concurrency.executetasks;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Tasks_SingleThreadCallable {

  public static void main(String[] args) {
    // tag::code[]
    ExecutorService executor = null;
    try {
      executor = Executors.newSingleThreadExecutor();
      Future<?> taskReturn = executor.submit(() -> "String to be returned");

      // The .get() below will wait for the task to finish to get its return
      System.out.println("Task Return: " + taskReturn.get());
    } catch (InterruptedException | ExecutionException e) {
      System.out.println("Execution stopped.");
    } finally {
      if (executor != null) {
        executor.shutdown();
      }
    }
    // end::code[]
  }

}
