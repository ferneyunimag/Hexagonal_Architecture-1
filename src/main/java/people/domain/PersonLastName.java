package people.domain;

import people.domain.exception.PersonLastNameNotBeNullOrEmptyException;

import shared.domain.StringValueObject;

public class PersonLastName extends StringValueObject {
    //private static final long serialVersionUID = -6453948818555461281L;  //  changed last number from 0 to 1, is only a prevention.
    public PersonLastName (String value){
        super(value);

        if (value == null) {
            throw new PersonLastNameNotBeNullOrEmptyException();
        }

    }
}
