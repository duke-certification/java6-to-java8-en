package org.j6toj8.languageenhancements.multipleexception;

public class MultipleException_RepeatException {

  // tag::code[]
  public static void main(String[] args) {
    
    try {
        throw new NullPointerException();
    } catch (NullPointerException | IllegalArgumentException e) {
        System.out.println("Exception caught: " + e);
    } catch (IllegalStateException | NullPointerException e) { // NOT COMPILING - NullPointerException already caught in previous catch
        System.out.println("Exception caught: " + e);
    }
  }
  // end::code[]
}
