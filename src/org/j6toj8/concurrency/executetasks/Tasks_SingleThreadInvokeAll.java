package org.j6toj8.concurrency.executetasks;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Tasks_SingleThreadInvokeAll {

  public static void main(String[] args) {
    // tag::code[]
    List<Callable<String>> tasks = new ArrayList<Callable<String>>();
    tasks.add(() -> "Task 1 performed on thread" + Thread.currentThread().getName());
    tasks.add(() -> "Task 2 performed on thread" + Thread.currentThread().getName());
    tasks.add(() -> "Task 3 performed on thread" + Thread.currentThread().getName());
    
    ExecutorService executor = null;
    try {
      executor = Executors.newSingleThreadExecutor();

      // invokeAll returns all returns of tasks performed in a list
      List<Future<String>> returnList = executor.invokeAll(tasks);
      
      for (Future<String> futureReturn : returnList) {
        System.out.println("Task Return: " + futureReturn.get());
      }
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
