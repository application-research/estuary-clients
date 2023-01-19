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
import io.swagger.client.model.AddressAddress;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * ApiPublicNodeInfo
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-01-19T16:29:58.195Z[GMT]")
public class ApiPublicNodeInfo {
  @SerializedName("primaryAddress")
  private AddressAddress primaryAddress = null;

  public ApiPublicNodeInfo primaryAddress(AddressAddress primaryAddress) {
    this.primaryAddress = primaryAddress;
    return this;
  }

   /**
   * Get primaryAddress
   * @return primaryAddress
  **/
  @Schema(description = "")
  public AddressAddress getPrimaryAddress() {
    return primaryAddress;
  }

  public void setPrimaryAddress(AddressAddress primaryAddress) {
    this.primaryAddress = primaryAddress;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiPublicNodeInfo apiPublicNodeInfo = (ApiPublicNodeInfo) o;
    return Objects.equals(this.primaryAddress, apiPublicNodeInfo.primaryAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(primaryAddress);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiPublicNodeInfo {\n");
    
    sb.append("    primaryAddress: ").append(toIndentedString(primaryAddress)).append("\n");
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
