package org.j6toj8.concurrency.locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Locks_ReadWriteLock {

  // tag::code[]
  static class Action implements Runnable {

    private ReadWriteLock lock;

    public Action(ReadWriteLock reentrantLock) {
      this.lock = reentrantLock;
    }

    @Override
    public void run() {
      Lock readLock = lock.readLock();
      if (readLock.tryLock()) {
        try {
          System.out.println(Thread.currentThread().getName() + ": Got the read Lock");
        } finally {
          readLock.unlock();
        }
      }
      
      Lock writeLock = lock.writeLock();
      if (writeLock.tryLock()) {
        try {
          System.out.println(Thread.currentThread().getName() + ": Got the write Lock");
        } finally {
          writeLock.unlock();
        }
      }
    }
  }  
  
  public static void main(String[] args) {
    ReadWriteLock lock = new ReentrantReadWriteLock();

    // Thread creation
    Thread thread1 = new Thread(new Action(lock));
    Thread thread2 = new Thread(new Action(lock));
    Thread thread3 = new Thread(new Action(lock));

    // Thread Execution
    thread1.start();
    thread2.start();
    thread3.start();    
  }
  // end::code[]
  
}
