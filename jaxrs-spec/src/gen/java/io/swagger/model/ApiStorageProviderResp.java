package io.swagger.model;

import io.swagger.model.AddressAddress;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ApiStorageProviderResp   {

  private @Valid AddressAddress addr = null;

  private @Valid String name = null;

  private @Valid Boolean suspended = null;

  private @Valid String suspendedReason = null;

  private @Valid String version = null;

  /**
   **/
  public ApiStorageProviderResp addr(AddressAddress addr) {
    this.addr = addr;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("addr")

  public AddressAddress getAddr() {
    return addr;
  }
  public void setAddr(AddressAddress addr) {
    this.addr = addr;
  }

  /**
   **/
  public ApiStorageProviderResp name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("name")

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  public ApiStorageProviderResp suspended(Boolean suspended) {
    this.suspended = suspended;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("suspended")

  public Boolean isSuspended() {
    return suspended;
  }
  public void setSuspended(Boolean suspended) {
    this.suspended = suspended;
  }

  /**
   **/
  public ApiStorageProviderResp suspendedReason(String suspendedReason) {
    this.suspendedReason = suspendedReason;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("suspendedReason")

  public String getSuspendedReason() {
    return suspendedReason;
  }
  public void setSuspendedReason(String suspendedReason) {
    this.suspendedReason = suspendedReason;
  }

  /**
   **/
  public ApiStorageProviderResp version(String version) {
    this.version = version;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("version")

  public String getVersion() {
    return version;
  }
  public void setVersion(String version) {
    this.version = version;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiStorageProviderResp apiStorageProviderResp = (ApiStorageProviderResp) o;
    return Objects.equals(addr, apiStorageProviderResp.addr) &&
        Objects.equals(name, apiStorageProviderResp.name) &&
        Objects.equals(suspended, apiStorageProviderResp.suspended) &&
        Objects.equals(suspendedReason, apiStorageProviderResp.suspendedReason) &&
        Objects.equals(version, apiStorageProviderResp.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addr, name, suspended, suspendedReason, version);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
