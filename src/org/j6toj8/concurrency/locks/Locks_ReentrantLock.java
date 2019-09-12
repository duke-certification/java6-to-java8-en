package org.j6toj8.concurrency.locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Locks_ReentrantLock {

  public static void main(String[] args) {
    // tag::code[]
    Lock lock = new ReentrantLock();
    try {
      lock.lock(); // only one thread gets lock at a time
      System.out.println("ABC");
    } finally {
      lock.unlock(); // undo the lock
    }
    // end::code[]
  }
  
}
