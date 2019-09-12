package org.j6toj8.lambda.methodreference;

import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReference_CustomType {

  // tag::code[]
  static class SuperHero {
    private Person person;

    public SuperHero(Person person) {
      this.person = person;
    }
    
    public static SuperHero createSuperHero(Person person) {
      return new SuperHero(person);
    }
  }
  
  static class Person {
    
    public SuperHero becomeSuperHero() {
      return new SuperHero(this);
    }
  }
  
  public static void main(String[] args) {
    // equivalent lambda expressions using static method call
    Function<Person, SuperHero> static1 = p -> SuperHero.createSuperHero(p);
    Function<Person, SuperHero> static2 = SuperHero::createSuperHero;

    // equivalent lambda expressions using constructor
    Function<Person, SuperHero> construtor1 = p -> new SuperHero(p);
    Function<Person, SuperHero> construtor2 = SuperHero::new;

    // equivalent lambda expressions using common method call, but referencing class method
    Function<Person, SuperHero> classe1 = p -> p.becomeSuperHero();
    Function<Person, SuperHero> classe2 = Person::becomeSuperHero;

    // equivalent lambda expressions using common method call, but referencing object method
    Person person = new Person();
    Supplier<SuperHero> instancia1 = () -> person.becomeSuperHero();
    Supplier<SuperHero> instancia2 = person::becomeSuperHero;
  }
  // end::code[]
  
}
