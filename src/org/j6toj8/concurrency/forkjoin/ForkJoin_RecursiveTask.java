package org.j6toj8.concurrency.forkjoin;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;

public class ForkJoin_RecursiveTask {

  // tag::code[]
  // Class that represents the task that will be performed
  static class StringPrinter extends RecursiveTask<Integer> {

    private String stringToPrint;

    public StringPrinter(String stringToPrint) {
      this.stringToPrint = stringToPrint;
    }

    @Override
    protected Integer compute() {
      if (stringToPrint.length() < 10) {
        // if String is less than 10 characters, will print
        System.out.println(Thread.currentThread().getName() + " - " + stringToPrint);

        // return the amount of characters printed
        return stringToPrint.length();
      } else {
        // otherwise, two new tasks are created, one with the first half of String and one with the second half of String
        List<StringPrinter> newTasks = divideInTwoTasks();
        StringPrinter task1 = newTasks.get(0);
        StringPrinter task2 = newTasks.get(1);

        // 'fork' will send task1 to run on a new thread
        ForkJoinTask<Integer> firstTask = task1.fork();

        // 'compute' will execute task2 on this same thread
        Integer taskResult2 = task2.compute();

        // 'join' will get the result of task1 that was running on another thread
        Integer taskResult1 = firstTask.join();

        // return the sum of the results because it is the number of characters printed
        return taskResult2 + taskResult1;
      }
    }

    private List<StringPrinter> divideInTwoTasks() {
      // this method splits the string into two parts and creates two new tasks
      // each task gets a part of the String

      int stringSize = stringToPrint.length();
      int stringMiddle = stringSize / 2;

      String firstHalf = stringToPrint.substring(0, stringMiddle);
      String secondHalf = stringToPrint.substring(stringMiddle);

      List<StringPrinter> actions = new ArrayList<StringPrinter>();
      actions.add(new StringPrinter(firstHalf));
      actions.add(new StringPrinter(secondHalf));
      return actions;
    }
    
  }
  
  public static void main(String[] args) {
    // string we want to print
    String stringToPrint= "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    // main task to be performed
    StringPrinter task = new StringPrinter(stringToPrint);

    // ForkJoinPool creation and task execution
    ForkJoinPool forkJoinPool = new ForkJoinPool();
    Integer result = forkJoinPool.invoke(task);
    System.out.println("Execution result: " + result);

  }
  // end::code[]
  
}
