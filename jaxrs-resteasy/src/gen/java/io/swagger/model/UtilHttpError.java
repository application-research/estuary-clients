package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2022-11-07T20:06:01.579Z")
public class UtilHttpError   {
  
  private Integer code = null;
  private String details = null;
  private String reason = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("code")
  public Integer getCode() {
    return code;
  }
  public void setCode(Integer code) {
    this.code = code;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("details")
  public String getDetails() {
    return details;
  }
  public void setDetails(String details) {
    this.details = details;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("reason")
  public String getReason() {
    return reason;
  }
  public void setReason(String reason) {
    this.reason = reason;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UtilHttpError utilHttpError = (UtilHttpError) o;
    return Objects.equals(code, utilHttpError.code) &&
        Objects.equals(details, utilHttpError.details) &&
        Objects.equals(reason, utilHttpError.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, details, reason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UtilHttpError {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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

