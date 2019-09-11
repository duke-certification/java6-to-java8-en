package org.j6toj8.languageenhancements.trywithresources;

public class TryWithResouces_ResourceInsideTry {
  
  // tag::code[]
  static class Door implements AutoCloseable {
    @Override
    public void close() { // called automatically by try-with-resources
      System.out.println("Closed door.");
    }
  }
  
  public static void main(String[] args) {
    try (Door door = new Door()) {
      door.toString();
    } catch (Exception e) {
      door.toString(); // NOT COMPILING - door variable only available within try block
    } finally {
      door.toString(); // NOT COMPILING - door variable only available within try block
    }
  }
  // end::code[]
}
