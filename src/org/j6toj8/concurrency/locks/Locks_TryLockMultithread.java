package org.j6toj8.concurrency.locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Locks_TryLockMultithread {

  // tag::code[]
  static class Action implements Runnable {

    private Lock lock;

    public Action(Lock reentrantLock) {
      this.lock = reentrantLock;
    }

    @Override
    public void run() {
      if (lock.tryLock()) {
        try {
          System.out.println(Thread.currentThread().getName() + ": Got the Lock");
        } finally {
          lock.unlock();
        }
      }
    }
  }  
  
  public static void main(String[] args) {
    Lock lock = new ReentrantLock();

    // Thread creation
    Thread thread1 = new Thread(new Action(lock));
    Thread thread2 = new Thread(new Action(lock));
    Thread thread3 = new Thread(new Action(lock));

    // Thread creation
    thread1.start();
    thread2.start();
    thread3.start();    
  }
  // end::code[]
  
}
