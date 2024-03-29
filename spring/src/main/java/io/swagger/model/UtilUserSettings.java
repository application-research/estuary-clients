package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UtilUserSettings
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-02-02T18:38:36.904Z[GMT]")


public class UtilUserSettings   {
  @JsonProperty("contentAddingDisabled")
  private Boolean contentAddingDisabled = null;

  @JsonProperty("dealDuration")
  private Integer dealDuration = null;

  @JsonProperty("dealMakingDisabled")
  private Boolean dealMakingDisabled = null;

  @JsonProperty("fileStagingThreshold")
  private Integer fileStagingThreshold = null;

  @JsonProperty("flags")
  private Integer flags = null;

  @JsonProperty("replication")
  private Integer replication = null;

  @JsonProperty("uploadEndpoints")
  @Valid
  private List<String> uploadEndpoints = null;

  @JsonProperty("verified")
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
