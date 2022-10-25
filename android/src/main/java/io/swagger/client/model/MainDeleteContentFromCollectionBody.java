/**
 * Estuary API
 * This is the API for the Estuary application.
 *
 * OpenAPI spec version: 0.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class MainDeleteContentFromCollectionBody {
  
  @SerializedName("by")
  private String by = null;
  @SerializedName("value")
  private String value = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getBy() {
    return by;
  }
  public void setBy(String by) {
    this.by = by;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MainDeleteContentFromCollectionBody mainDeleteContentFromCollectionBody = (MainDeleteContentFromCollectionBody) o;
    return (this.by == null ? mainDeleteContentFromCollectionBody.by == null : this.by.equals(mainDeleteContentFromCollectionBody.by)) &&
        (this.value == null ? mainDeleteContentFromCollectionBody.value == null : this.value.equals(mainDeleteContentFromCollectionBody.value));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.by == null ? 0: this.by.hashCode());
    result = 31 * result + (this.value == null ? 0: this.value.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class MainDeleteContentFromCollectionBody {\n");
    
    sb.append("  by: ").append(by).append("\n");
    sb.append("  value: ").append(value).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
