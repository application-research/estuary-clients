package io.swagger.model;

import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class MainGetApiKeysResp   {

  private @Valid String expiry = null;

  private @Valid String label = null;

  private @Valid String token = null;

  private @Valid String tokenHash = null;

  /**
   **/
  public MainGetApiKeysResp expiry(String expiry) {
    this.expiry = expiry;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("expiry")

  public String getExpiry() {
    return expiry;
  }
  public void setExpiry(String expiry) {
    this.expiry = expiry;
  }

  /**
   **/
  public MainGetApiKeysResp label(String label) {
    this.label = label;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("label")

  public String getLabel() {
    return label;
  }
  public void setLabel(String label) {
    this.label = label;
  }

  /**
   **/
  public MainGetApiKeysResp token(String token) {
    this.token = token;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("token")

  public String getToken() {
    return token;
  }
  public void setToken(String token) {
    this.token = token;
  }

  /**
   **/
  public MainGetApiKeysResp tokenHash(String tokenHash) {
    this.tokenHash = tokenHash;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("tokenHash")

  public String getTokenHash() {
    return tokenHash;
  }
  public void setTokenHash(String tokenHash) {
    this.tokenHash = tokenHash;
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
    return Objects.equals(expiry, mainGetApiKeysResp.expiry) &&
        Objects.equals(label, mainGetApiKeysResp.label) &&
        Objects.equals(token, mainGetApiKeysResp.token) &&
        Objects.equals(tokenHash, mainGetApiKeysResp.tokenHash);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expiry, label, token, tokenHash);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MainGetApiKeysResp {\n");
    
    sb.append("    expiry: ").append(toIndentedString(expiry)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    tokenHash: ").append(toIndentedString(tokenHash)).append("\n");
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
