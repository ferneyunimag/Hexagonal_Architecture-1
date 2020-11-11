package people.domain.exception;

import shared.domain.exception.DataException;

public class PersonNameNotBeNullOrEmptyException extends DataException {


    /**
     * Constructor
     */


    public PersonNameNotBeNullOrEmptyException() {
        super("PersonNameNotBeNullOrEmpty", "The person name should not be null or empty", "1000");
    }



}
