package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * MainEstimateDealBody
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-11-07T20:06:52.777Z")


public class MainEstimateDealBody   {
  @JsonProperty("durationBlks")
  private Integer durationBlks = null;

  @JsonProperty("replication")
  private Integer replication = null;

  @JsonProperty("size")
  private Integer size = null;

  @JsonProperty("verified")
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

