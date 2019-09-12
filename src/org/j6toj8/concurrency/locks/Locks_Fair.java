package org.j6toj8.concurrency.locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Locks_Fair {

  public static void main(String[] args) {
    // tag::code[]
    Lock lock = new ReentrantLock(true); // "fair" lock
    try {
      lock.lock();
      System.out.println("ABC");
    } finally {
      lock.unlock(); // undo the lock
    }
    // end::code[]
  }
  
}
