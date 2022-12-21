package io.swagger.model;

import io.swagger.model.AddressAddress;
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

public class ApiStorageProviderResp   {
  
  @Schema(description = "")
  private AddressAddress addr = null;
  
  @Schema(description = "")
  private String name = null;
  
  @Schema(description = "")
  private Boolean suspended = null;
  
  @Schema(description = "")
  private String suspendedReason = null;
  
  @Schema(description = "")
  private String version = null;
 /**
   * Get addr
   * @return addr
  **/
  @JsonProperty("addr")
  public AddressAddress getAddr() {
    return addr;
  }

  public void setAddr(AddressAddress addr) {
    this.addr = addr;
  }

  public ApiStorageProviderResp addr(AddressAddress addr) {
    this.addr = addr;
    return this;
  }

 /**
   * Get name
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ApiStorageProviderResp name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get suspended
   * @return suspended
  **/
  @JsonProperty("suspended")
  public Boolean isSuspended() {
    return suspended;
  }

  public void setSuspended(Boolean suspended) {
    this.suspended = suspended;
  }

  public ApiStorageProviderResp suspended(Boolean suspended) {
    this.suspended = suspended;
    return this;
  }

 /**
   * Get suspendedReason
   * @return suspendedReason
  **/
  @JsonProperty("suspendedReason")
  public String getSuspendedReason() {
    return suspendedReason;
  }

  public void setSuspendedReason(String suspendedReason) {
    this.suspendedReason = suspendedReason;
  }

  public ApiStorageProviderResp suspendedReason(String suspendedReason) {
    this.suspendedReason = suspendedReason;
    return this;
  }

 /**
   * Get version
   * @return version
  **/
  @JsonProperty("version")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public ApiStorageProviderResp version(String version) {
    this.version = version;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiStorageProviderResp {\n");
    
    sb.append("    addr: ").append(toIndentedString(addr)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    suspended: ").append(toIndentedString(suspended)).append("\n");
    sb.append("    suspendedReason: ").append(toIndentedString(suspendedReason)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
