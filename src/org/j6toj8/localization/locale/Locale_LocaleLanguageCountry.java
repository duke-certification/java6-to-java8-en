package org.j6toj8.localization.locale;

import java.io.IOException;
import java.util.Locale;

public class Locale_LocaleLanguageCountry {

  public static void main(String[] args) throws IOException {
    // tag::code[]
    new Locale("pt", "BR"); // Brazilian Portuguese
    new Locale("en", "US"); // US English
    new Locale("it", "CH"); // Italian from Switzerland
    new Locale("fr", "BE"); // French from Belgium
    // end::code[]
  }
}
