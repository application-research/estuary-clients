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
import io.swagger.client.model.CidCid;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * UtilDbCID
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-12-14T06:22:37.307Z[GMT]")
public class UtilDbCID {
  @SerializedName("cid")
  private CidCid cid = null;

  public UtilDbCID cid(CidCid cid) {
    this.cid = cid;
    return this;
  }

   /**
   * Get cid
   * @return cid
  **/
  @Schema(description = "")
  public CidCid getCid() {
    return cid;
  }

  public void setCid(CidCid cid) {
    this.cid = cid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UtilDbCID utilDbCID = (UtilDbCID) o;
    return Objects.equals(this.cid, utilDbCID.cid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UtilDbCID {\n");
    
    sb.append("    cid: ").append(toIndentedString(cid)).append("\n");
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
