package org.j6toj8.languageenhancements.trywithresources;

public class TryWithResouces_NoAutoCloseable {
  
  // tag::code[]
  static class Shelf {}
  
  public static void main(String[] args) {
    try (Shelf shelf = new Shelf()) { // NOT COMPILING - Shelf do not implement AutoCloseable
      System.out.println("Hello");
    }
  }
  // end::code[]
}
