package shared.domain.exception;

import lombok.Getter;

/**
 * Global transfer exception
 */
@Getter

public class DataException extends RuntimeException {
    private final DataError error;

    /**
     * Constructor 1
     *
     * @param title       the title
     * @param description the description
     * @param code        the error code
     */
    public DataException(String title, String description, String code) {
        this.error = new DataError(title, description, code);
    }


}
