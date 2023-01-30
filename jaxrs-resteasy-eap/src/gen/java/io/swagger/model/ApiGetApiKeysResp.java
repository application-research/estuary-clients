package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyEapServerCodegen", date = "2023-01-30T18:30:34.034Z[GMT]")public class ApiGetApiKeysResp   {
  private String expiry = null;
  private Boolean isSession = null;
  private String label = null;
  private String token = null;
  private String tokenHash = null;

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("expiry")
  public String getExpiry() {
    return expiry;
  }
  public void setExpiry(String expiry) {
    this.expiry = expiry;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("isSession")
  public Boolean isIsSession() {
    return isSession;
  }
  public void setIsSession(Boolean isSession) {
    this.isSession = isSession;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("label")
  public String getLabel() {
    return label;
  }
  public void setLabel(String label) {
    this.label = label;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("token")
  public String getToken() {
    return token;
  }
  public void setToken(String token) {
    this.token = token;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("tokenHash")
  public String getTokenHash() {
    return tokenHash;
  }
  public void setTokenHash(String tokenHash) {
    this.tokenHash = tokenHash;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiGetApiKeysResp apiGetApiKeysResp = (ApiGetApiKeysResp) o;
    return Objects.equals(expiry, apiGetApiKeysResp.expiry) &&
        Objects.equals(isSession, apiGetApiKeysResp.isSession) &&
        Objects.equals(label, apiGetApiKeysResp.label) &&
        Objects.equals(token, apiGetApiKeysResp.token) &&
        Objects.equals(tokenHash, apiGetApiKeysResp.tokenHash);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expiry, isSession, label, token, tokenHash);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiGetApiKeysResp {\n");
    
    sb.append("    expiry: ").append(toIndentedString(expiry)).append("\n");
    sb.append("    isSession: ").append(toIndentedString(isSession)).append("\n");
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
