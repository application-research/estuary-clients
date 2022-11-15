package io.swagger.model;


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

public class MainEstimateDealBody   {
  
  @Schema(description = "")
  private Integer durationBlks = null;
  
  @Schema(description = "")
  private Integer replication = null;
  
  @Schema(description = "")
  private Integer size = null;
  
  @Schema(description = "")
  private Boolean verified = null;
 /**
   * Get durationBlks
   * @return durationBlks
  **/
  @JsonProperty("durationBlks")
  public Integer getDurationBlks() {
    return durationBlks;
  }

  public void setDurationBlks(Integer durationBlks) {
    this.durationBlks = durationBlks;
  }

  public MainEstimateDealBody durationBlks(Integer durationBlks) {
    this.durationBlks = durationBlks;
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

  public MainEstimateDealBody replication(Integer replication) {
    this.replication = replication;
    return this;
  }

 /**
   * Get size
   * @return size
  **/
  @JsonProperty("size")
  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  public MainEstimateDealBody size(Integer size) {
    this.size = size;
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

  public MainEstimateDealBody verified(Boolean verified) {
    this.verified = verified;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
