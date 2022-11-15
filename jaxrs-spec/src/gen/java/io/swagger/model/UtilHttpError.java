package io.swagger.model;

import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class UtilHttpError   {

  private @Valid Integer code = null;

  private @Valid String details = null;

  private @Valid String reason = null;

  /**
   **/
  public UtilHttpError code(Integer code) {
    this.code = code;
    return this;
  }

  
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
  public UtilHttpError details(String details) {
    this.details = details;
    return this;
  }

  
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
  public UtilHttpError reason(String reason) {
    this.reason = reason;
    return this;
  }

  
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
