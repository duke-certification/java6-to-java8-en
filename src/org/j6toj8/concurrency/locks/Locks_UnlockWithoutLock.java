package org.j6toj8.concurrency.locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Locks_UnlockWithoutLock {

  public static void main(String[] args) {
    // tag::code[]
    Lock lock = new ReentrantLock();
    try {
      System.out.println("ABC");
    } finally {
      lock.unlock(); // throws exception as there is no lock
    }
    // end::code[]
  }
  
}
