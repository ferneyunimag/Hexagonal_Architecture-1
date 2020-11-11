package people.domain.exception;

import shared.domain.exception.DataException;

public class PersonLastNameNotBeNullOrEmptyException extends DataException {

    public PersonLastNameNotBeNullOrEmptyException() {
        super("PersonLastNameNotBeNullOrEmpty", "The person name should not be null or empty", "1001");
    }


}
