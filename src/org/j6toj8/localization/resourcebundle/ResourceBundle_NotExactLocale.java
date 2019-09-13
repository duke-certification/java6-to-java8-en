package org.j6toj8.localization.resourcebundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundle_NotExactLocale {

  public static void main(String[] args) {

    // tag::code[]
    Locale.setDefault(new Locale("pt", "BR")); // pt_BR as default Locale
    ResourceBundle bundle2 = ResourceBundle.getBundle("Text", new Locale("zh", "CN"));
    System.out.println(bundle2.getLocale()); // Bundle located for Locale "zh_CN" (Simplified Chinese)
    ResourceBundle bundle = ResourceBundle.getBundle("Text", new Locale("it", "CH"));
    System.out.println(bundle.getLocale()); // Bundle located for Locale "it_CH" (Italian from Switzerland)
    // end::code[]

  }
}
