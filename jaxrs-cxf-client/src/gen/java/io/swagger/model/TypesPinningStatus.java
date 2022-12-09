package io.swagger.model;



/**
 * Gets or Sets types.PinningStatus
 */
public enum TypesPinningStatus {
  PINNING("pinning"),
  
  PINNED("pinned"),
  
  FAILED("failed"),
  
  QUEUED("queued");

  private String value;

  TypesPinningStatus(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TypesPinningStatus fromValue(String text) {
    for (TypesPinningStatus b : TypesPinningStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  
}
