package org.j6toj8.languageenhancements.staticdefaultininterfaces;

import java.io.IOException;

public class StaticDefaultInInterfaces_Default {

  // tag::code[]
  interface Runner {
    default String run() {
      return "Running";
    }
  }
  
  static class Person implements Runner {
    
  }
  
  static class Horse implements Runner {
    @Override
    public String run() {
      return "Galloping";
    }
    
    public static void main(String[] args) throws IOException {
      System.out.println(new Person().run());
      System.out.println(new Horse().run());
    }
  }
  // end::code[]
}
