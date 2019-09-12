package org.j6toj8.concurrency.executetasks;

import java.time.LocalTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class TasksMulti_ScheduledThreadPool {

  public static void main(String[] args) {
    // tag::code[]
    ScheduledExecutorService executor = null;
    try {
      executor = Executors.newScheduledThreadPool(2); // two thread scheduling executor
      System.out.println("Now: " + LocalTime.now()); // print the current time
      
      executor.schedule(() -> System.out.println("Execution 1: " + Thread.currentThread().getName() + " - " + LocalTime.now()), 3, TimeUnit.SECONDS);
      executor.schedule(() -> System.out.println("Execution 2: " + Thread.currentThread().getName() + " - " + LocalTime.now()), 3, TimeUnit.SECONDS);
      executor.schedule(() -> System.out.println("Execution 3: " + Thread.currentThread().getName() + " - " + LocalTime.now()), 3, TimeUnit.SECONDS);
      executor.schedule(() -> System.out.println("Execution 4: " + Thread.currentThread().getName() + " - " + LocalTime.now()), 3, TimeUnit.SECONDS);
      executor.schedule(() -> System.out.println("Execution 5: " + Thread.currentThread().getName() + " - " + LocalTime.now()), 3, TimeUnit.SECONDS);
    } finally {
      if (executor != null) {
        executor.shutdown();
      }
    }
    // end::code[]
  }
  
}
