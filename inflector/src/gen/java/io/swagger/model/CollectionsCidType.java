package io.swagger.model;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;


import com.fasterxml.jackson.annotation.JsonCreator;

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
