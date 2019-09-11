package org.j6toj8.languageenhancements.staticdefaultininterfaces;

public class StaticDefaultInInterfaces_RepeatedDefaultSuper {

  // tag::code[]
  interface Runner {
    default String run() {
      return "Running";
    }
  }
  
  interface Pilot {
    default String run() {
      return "Pilot Running";
    }
  }
  
  static class Person implements Runner, Pilot { // COMPILES - keep the Runner implementation in the run() method
    @Override
    public String run() {
      return Runner.super.run();
    }
    
    public static void main(String[] args) {
      System.out.println(new Person().run());
    }
  }
  // end::code[]
}
