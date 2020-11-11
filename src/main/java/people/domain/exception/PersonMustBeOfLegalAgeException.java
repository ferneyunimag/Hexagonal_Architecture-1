package people.domain.exception;

import shared.domain.exception.DataException;

public class PersonMustBeOfLegalAgeException extends DataException {

    public PersonMustBeOfLegalAgeException(){

        super("PersonMustBeOfLegalAgeException","this person isn't legal age yet","1002");

    }




}
