package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import io.micronaut.validation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets status.PinningStatus
 */
public enum StatusPinningStatus {
  PINNING("pinning"),
    PINNED("pinned"),
    FAILED("failed"),
    QUEUED("queued"),
    OFFLOADED("offloaded");

  private String value;

  StatusPinningStatus(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static StatusPinningStatus fromValue(String text) {
    for (StatusPinningStatus b : StatusPinningStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
