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
 * UtilUserSettings
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-01-04T12:55:51.421Z[GMT]")
public class UtilUserSettings {
  @SerializedName("contentAddingDisabled")
  private Boolean contentAddingDisabled = null;

  @SerializedName("dealDuration")
  private Integer dealDuration = null;

  @SerializedName("dealMakingDisabled")
  private Boolean dealMakingDisabled = null;

  @SerializedName("fileStagingThreshold")
  private Integer fileStagingThreshold = null;

  @SerializedName("flags")
  private Integer flags = null;

  @SerializedName("replication")
  private Integer replication = null;

  @SerializedName("uploadEndpoints")
  private List<String> uploadEndpoints = null;

  @SerializedName("verified")
  private Boolean verified = null;

  public UtilUserSettings contentAddingDisabled(Boolean contentAddingDisabled) {
    this.contentAddingDisabled = contentAddingDisabled;
    return this;
  }

   /**
   * Get contentAddingDisabled
   * @return contentAddingDisabled
  **/
  @Schema(description = "")
  public Boolean isContentAddingDisabled() {
    return contentAddingDisabled;
  }

  public void setContentAddingDisabled(Boolean contentAddingDisabled) {
    this.contentAddingDisabled = contentAddingDisabled;
  }

  public UtilUserSettings dealDuration(Integer dealDuration) {
    this.dealDuration = dealDuration;
    return this;
  }

   /**
   * Get dealDuration
   * @return dealDuration
  **/
  @Schema(description = "")
  public Integer getDealDuration() {
    return dealDuration;
  }

  public void setDealDuration(Integer dealDuration) {
    this.dealDuration = dealDuration;
  }

  public UtilUserSettings dealMakingDisabled(Boolean dealMakingDisabled) {
    this.dealMakingDisabled = dealMakingDisabled;
    return this;
  }

   /**
   * Get dealMakingDisabled
   * @return dealMakingDisabled
  **/
  @Schema(description = "")
  public Boolean isDealMakingDisabled() {
    return dealMakingDisabled;
  }

  public void setDealMakingDisabled(Boolean dealMakingDisabled) {
    this.dealMakingDisabled = dealMakingDisabled;
  }

  public UtilUserSettings fileStagingThreshold(Integer fileStagingThreshold) {
    this.fileStagingThreshold = fileStagingThreshold;
    return this;
  }

   /**
   * Get fileStagingThreshold
   * @return fileStagingThreshold
  **/
  @Schema(description = "")
  public Integer getFileStagingThreshold() {
    return fileStagingThreshold;
  }

  public void setFileStagingThreshold(Integer fileStagingThreshold) {
    this.fileStagingThreshold = fileStagingThreshold;
  }

  public UtilUserSettings flags(Integer flags) {
    this.flags = flags;
    return this;
  }

   /**
   * Get flags
   * @return flags
  **/
  @Schema(description = "")
  public Integer getFlags() {
    return flags;
  }

  public void setFlags(Integer flags) {
    this.flags = flags;
  }

  public UtilUserSettings replication(Integer replication) {
    this.replication = replication;
    return this;
  }

   /**
   * Get replication
   * @return replication
  **/
  @Schema(description = "")
  public Integer getReplication() {
    return replication;
  }

  public void setReplication(Integer replication) {
    this.replication = replication;
  }

  public UtilUserSettings uploadEndpoints(List<String> uploadEndpoints) {
    this.uploadEndpoints = uploadEndpoints;
    return this;
  }

  public UtilUserSettings addUploadEndpointsItem(String uploadEndpointsItem) {
    if (this.uploadEndpoints == null) {
      this.uploadEndpoints = new ArrayList<String>();
    }
    this.uploadEndpoints.add(uploadEndpointsItem);
    return this;
  }

   /**
   * Get uploadEndpoints
   * @return uploadEndpoints
  **/
  @Schema(description = "")
  public List<String> getUploadEndpoints() {
    return uploadEndpoints;
  }

  public void setUploadEndpoints(List<String> uploadEndpoints) {
    this.uploadEndpoints = uploadEndpoints;
  }

  public UtilUserSettings verified(Boolean verified) {
    this.verified = verified;
    return this;
  }

   /**
   * Get verified
   * @return verified
  **/
  @Schema(description = "")
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
    UtilUserSettings utilUserSettings = (UtilUserSettings) o;
    return Objects.equals(this.contentAddingDisabled, utilUserSettings.contentAddingDisabled) &&
        Objects.equals(this.dealDuration, utilUserSettings.dealDuration) &&
        Objects.equals(this.dealMakingDisabled, utilUserSettings.dealMakingDisabled) &&
        Objects.equals(this.fileStagingThreshold, utilUserSettings.fileStagingThreshold) &&
        Objects.equals(this.flags, utilUserSettings.flags) &&
        Objects.equals(this.replication, utilUserSettings.replication) &&
        Objects.equals(this.uploadEndpoints, utilUserSettings.uploadEndpoints) &&
        Objects.equals(this.verified, utilUserSettings.verified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentAddingDisabled, dealDuration, dealMakingDisabled, fileStagingThreshold, flags, replication, uploadEndpoints, verified);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UtilUserSettings {\n");
    
    sb.append("    contentAddingDisabled: ").append(toIndentedString(contentAddingDisabled)).append("\n");
    sb.append("    dealDuration: ").append(toIndentedString(dealDuration)).append("\n");
    sb.append("    dealMakingDisabled: ").append(toIndentedString(dealMakingDisabled)).append("\n");
    sb.append("    fileStagingThreshold: ").append(toIndentedString(fileStagingThreshold)).append("\n");
    sb.append("    flags: ").append(toIndentedString(flags)).append("\n");
    sb.append("    replication: ").append(toIndentedString(replication)).append("\n");
    sb.append("    uploadEndpoints: ").append(toIndentedString(uploadEndpoints)).append("\n");
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
