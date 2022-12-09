package io.swagger.model;



/**
 * Gets or Sets util.ContentType
 */
public enum UtilContentType {
  NUMBER_0(0),
  
  NUMBER_1(1),
  
  NUMBER_2(2);

  private Integer value;

  UtilContentType(Integer value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static UtilContentType fromValue(String text) {
    for (UtilContentType b : UtilContentType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  
}
