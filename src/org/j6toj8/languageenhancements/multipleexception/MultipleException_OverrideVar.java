package org.j6toj8.languageenhancements.multipleexception;

public class MultipleException_OverrideVar {

  // tag::code[]
  public static void main(String[] args) {
    
    try {
        throw new NullPointerException();
    } catch (NullPointerException | IllegalArgumentException e) {
        e = new IllegalStateException(); // NOT COMPILING - variable cannot be overwritten when multi-catching
    } catch (Exception e) {
        e = new IllegalStateException(); // COMPILES - it is still possible to overwrite the variable when it is not a multi-catch
    }
  }
  // end::code[]
  
}
