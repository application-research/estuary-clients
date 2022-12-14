package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets types.PinningStatus
 */
public enum TypesPinningStatus {
  PINNING("pinning"),
    PINNED("pinned"),
    FAILED("failed"),
    QUEUED("queued"),
    OFFLOADED("offloaded");

  private String value;

  TypesPinningStatus(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static TypesPinningStatus fromValue(String text) {
    for (TypesPinningStatus b : TypesPinningStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
