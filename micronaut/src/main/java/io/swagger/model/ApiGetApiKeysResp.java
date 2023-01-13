package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import io.micronaut.validation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ApiGetApiKeysResp
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.MicronautCodegen", date = "2023-01-13T19:43:16.363Z[GMT]")
public class ApiGetApiKeysResp   {
  @JsonProperty("expiry")
  private String expiry = null;

  @JsonProperty("label")
  private String label = null;

  @JsonProperty("token")
  private String token = null;

  @JsonProperty("tokenHash")
  private String tokenHash = null;

  public ApiGetApiKeysResp expiry(String expiry) {
    this.expiry = expiry;
    return this;
  }

  /**
   * Get expiry
   * @return expiry
  **/
  @Schema(description = "")

  public String getExpiry() {
    return expiry;
  }

  public void setExpiry(String expiry) {
    this.expiry = expiry;
  }

  public ApiGetApiKeysResp label(String label) {
    this.label = label;
    return this;
  }

  /**
   * Get label
   * @return label
  **/
  @Schema(description = "")

  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public ApiGetApiKeysResp token(String token) {
    this.token = token;
    return this;
  }

  /**
   * Get token
   * @return token
  **/
  @Schema(description = "")

  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public ApiGetApiKeysResp tokenHash(String tokenHash) {
    this.tokenHash = tokenHash;
    return this;
  }

  /**
   * Get tokenHash
   * @return tokenHash
  **/
  @Schema(description = "")

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
    ApiGetApiKeysResp apiGetApiKeysResp = (ApiGetApiKeysResp) o;
    return Objects.equals(this.expiry, apiGetApiKeysResp.expiry) &&
        Objects.equals(this.label, apiGetApiKeysResp.label) &&
        Objects.equals(this.token, apiGetApiKeysResp.token) &&
        Objects.equals(this.tokenHash, apiGetApiKeysResp.tokenHash);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expiry, label, token, tokenHash);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiGetApiKeysResp {\n");
    
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
