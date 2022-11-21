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
import io.swagger.client.model.TypesIpfsPin;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * TypesIpfsPinStatusResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-11-21T16:22:16.042Z[GMT]")
public class TypesIpfsPinStatusResponse {
  @SerializedName("created")
  private String created = null;

  @SerializedName("delegates")
  private List<String> delegates = null;

  @SerializedName("info")
  private Object info = null;

  @SerializedName("pin")
  private TypesIpfsPin pin = null;

  @SerializedName("requestid")
  private String requestid = null;

  @SerializedName("status")
  private String status = null;

  public TypesIpfsPinStatusResponse created(String created) {
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  @Schema(description = "")
  public String getCreated() {
    return created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  public TypesIpfsPinStatusResponse delegates(List<String> delegates) {
    this.delegates = delegates;
    return this;
  }

  public TypesIpfsPinStatusResponse addDelegatesItem(String delegatesItem) {
    if (this.delegates == null) {
      this.delegates = new ArrayList<String>();
    }
    this.delegates.add(delegatesItem);
    return this;
  }

   /**
   * Get delegates
   * @return delegates
  **/
  @Schema(description = "")
  public List<String> getDelegates() {
    return delegates;
  }

  public void setDelegates(List<String> delegates) {
    this.delegates = delegates;
  }

  public TypesIpfsPinStatusResponse info(Object info) {
    this.info = info;
    return this;
  }

   /**
   * Get info
   * @return info
  **/
  @Schema(description = "")
  public Object getInfo() {
    return info;
  }

  public void setInfo(Object info) {
    this.info = info;
  }

  public TypesIpfsPinStatusResponse pin(TypesIpfsPin pin) {
    this.pin = pin;
    return this;
  }

   /**
   * Get pin
   * @return pin
  **/
  @Schema(description = "")
  public TypesIpfsPin getPin() {
    return pin;
  }

  public void setPin(TypesIpfsPin pin) {
    this.pin = pin;
  }

  public TypesIpfsPinStatusResponse requestid(String requestid) {
    this.requestid = requestid;
    return this;
  }

   /**
   * Get requestid
   * @return requestid
  **/
  @Schema(description = "")
  public String getRequestid() {
    return requestid;
  }

  public void setRequestid(String requestid) {
    this.requestid = requestid;
  }

  public TypesIpfsPinStatusResponse status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TypesIpfsPinStatusResponse typesIpfsPinStatusResponse = (TypesIpfsPinStatusResponse) o;
    return Objects.equals(this.created, typesIpfsPinStatusResponse.created) &&
        Objects.equals(this.delegates, typesIpfsPinStatusResponse.delegates) &&
        Objects.equals(this.info, typesIpfsPinStatusResponse.info) &&
        Objects.equals(this.pin, typesIpfsPinStatusResponse.pin) &&
        Objects.equals(this.requestid, typesIpfsPinStatusResponse.requestid) &&
        Objects.equals(this.status, typesIpfsPinStatusResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(created, delegates, info, pin, requestid, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TypesIpfsPinStatusResponse {\n");
    
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    delegates: ").append(toIndentedString(delegates)).append("\n");
    sb.append("    info: ").append(toIndentedString(info)).append("\n");
    sb.append("    pin: ").append(toIndentedString(pin)).append("\n");
    sb.append("    requestid: ").append(toIndentedString(requestid)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
