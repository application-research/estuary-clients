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
import java.util.ArrayList;
import java.util.List;
/**
 * TypesIpfsPin
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-01-13T19:43:15.077Z[GMT]")
public class TypesIpfsPin {
  @SerializedName("cid")
  private String cid = null;

  @SerializedName("meta")
  private Object meta = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("origins")
  private List<String> origins = null;

  public TypesIpfsPin cid(String cid) {
    this.cid = cid;
    return this;
  }

   /**
   * Get cid
   * @return cid
  **/
  @Schema(description = "")
  public String getCid() {
    return cid;
  }

  public void setCid(String cid) {
    this.cid = cid;
  }

  public TypesIpfsPin meta(Object meta) {
    this.meta = meta;
    return this;
  }

   /**
   * Get meta
   * @return meta
  **/
  @Schema(description = "")
  public Object getMeta() {
    return meta;
  }

  public void setMeta(Object meta) {
    this.meta = meta;
  }

  public TypesIpfsPin name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TypesIpfsPin origins(List<String> origins) {
    this.origins = origins;
    return this;
  }

  public TypesIpfsPin addOriginsItem(String originsItem) {
    if (this.origins == null) {
      this.origins = new ArrayList<String>();
    }
    this.origins.add(originsItem);
    return this;
  }

   /**
   * Get origins
   * @return origins
  **/
  @Schema(description = "")
  public List<String> getOrigins() {
    return origins;
  }

  public void setOrigins(List<String> origins) {
    this.origins = origins;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TypesIpfsPin typesIpfsPin = (TypesIpfsPin) o;
    return Objects.equals(this.cid, typesIpfsPin.cid) &&
        Objects.equals(this.meta, typesIpfsPin.meta) &&
        Objects.equals(this.name, typesIpfsPin.name) &&
        Objects.equals(this.origins, typesIpfsPin.origins);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cid, meta, name, origins);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TypesIpfsPin {\n");
    
    sb.append("    cid: ").append(toIndentedString(cid)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    origins: ").append(toIndentedString(origins)).append("\n");
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
