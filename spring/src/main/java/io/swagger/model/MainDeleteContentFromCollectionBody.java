package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * MainDeleteContentFromCollectionBody
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-11-07T20:06:52.777Z")


public class MainDeleteContentFromCollectionBody   {
  @JsonProperty("by")
  private String by = null;

  @JsonProperty("value")
  private String value = null;

  public MainDeleteContentFromCollectionBody by(String by) {
    this.by = by;
    return this;
  }

  /**
   * Get by
   * @return by
  **/
  @ApiModelProperty(value = "")


  public String getBy() {
    return by;
  }

  public void setBy(String by) {
    this.by = by;
  }

  public MainDeleteContentFromCollectionBody value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
  **/
  @ApiModelProperty(value = "")


  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MainDeleteContentFromCollectionBody mainDeleteContentFromCollectionBody = (MainDeleteContentFromCollectionBody) o;
    return Objects.equals(this.by, mainDeleteContentFromCollectionBody.by) &&
        Objects.equals(this.value, mainDeleteContentFromCollectionBody.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(by, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MainDeleteContentFromCollectionBody {\n");
    
    sb.append("    by: ").append(toIndentedString(by)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

