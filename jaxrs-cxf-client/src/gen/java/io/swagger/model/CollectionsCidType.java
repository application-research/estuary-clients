package io.swagger.model;



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
  public String toString() {
    return String.valueOf(value);
  }

  public static CollectionsCidType fromValue(String text) {
    for (CollectionsCidType b : CollectionsCidType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  
}
