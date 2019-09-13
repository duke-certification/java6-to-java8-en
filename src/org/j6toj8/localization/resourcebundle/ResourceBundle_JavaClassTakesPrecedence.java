package org.j6toj8.localization.resourcebundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundle_JavaClassTakesPrecedence {

  public static void main(String[] args) {

    // tag::code[]
    /*
     * Retrieves the bundle from the file "Text_fr_CA.java",
     * as it takes precedence over the file "Text_fr_CA.properties"
     */
    ResourceBundle bundle = ResourceBundle.getBundle("Text", new Locale("fr", "CA")); 
    System.out.println(bundle.getString("pen"));
    System.out.println(bundle.getString("glass"));
    System.out.println(bundle.getString("keyboard"));
    // end::code[]

  }
}
