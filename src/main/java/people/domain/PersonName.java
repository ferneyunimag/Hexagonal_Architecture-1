package people.domain;

import people.domain.exception.PersonNameNotBeNullOrEmptyException;
import shared.domain.StringValueObject;

public class PersonName extends StringValueObject {
    //private static final long serialVersionUID = -6453948818555461280L;


  // tirm  elimina espacio en blanco o al final del string  asi conocer la longitud real del string    || value.tirm().isEmpty()
    public PersonName(String value){
     super(value);
        if (value == null) {
            throw new PersonNameNotBeNullOrEmptyException();
        }

    }




}
