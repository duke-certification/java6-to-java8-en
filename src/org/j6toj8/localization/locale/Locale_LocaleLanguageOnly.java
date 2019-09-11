package org.j6toj8.localization.locale;

import java.io.IOException;
import java.util.Locale;

public class Locale_LocaleLanguageOnly {

  // tag::code[]
  public static void main(String[] args) throws IOException {
    System.out.println(new Locale("pt")); // portuguese
    System.out.println(new Locale("en")); // english
    System.out.println(new Locale("es")); // spanish
    System.out.println(new Locale("fr")); // french
  }
  // end::code[]
}
