package org.j6toj8.languageenhancements.staticdefaultininterfaces;

public class StaticDefaultInInterfaces_InterfaceInheritance {

  // tag::code[]
  interface Runner {
    default String run() {
      return "Running";
    }
    default String runFast() {
      return "Running Fast";
    }
    default String runSlow() {
      return "Running Slow";
    }
  }
  
  interface Pilot extends Runner {
    String runFast();
    
    default String runSlow() {
      return "Pilot Running Slow";
    }
  }
  // end::code[]
}
