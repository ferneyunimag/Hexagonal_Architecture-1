package people.domain;

import people.domain.exception.PersonMustBeOfLegalAgeException;
import shared.domain.IntegerValueObject;


public class PersonAge extends IntegerValueObject {

    public final Integer LEGALAGE=18;

  public PersonAge(Integer value){
      super(value);


      if(value<LEGALAGE){
          throw  new PersonMustBeOfLegalAgeException();

      }




  }

}
