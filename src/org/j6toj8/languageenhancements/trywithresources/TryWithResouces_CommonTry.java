package org.j6toj8.languageenhancements.trywithresources;

public class TryWithResouces_CommonTry {
  
  // tag::code[]
  public static void main(String[] args) {
    try {
      System.out.println("try");
    } // NOT COMPILING - "common" try without catch or finally
    
    try {
      System.out.println("try");
    } catch (Exception e) {
    } // COMPILES - "common" try with catch only
    
    try {
      System.out.println("try");
    } finally {
    } // COMPILES - "common" try with finally only
    
    try {
      System.out.println("try");
    } catch (Exception e) {
    } finally {
    } // COMPILES - "common" try with catch and finally
  }
  // end::code[]
}
