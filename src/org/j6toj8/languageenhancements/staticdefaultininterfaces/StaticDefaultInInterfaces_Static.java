package org.j6toj8.languageenhancements.staticdefaultininterfaces;

import java.io.IOException;

public class StaticDefaultInInterfaces_Static {

  // tag::code[]
  interface Runner {
    static double calculateSpeed(int distance, int time) {
      return distance / time;
    }
  }
  
  static class Person implements Runner {
    public static void main(String[] args) throws IOException {
      System.out.println(Runner.calculateSpeed(100, 50)); // COMPILES - static method of an interface being called as if it were from a common class
      System.out.println(Person.calculateSpeed(100, 50)); // NOT COMPILING - the static method is not inherited or implemented by the Person class.
    }
  }
  // end::code[]
}
