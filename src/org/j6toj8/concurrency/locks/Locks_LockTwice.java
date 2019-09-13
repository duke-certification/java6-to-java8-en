package org.j6toj8.concurrency.locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Locks_LockTwice {

  public static void main(String[] args) {
    // tag::code[]
    Lock lock = new ReentrantLock();
    try {
      lock.lock();
      lock.lock();
      System.out.println("ABC");
    } finally {
      lock.unlock(); // undo the first lock
      lock.unlock(); // undo the second lock
    }
    // end::code[]
  }
  
}
