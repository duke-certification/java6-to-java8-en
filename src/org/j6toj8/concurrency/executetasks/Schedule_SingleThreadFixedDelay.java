package org.j6toj8.concurrency.executetasks;

import java.time.LocalTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Schedule_SingleThreadFixedDelay {

  // tag::code[]
  public static void main(String[] args) {
    ScheduledExecutorService executor = null;
    try {
      executor = Executors.newSingleThreadScheduledExecutor(); // single thread scheduler
      System.out.println("Before Scheduling: " + LocalTime.now()); // print the current time
      executor.scheduleWithFixedDelay(() -> System.out.println("Execution: " + LocalTime.now()), 3, 1, TimeUnit.SECONDS);
      System.out.println("After Scheduling: " + LocalTime.now()); // print the current time
      sleep(); // waits a while to be able to see the executions
      System.out.println("After 10 seconds sleep: " + LocalTime.now()); // print the current time
    } finally {
      if (executor != null) {
        System.out.println("Invoking shutdown on executor.");
        executor.shutdown();
      }
    }
  }

  private static void sleep() {
    try {
      Thread.sleep(10000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
  // end::code[]
  
}
