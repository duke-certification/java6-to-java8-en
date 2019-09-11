package org.j6toj8.languageenhancements.trywithresources;

import java.io.FileNotFoundException;

public class TryWithResouces_WithCatchFinally {
  
  // tag::code[]
  static class Door implements AutoCloseable {
    @Override
    public void close() throws Exception { // called automatically by try-with-resources
      System.out.println("Closed door.");
      throw new Exception(); // throws Exception
    }
  }
  
  public static void main(String[] args) throws FileNotFoundException {
    try (Door door = new Door()) { // Door instantiated within try-with-resources statement
      System.out.println("try");
    } catch (Exception e) {
      System.out.println("catch");
    } finally {
      System.out.println("finally");
    }
  }
  // end::code[]
}
