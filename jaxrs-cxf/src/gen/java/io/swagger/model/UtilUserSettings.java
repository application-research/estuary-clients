package io.swagger.model;

import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;

import io.swagger.v3.oas.annotations.media.Schema;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonCreator;

public class UtilUserSettings   {
  
  @Schema(description = "")
  private Boolean contentAddingDisabled = null;
  
  @Schema(description = "")
  private Integer dealDuration = null;
  
  @Schema(description = "")
  private Boolean dealMakingDisabled = null;
  
  @Schema(description = "")
  private Integer fileStagingThreshold = null;
  
  @Schema(description = "")
  private Integer flags = null;
  
  @Schema(description = "")
  private Integer replication = null;
  
  @Schema(description = "")
  private List<String> uploadEndpoints = null;
  
  @Schema(description = "")
  private Boolean verified = null;
 /**
   * Get contentAddingDisabled
   * @return contentAddingDisabled
  **/
  @JsonProperty("contentAddingDisabled")
  public Boolean isContentAddingDisabled() {
    return contentAddingDisabled;
  }

  public void setContentAddingDisabled(Boolean contentAddingDisabled) {
    this.contentAddingDisabled = contentAddingDisabled;
  }

  public UtilUserSettings contentAddingDisabled(Boolean contentAddingDisabled) {
    this.contentAddingDisabled = contentAddingDisabled;
    return this;
  }

 /**
   * Get dealDuration
   * @return dealDuration
  **/
  @JsonProperty("dealDuration")
  public Integer getDealDuration() {
    return dealDuration;
  }

  public void setDealDuration(Integer dealDuration) {
    this.dealDuration = dealDuration;
  }

  public UtilUserSettings dealDuration(Integer dealDuration) {
    this.dealDuration = dealDuration;
    return this;
  }

 /**
   * Get dealMakingDisabled
   * @return dealMakingDisabled
  **/
  @JsonProperty("dealMakingDisabled")
  public Boolean isDealMakingDisabled() {
    return dealMakingDisabled;
  }

  public void setDealMakingDisabled(Boolean dealMakingDisabled) {
    this.dealMakingDisabled = dealMakingDisabled;
  }

  public UtilUserSettings dealMakingDisabled(Boolean dealMakingDisabled) {
    this.dealMakingDisabled = dealMakingDisabled;
    return this;
  }

 /**
   * Get fileStagingThreshold
   * @return fileStagingThreshold
  **/
  @JsonProperty("fileStagingThreshold")
  public Integer getFileStagingThreshold() {
    return fileStagingThreshold;
  }

  public void setFileStagingThreshold(Integer fileStagingThreshold) {
    this.fileStagingThreshold = fileStagingThreshold;
  }

  public UtilUserSettings fileStagingThreshold(Integer fileStagingThreshold) {
    this.fileStagingThreshold = fileStagingThreshold;
    return this;
  }

 /**
   * Get flags
   * @return flags
  **/
  @JsonProperty("flags")
  public Integer getFlags() {
    return flags;
  }

  public void setFlags(Integer flags) {
    this.flags = flags;
  }

  public UtilUserSettings flags(Integer flags) {
    this.flags = flags;
    return this;
  }

 /**
   * Get replication
   * @return replication
  **/
  @JsonProperty("replication")
  public Integer getReplication() {
    return replication;
  }

  public void setReplication(Integer replication) {
    this.replication = replication;
  }

  public UtilUserSettings replication(Integer replication) {
    this.replication = replication;
    return this;
  }

 /**
   * Get uploadEndpoints
   * @return uploadEndpoints
  **/
  @JsonProperty("uploadEndpoints")
  public List<String> getUploadEndpoints() {
    return uploadEndpoints;
  }

  public void setUploadEndpoints(List<String> uploadEndpoints) {
    this.uploadEndpoints = uploadEndpoints;
  }

  public UtilUserSettings uploadEndpoints(List<String> uploadEndpoints) {
    this.uploadEndpoints = uploadEndpoints;
    return this;
  }

  public UtilUserSettings addUploadEndpointsItem(String uploadEndpointsItem) {
    this.uploadEndpoints.add(uploadEndpointsItem);
    return this;
  }

 /**
   * Get verified
   * @return verified
  **/
  @JsonProperty("verified")
  public Boolean isVerified() {
    return verified;
  }

  public void setVerified(Boolean verified) {
    this.verified = verified;
  }

  public UtilUserSettings verified(Boolean verified) {
    this.verified = verified;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
