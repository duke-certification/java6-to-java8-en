package org.j6toj8.localization.locale;

import java.io.IOException;
import java.util.Locale;

public class Locale_LocaleAvailable {

  // tag::code[]
  public static void main(String[] args) throws IOException {
    Locale[] availableLocales = Locale.getAvailableLocales();
    // prints the first 10 available locales
    for (int i = 0; i < 10; i++) {
      System.out.println(availableLocales[i]);
    }
  }
  // end::code[]
}
