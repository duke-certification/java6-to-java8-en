package org.j6toj8.concurrency.forkjoin;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveAction;

public class ForkJoin_RecursiveAction {

  // tag::code[]
  // Class that represents the task that will be performed
  static class StringPrinterAction extends RecursiveAction {

    private String stringToPrint;

    public StringPrinterAction(String stringToPrint) {
      this.stringToPrint = stringToPrint;
    }

    @Override
    protected void compute() {
      if (stringToPrint.length() < 10) {
        // if String is less than 10 characters, will print
        System.out.println(Thread.currentThread().getName() + " - " + stringToPrint);
      } else {
        // otherwise, two new tasks are created, one with the first half of String and one with the second half of String
        List<StringPrinterAction> newTasks = divideInTwoTasks();

        // Invoke execution of two created tasks
        ForkJoinTask.invokeAll(newTasks);
      }
    }

    private List<StringPrinterAction> divideInTwoTasks() {
      // this method splits the string into two parts and creates two new tasks
      // each task gets a part of the String
      
      int stringSize = stringToPrint.length();
      int stringMiddle = stringSize / 2;
      
      String firstHalf = stringToPrint.substring(0, stringMiddle);
      String secondHalf = stringToPrint.substring(stringMiddle);
      
      List<StringPrinterAction> actions = new ArrayList<StringPrinterAction>();
      actions.add(new StringPrinterAction(firstHalf));
      actions.add(new StringPrinterAction(secondHalf));
      return actions;
    }
    
  }
  
  public static void main(String[] args) {
    // string we want to print
    String stringToPrint= "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    // main task to be performed
    StringPrinterAction task = new StringPrinterAction(stringToPrint);

    // ForkJoinPool creation and task execution
    ForkJoinPool forkJoinPool = new ForkJoinPool();
    forkJoinPool.invoke(task);
  }
  // end::code[]
  
}
