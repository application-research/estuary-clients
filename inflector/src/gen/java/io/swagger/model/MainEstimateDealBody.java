package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaInflectorServerCodegen", date = "2022-11-07T20:05:41.507Z")
public class MainEstimateDealBody   {
  @JsonProperty("durationBlks")
  private Integer durationBlks = null;

  @JsonProperty("replication")
  private Integer replication = null;

  @JsonProperty("size")
  private Integer size = null;

  @JsonProperty("verified")
  private Boolean verified = null;

  /**
   **/
  public MainEstimateDealBody durationBlks(Integer durationBlks) {
    this.durationBlks = durationBlks;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("durationBlks")
  public Integer getDurationBlks() {
    return durationBlks;
  }
  public void setDurationBlks(Integer durationBlks) {
    this.durationBlks = durationBlks;
  }

  /**
   **/
  public MainEstimateDealBody replication(Integer replication) {
    this.replication = replication;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("replication")
  public Integer getReplication() {
    return replication;
  }
  public void setReplication(Integer replication) {
    this.replication = replication;
  }

  /**
   **/
  public MainEstimateDealBody size(Integer size) {
    this.size = size;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("size")
  public Integer getSize() {
    return size;
  }
  public void setSize(Integer size) {
    this.size = size;
  }

  /**
   **/
  public MainEstimateDealBody verified(Boolean verified) {
    this.verified = verified;
    return this;
  }

  
  @ApiModelProperty(value = "")
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
    MainEstimateDealBody mainEstimateDealBody = (MainEstimateDealBody) o;
    return Objects.equals(durationBlks, mainEstimateDealBody.durationBlks) &&
        Objects.equals(replication, mainEstimateDealBody.replication) &&
        Objects.equals(size, mainEstimateDealBody.size) &&
        Objects.equals(verified, mainEstimateDealBody.verified);
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

