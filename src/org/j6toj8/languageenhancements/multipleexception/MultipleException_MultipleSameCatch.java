package org.j6toj8.languageenhancements.multipleexception;

import java.util.ConcurrentModificationException;

public class MultipleException_MultipleSameCatch {

  // tag::code[]
  public static void main(String[] args) {
    
    try {
        throw new NullPointerException();
    } catch (NullPointerException | IllegalArgumentException e) { // COMPILES - multiple exceptions in the same catch, only one variable at the end
        System.out.println("Exception caught: " + e);
    } catch (IllegalStateException ise | UnsupportedOperationException uoe) { // NOT COMPILING - more than one declared variable
        System.out.println("Exception caught: " + ise);
    } catch (ClassCastException cce | ConcurrentModificationException) { // NOT COMPILING - just one variable but in the wrong place
        System.out.println("Exception caught: " + cce);
    }
  }
  // end::code[]
  
}
