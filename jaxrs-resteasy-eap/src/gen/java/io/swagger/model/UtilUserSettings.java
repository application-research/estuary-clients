package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.List;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyEapServerCodegen", date = "2022-12-21T01:22:11.593Z[GMT]")public class UtilUserSettings   {
  private Boolean contentAddingDisabled = null;
  private Integer dealDuration = null;
  private Boolean dealMakingDisabled = null;
  private Integer fileStagingThreshold = null;
  private Integer flags = null;
  private Integer replication = null;
  private List<String> uploadEndpoints = new ArrayList<String>();
  private Boolean verified = null;

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("contentAddingDisabled")
  public Boolean isContentAddingDisabled() {
    return contentAddingDisabled;
  }
  public void setContentAddingDisabled(Boolean contentAddingDisabled) {
    this.contentAddingDisabled = contentAddingDisabled;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("dealDuration")
  public Integer getDealDuration() {
    return dealDuration;
  }
  public void setDealDuration(Integer dealDuration) {
    this.dealDuration = dealDuration;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("dealMakingDisabled")
  public Boolean isDealMakingDisabled() {
    return dealMakingDisabled;
  }
  public void setDealMakingDisabled(Boolean dealMakingDisabled) {
    this.dealMakingDisabled = dealMakingDisabled;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("fileStagingThreshold")
  public Integer getFileStagingThreshold() {
    return fileStagingThreshold;
  }
  public void setFileStagingThreshold(Integer fileStagingThreshold) {
    this.fileStagingThreshold = fileStagingThreshold;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("flags")
  public Integer getFlags() {
    return flags;
  }
  public void setFlags(Integer flags) {
    this.flags = flags;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("replication")
  public Integer getReplication() {
    return replication;
  }
  public void setReplication(Integer replication) {
    this.replication = replication;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("uploadEndpoints")
  public List<String> getUploadEndpoints() {
    return uploadEndpoints;
  }
  public void setUploadEndpoints(List<String> uploadEndpoints) {
    this.uploadEndpoints = uploadEndpoints;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("verified")
  public Boolean isVerified() {
    return verified;
  }
  public void setVerified(Boolean verified) {
    this.verified = verified;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UtilUserSettings utilUserSettings = (UtilUserSettings) o;
    return Objects.equals(contentAddingDisabled, utilUserSettings.contentAddingDisabled) &&
        Objects.equals(dealDuration, utilUserSettings.dealDuration) &&
        Objects.equals(dealMakingDisabled, utilUserSettings.dealMakingDisabled) &&
        Objects.equals(fileStagingThreshold, utilUserSettings.fileStagingThreshold) &&
        Objects.equals(flags, utilUserSettings.flags) &&
        Objects.equals(replication, utilUserSettings.replication) &&
        Objects.equals(uploadEndpoints, utilUserSettings.uploadEndpoints) &&
        Objects.equals(verified, utilUserSettings.verified);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
