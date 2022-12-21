/*
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

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * ApiGetApiKeysResp
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-12-21T01:22:08.628Z[GMT]")
public class ApiGetApiKeysResp {
  @SerializedName("expiry")
  private String expiry = null;

  @SerializedName("label")
  private String label = null;

  @SerializedName("token")
  private String token = null;

  @SerializedName("tokenHash")
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
