package shared.domain;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class IntegerValueObject {
    protected final Integer value;
    /**
     * Constructor
     *
     * @param value The value
     */
    public IntegerValueObject(Integer value){this.value=value;}

    /**
     * Get the value
     *
     * @return The value
     */
    public Integer value(){return value;}
}
