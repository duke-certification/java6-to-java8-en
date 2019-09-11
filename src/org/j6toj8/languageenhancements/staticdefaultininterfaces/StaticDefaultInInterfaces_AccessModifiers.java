package org.j6toj8.languageenhancements.staticdefaultininterfaces;

import java.io.IOException;

public class StaticDefaultInInterfaces_AccessModifiers {

  // tag::code[]
  interface Runner {
    default String run() { // COMPILES - there is no declared access modifier, it is automatically public
      return "Running";
    }
    public default String runFast() { // COMPILES - explicit public access modifier
      return "Running fast";
    }
    protected default String runSlow() { // NOT COMPILING - the method must be public
      return "Running slow";
    }
    private default String runExtreme() { // NOT COMPILING - the method must be public
      return "Running to the extreme";
    }
    
    private static double calculateSpeed(int d, int t) { // NOT COMPILING - the method must be public
      return d / t;
    }
  }
  // end::code[]
}
