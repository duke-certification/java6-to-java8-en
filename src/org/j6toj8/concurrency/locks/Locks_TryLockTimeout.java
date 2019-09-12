package org.j6toj8.concurrency.locks;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Locks_TryLockTimeout {

  public static void main(String[] args) {
    // tag::code[]
    Lock lock = new ReentrantLock();
    
    boolean hasLock = false;
    try {
      // try to lock for a maximum of 1 second
      hasLock = lock.tryLock(1, TimeUnit.SECONDS);
    } catch (InterruptedException e) {
      System.out.println("Didn't get the lock");
    }
    
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
