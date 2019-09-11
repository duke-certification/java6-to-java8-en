package org.j6toj8.languageenhancements.staticdefaultininterfaces;

public class StaticDefaultInInterfaces_RepeatedDefault {

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
  
  static class Person implements Runner, Pilot { // NOT COMPILING - implements two interfaces with repeated methods and does not overwrite
    
  }
  
  static class Giant implements Runner, Pilot { // COMPILES - implements two interfaces with repeated methods, but overwrites and creates its own implementation
    @Override
    public String run() {
      return "Giant Running";
    }
  }
  // end::code[]
}
