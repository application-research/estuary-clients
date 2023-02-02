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
 * ApiClaimMsgResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-02T18:38:34.810Z[GMT]")
public class ApiClaimMsgResponse {
  @SerializedName("hexmsg")
  private String hexmsg = null;

  public ApiClaimMsgResponse hexmsg(String hexmsg) {
    this.hexmsg = hexmsg;
    return this;
  }

   /**
   * Get hexmsg
   * @return hexmsg
  **/
  @Schema(description = "")
  public String getHexmsg() {
    return hexmsg;
  }

  public void setHexmsg(String hexmsg) {
    this.hexmsg = hexmsg;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiClaimMsgResponse apiClaimMsgResponse = (ApiClaimMsgResponse) o;
    return Objects.equals(this.hexmsg, apiClaimMsgResponse.hexmsg);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hexmsg);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiClaimMsgResponse {\n");
    
    sb.append("    hexmsg: ").append(toIndentedString(hexmsg)).append("\n");
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
