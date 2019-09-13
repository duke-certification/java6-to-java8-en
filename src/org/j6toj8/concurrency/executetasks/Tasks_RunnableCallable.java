package org.j6toj8.concurrency.executetasks;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Tasks_RunnableCallable {

  public static void main(String[] args) {
    // tag::code[]
    ExecutorService executor = null;
    try {
      executor = Executors.newSingleThreadExecutor();

      // task without return, instance of Runnable
      executor.submit(() -> System.out.println("Runnable"));

      // task with return, instance of Callable
      executor.submit(() -> "Callable");

      // task that throws an Exception must be Callable, then needs to return
      executor.submit(() -> {Thread.sleep(1); return "Callable";});

      // task that throws an Exception, but declares no return
      // NOT COMPILING as it is interpreted as Runnable
      executor.submit(() -> Thread.sleep(1));
      
    } finally {
      if (executor != null) {
        executor.shutdown();
      }
    }
    // end::code[]
  }

}
