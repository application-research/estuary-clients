package io.swagger.model;

import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets collections.CidType
 */
public enum CollectionsCidType {
  DIRECTORY("directory"),
  
  FILE("file");

  private String value;

  CollectionsCidType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static CollectionsCidType fromValue(String text) {
    for (CollectionsCidType b : CollectionsCidType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  
}
