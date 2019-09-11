package org.j6toj8.languageenhancements.staticdefaultininterfaces;

import java.io.IOException;

public class StaticDefaultInInterfaces_Abstract {

  // tag::code[]
  interface Runner {
    default String run() { // COMPILES - default method is not abstract
      return "Running";
    }
    
    abstract default String runFast() { // NOT COMPILING - default method cannot be declared abstract
      return "Running fast";
    }
    
    String runSlow(); // COMPILES - common method, is abstract by default, even if implicitly

    abstract String runExtreme(); // COMPILES - common method, explicitly declared abstract
    
    abstract static double calculateSpeed(int d, int t) { // NOT COMPILING - static method cannot be declared abstract
      return d / t;
    }
  }
  // end::code[]
}
