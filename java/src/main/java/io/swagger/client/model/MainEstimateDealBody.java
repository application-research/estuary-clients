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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * MainEstimateDealBody
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-11-08T00:36:35.475Z")
public class MainEstimateDealBody {
  @SerializedName("durationBlks")
  private Integer durationBlks = null;

  @SerializedName("replication")
  private Integer replication = null;

  @SerializedName("size")
  private Integer size = null;

  @SerializedName("verified")
  private Boolean verified = null;

  public MainEstimateDealBody durationBlks(Integer durationBlks) {
    this.durationBlks = durationBlks;
    return this;
  }

   /**
   * Get durationBlks
   * @return durationBlks
  **/
  @ApiModelProperty(value = "")
  public Integer getDurationBlks() {
    return durationBlks;
  }

  public void setDurationBlks(Integer durationBlks) {
    this.durationBlks = durationBlks;
  }

  public MainEstimateDealBody replication(Integer replication) {
    this.replication = replication;
    return this;
  }

   /**
   * Get replication
   * @return replication
  **/
  @ApiModelProperty(value = "")
  public Integer getReplication() {
    return replication;
  }

  public void setReplication(Integer replication) {
    this.replication = replication;
  }

  public MainEstimateDealBody size(Integer size) {
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @ApiModelProperty(value = "")
  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  public MainEstimateDealBody verified(Boolean verified) {
    this.verified = verified;
    return this;
  }

   /**
   * Get verified
   * @return verified
  **/
  @ApiModelProperty(value = "")
  public Boolean isVerified() {
    return verified;
  }

  public void setVerified(Boolean verified) {
    this.verified = verified;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MainEstimateDealBody mainEstimateDealBody = (MainEstimateDealBody) o;
    return Objects.equals(this.durationBlks, mainEstimateDealBody.durationBlks) &&
        Objects.equals(this.replication, mainEstimateDealBody.replication) &&
        Objects.equals(this.size, mainEstimateDealBody.size) &&
        Objects.equals(this.verified, mainEstimateDealBody.verified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(durationBlks, replication, size, verified);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MainEstimateDealBody {\n");
    
    sb.append("    durationBlks: ").append(toIndentedString(durationBlks)).append("\n");
    sb.append("    replication: ").append(toIndentedString(replication)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    verified: ").append(toIndentedString(verified)).append("\n");
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

