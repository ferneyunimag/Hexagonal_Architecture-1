package shared.domain.exception;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.io.Serializable;

/**
 * Transfer error class
 */
@AllArgsConstructor
@Builder
@Getter
public class DataError implements Serializable {
  private static final long serialVersionUID = 2217464300361072425L;

  private final String status = "ERROR";
  private final String error;
  private final String description;
  private final String code;
}
