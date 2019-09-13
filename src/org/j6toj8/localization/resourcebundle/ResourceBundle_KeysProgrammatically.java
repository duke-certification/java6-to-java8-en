package org.j6toj8.localization.resourcebundle;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Set;

public class ResourceBundle_KeysProgrammatically {

  // tag::code[]
  public static void main(String[] args) {

    Locale.setDefault(new Locale("en", "US")); // Set Locale en_US as default
    
    ResourceBundle bundle = ResourceBundle.getBundle("Text", new Locale("pt", "BR")); // Retrieve 'Text' bundle for Locale pt_BR
    Set<String> keySet = bundle.keySet(); // Get a set with all the keys
    for (String key : keySet) {
      System.out.println(key + " - " + bundle.getString(key)); // Print "<key> - <value>"
    }

  }
  // end::code[]
}
