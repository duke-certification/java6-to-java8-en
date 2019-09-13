package org.j6toj8.concurrency.executetasks;

import java.time.LocalTime;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class Schedule_SingleThreadCallable {

  public static void main(String[] args) {
    // tag::code[]
    ScheduledExecutorService executor = null;
    try {
      executor = Executors.newSingleThreadScheduledExecutor(); // single thread scheduler
      System.out.println("Before Scheduling: " + LocalTime.now());
      ScheduledFuture<String> futureReturn = executor.schedule(() -> "Execution: " + LocalTime.now(), 3, TimeUnit.SECONDS);
      System.out.println("After Scheduling: " + LocalTime.now());
      
      System.out.println(futureReturn.get()); // stands here waiting for the return
      System.out.println("After execution: " + LocalTime.now());
    } catch (InterruptedException | ExecutionException e) {
      System.out.println("Error doing .get()");
    } finally {
      if (executor != null) {
        executor.shutdown();
      }
    }
    // end::code[]
  }
  
}
