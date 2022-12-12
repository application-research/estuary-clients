package io.swagger.model;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;



@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaInflectorServerCodegen", date = "2022-12-12T11:11:32.823Z[GMT]")
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
  private List<String> uploadEndpoints = null;
  @JsonProperty("verified")
  private Boolean verified = null;
  /**
   **/
  public UtilUserSettings contentAddingDisabled(Boolean contentAddingDisabled) {
    this.contentAddingDisabled = contentAddingDisabled;
    return this;
  }

  
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
  public UtilUserSettings dealDuration(Integer dealDuration) {
    this.dealDuration = dealDuration;
    return this;
  }

  
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
  public UtilUserSettings dealMakingDisabled(Boolean dealMakingDisabled) {
    this.dealMakingDisabled = dealMakingDisabled;
    return this;
  }

  
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
  public UtilUserSettings fileStagingThreshold(Integer fileStagingThreshold) {
    this.fileStagingThreshold = fileStagingThreshold;
    return this;
  }

  
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
  public UtilUserSettings flags(Integer flags) {
    this.flags = flags;
    return this;
  }

  
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
  public UtilUserSettings replication(Integer replication) {
    this.replication = replication;
    return this;
  }

  
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
  public UtilUserSettings uploadEndpoints(List<String> uploadEndpoints) {
    this.uploadEndpoints = uploadEndpoints;
    return this;
  }

  
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
  public UtilUserSettings verified(Boolean verified) {
    this.verified = verified;
    return this;
  }

  
  @Schema(description = "")
  @JsonProperty("verified")
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
