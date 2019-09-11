package org.j6toj8.languageenhancements.multipleexception;

import java.util.ConcurrentModificationException;

public class MultipleException_Redundant {

  // tag::code[]
  public static void main(String[] args) {
    
    try {
        throw new NullPointerException();
    } catch (RuntimeException | IllegalArgumentException e) { // NOT COMPILING - IllegalArgumentException inherits from RuntimeException, so would be redundant
        System.out.println("Exception caught: " + e);
    }
  }
  // end::code[]
  
}
