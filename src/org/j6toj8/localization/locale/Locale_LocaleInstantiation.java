package org.j6toj8.localization.locale;

import java.io.IOException;
import java.util.Locale;

public class Locale_LocaleInstantiation {

  // tag::code[]
  public static void main(String[] args) throws IOException {
    new Locale("pt", "BR"); // pt-BR with constructor
    
    Locale.forLanguageTag("pt-BR"); // pt-BR with LanguageTag
    
    Locale localePtBR = new Locale.Builder() // pt-BR with Builder
      .setLanguage("pt")
      .setRegion("BR")
      .build();
  }
  // end::code[]
}
