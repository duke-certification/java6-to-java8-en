package org.j6toj8.languageenhancements.staticdefaultininterfaces;

import java.io.IOException;

public class StaticDefaultInInterfaces_Complete {

  // tag::code[]
  interface Runner {
    static double calculateSpeed(int distance, int time) {
      return distance / time;
    }
    
    default String run() {
      return "Running";
    }
    
    String runFast();
  }
  
  static class Person implements Runner {
    @Override
    public String runFast() {
      return "Fast Running Person";
    }
    
    public static void main(String[] args) throws IOException {
      System.out.println(Runner.calculateSpeed(100, 10));
      System.out.println(new Person().run());
      System.out.println(new Person().runFast());
    }
  }
  // end::code[]
}
