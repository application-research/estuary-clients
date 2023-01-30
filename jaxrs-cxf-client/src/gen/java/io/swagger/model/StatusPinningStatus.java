package io.swagger.model;



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
  public String toString() {
    return String.valueOf(value);
  }

  public static StatusPinningStatus fromValue(String text) {
    for (StatusPinningStatus b : StatusPinningStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  
}
