package org.j6toj8.languageenhancements.multipleexception;

public class MultipleException_GenericsLower {

  // tag::code[]
  public static void main(String[] args) {
    
    try {
        throw new NullPointerException();
    } catch (Exception e) {
        System.out.println("Exception caught: " + e);
    } catch (NullPointerException | IllegalArgumentException e) { // NOT COMPILING - NullPointerException is more specific than Exception, so it should be caught before Exception
        System.out.println("Exception caught: " + e);
    } 
  }
  // end::code[]
  
}
