package org.j6toj8.languageenhancements.trywithresources;

public class TryWithResouces_Suppressed {
  
  // tag::code[]
  static class Door implements AutoCloseable {
    @Override
    public void close() {
      System.out.println("close");
      throw new RuntimeException("error on close"); // throws RuntimeException, but only after try
    }
  }
  
  public static void main(String[] args) {
    try (Door door = new Door()) {
      System.out.println("try");
      throw new RuntimeException("error on try"); // throws RuntimeException
    } catch (RuntimeException e) { // RuntimeException capture - which was captured?
      System.out.println(e.getMessage()); // display try exception message
      System.out.println(e.getSuppressed()[0].getMessage()); // displays the message of the suppressed exception, i.e., close
    }
  }
  // end::code[]
}
