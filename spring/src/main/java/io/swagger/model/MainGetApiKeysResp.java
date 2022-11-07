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
 * MainGetApiKeysResp
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-11-07T20:06:52.777Z")


public class MainGetApiKeysResp   {
  @JsonProperty("expiry")
  private String expiry = null;

  @JsonProperty("token")
  private String token = null;

  public MainGetApiKeysResp expiry(String expiry) {
    this.expiry = expiry;
    return this;
  }

  /**
   * Get expiry
   * @return expiry
  **/
  @ApiModelProperty(value = "")


  public String getExpiry() {
    return expiry;
  }

  public void setExpiry(String expiry) {
    this.expiry = expiry;
  }

  public MainGetApiKeysResp token(String token) {
    this.token = token;
    return this;
  }

  /**
   * Get token
   * @return token
  **/
  @ApiModelProperty(value = "")


  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MainGetApiKeysResp mainGetApiKeysResp = (MainGetApiKeysResp) o;
    return Objects.equals(this.expiry, mainGetApiKeysResp.expiry) &&
        Objects.equals(this.token, mainGetApiKeysResp.token);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expiry, token);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MainGetApiKeysResp {\n");
    
    sb.append("    expiry: ").append(toIndentedString(expiry)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
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

