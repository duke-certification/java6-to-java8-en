package org.j6toj8.languageenhancements.trywithresources;

public class TryWithResouces_Order {
  
  // tag::code[]
  static class Door implements AutoCloseable {
    @Override
    public void close() { // chamado automaticamente pelo try-with-resources
      System.out.println("Closed door.");
    }
  }
  
  static class Drawer implements AutoCloseable {
    @Override
    public void close() { // chamado automaticamente pelo try-with-resources
      System.out.println("Drawer closed.");
    }
  }

  public static void main(String[] args) {
    try (Door door = new Door();
      Drawer drawer = new Drawer()) {
      System.out.println("Hello.");
    }
  }
  // end::code[]
}
