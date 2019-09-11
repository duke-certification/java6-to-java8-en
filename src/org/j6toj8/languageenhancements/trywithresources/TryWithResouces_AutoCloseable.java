package org.j6toj8.languageenhancements.trywithresources;

import java.io.FileNotFoundException;

public class TryWithResouces_AutoCloseable {
  
  // tag::code[]
  static class Door implements AutoCloseable {
    @Override
    public void close() { // called automatically by try-with-resources
      System.out.println("Closed door.");
    }
  }
  
  public static void main(String[] args) throws FileNotFoundException {
    try (Door door = new Door()) { // Door instantiated within the try-with-resources statement
      System.out.println("try");
    }
  }
  // end::code[]
}
