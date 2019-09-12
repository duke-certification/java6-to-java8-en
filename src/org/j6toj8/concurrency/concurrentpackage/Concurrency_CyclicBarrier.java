package org.j6toj8.concurrency.concurrentpackage;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Concurrency_CyclicBarrier {

  // tag::code[]
  // Class that will be executed by 3 threads
  static class Action implements Runnable {

    CyclicBarrier cyclicBarrier;

    public Action(CyclicBarrier cyclicBarrier) {
      this.cyclicBarrier = cyclicBarrier;
    }

    @Override
    public void run() {
      System.out.println(Thread.currentThread().getName() + ": First Part");
      
      try {
        cyclicBarrier.await(); // thread synchronization
      } catch (InterruptedException | BrokenBarrierException e) {
        e.printStackTrace();
      }
      
      System.out.println(Thread.currentThread().getName() + ": Second Part");
      
      try {
        cyclicBarrier.await(); // thread synchronization
      } catch (InterruptedException | BrokenBarrierException e) {
        e.printStackTrace();
      }
      
      System.out.println(Thread.currentThread().getName() + ": Third Part");
    }
  }  
  
  public static void main(String[] args) {
    // Creating a CyclicBarrier for 3 threads
    CyclicBarrier cyclicBarrier = new CyclicBarrier(3);
    
    // Thread Creation
    Thread thread1 = new Thread(new Action(cyclicBarrier));
    Thread thread2 = new Thread(new Action(cyclicBarrier));
    Thread thread3 = new Thread(new Action(cyclicBarrier));
    
    // Threads start running
    thread1.start();
    thread2.start();
    thread3.start();
  }
  // end::code[]

}
