package org.j6toj8.languageenhancements.trywithresources;

public class TryWithResouces_CloseException {
  
  // tag::code[]
  static class Door implements AutoCloseable {
    @Override
    public void close() throws Exception { // must declare throws Exception
      throw new Exception();
    }
  }
  
  void try1() {
    try (Door door = new Door()) { // NOT COMPILING - the exception of close() is not captured or declared
      System.out.println("Hello 1");
    }
  }
  
  void try2() {
    try (Door door = new Door()) {
      System.out.println("Hello 2");
    } catch (Exception e) { // COMPILES - exception caught
    }
  }
  
  void try3() throws Exception { // COMPILES - exception declared in the method
    try (Door door = new Door()) {
      System.out.println("Hello 3");
    }
  }
  // end::code[]
}
