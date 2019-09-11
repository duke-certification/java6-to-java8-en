package org.j6toj8.languageenhancements.multipleexception;

import java.io.IOException;

public class MultipleException_CheckedException {

  // tag::code[]
  public static void main(String[] args) {
    
    try {
        throw new NullPointerException();
    } catch (NullPointerException | IOException e) { // NOT COMPILING - IOException is not thrown inside try block
        System.out.println("Exception caught: " + e);
    }
  }
  // end::code[]
}
