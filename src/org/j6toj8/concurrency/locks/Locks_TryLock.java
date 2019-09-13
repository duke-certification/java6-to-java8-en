package org.j6toj8.concurrency.locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Locks_TryLock {

  public static void main(String[] args) {
    // tag::code[]
    Lock lock = new ReentrantLock();
    boolean hasLock = lock.tryLock();
    
    if (hasLock) {
      try {
        System.out.println("ABC");
      } finally {
        lock.unlock(); // undo the lock
      }
    } else {
      System.out.println("DEF");
    }
    // end::code[]
  }
  
}
