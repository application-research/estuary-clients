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
 * ApiDeleteContentFromCollectionBody
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-12-18T07:30:24.245Z[GMT]")
public class ApiDeleteContentFromCollectionBody {
  @SerializedName("by")
  private String by = null;

  @SerializedName("value")
  private String value = null;

  public ApiDeleteContentFromCollectionBody by(String by) {
    this.by = by;
    return this;
  }

   /**
   * Get by
   * @return by
  **/
  @Schema(description = "")
  public String getBy() {
    return by;
  }

  public void setBy(String by) {
    this.by = by;
  }

  public ApiDeleteContentFromCollectionBody value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @Schema(description = "")
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
    ApiDeleteContentFromCollectionBody apiDeleteContentFromCollectionBody = (ApiDeleteContentFromCollectionBody) o;
    return Objects.equals(this.by, apiDeleteContentFromCollectionBody.by) &&
        Objects.equals(this.value, apiDeleteContentFromCollectionBody.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(by, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiDeleteContentFromCollectionBody {\n");
    
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
