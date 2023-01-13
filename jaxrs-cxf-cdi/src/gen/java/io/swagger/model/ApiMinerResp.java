package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.AddressAddress;
import io.swagger.model.MinerMinerChainInfo;
import javax.validation.Valid;
import javax.validation.constraints.*;

import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class ApiMinerResp   {
  private AddressAddress addr = null;
  private MinerMinerChainInfo chainInfo = null;
  private String name = null;
  private Boolean suspended = null;
  private String suspendedReason = null;
  private String version = null;

  /**
   **/
  public ApiMinerResp addr(AddressAddress addr) {
    this.addr = addr;
    return this;
  }

  
  
  @Schema(description = "")
  @JsonProperty("addr")
  @Valid
  public AddressAddress getAddr() {
    return addr;
  }
  public void setAddr(AddressAddress addr) {
    this.addr = addr;
  }

  /**
   **/
  public ApiMinerResp chainInfo(MinerMinerChainInfo chainInfo) {
    this.chainInfo = chainInfo;
    return this;
  }

  
  
  @Schema(description = "")
  @JsonProperty("chain_info")
  @Valid
  public MinerMinerChainInfo getChainInfo() {
    return chainInfo;
  }
  public void setChainInfo(MinerMinerChainInfo chainInfo) {
    this.chainInfo = chainInfo;
  }

  /**
   **/
  public ApiMinerResp name(String name) {
    this.name = name;
    return this;
  }

  
  
  @Schema(description = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  public ApiMinerResp suspended(Boolean suspended) {
    this.suspended = suspended;
    return this;
  }

  
  
  @Schema(description = "")
  @JsonProperty("suspended")
  public Boolean isSuspended() {
    return suspended;
  }
  public void setSuspended(Boolean suspended) {
    this.suspended = suspended;
  }

  /**
   **/
  public ApiMinerResp suspendedReason(String suspendedReason) {
    this.suspendedReason = suspendedReason;
    return this;
  }

  
  
  @Schema(description = "")
  @JsonProperty("suspendedReason")
  public String getSuspendedReason() {
    return suspendedReason;
  }
  public void setSuspendedReason(String suspendedReason) {
    this.suspendedReason = suspendedReason;
  }

  /**
   **/
  public ApiMinerResp version(String version) {
    this.version = version;
    return this;
  }

  
  
  @Schema(description = "")
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
    ApiMinerResp apiMinerResp = (ApiMinerResp) o;
    return Objects.equals(addr, apiMinerResp.addr) &&
        Objects.equals(chainInfo, apiMinerResp.chainInfo) &&
        Objects.equals(name, apiMinerResp.name) &&
        Objects.equals(suspended, apiMinerResp.suspended) &&
        Objects.equals(suspendedReason, apiMinerResp.suspendedReason) &&
        Objects.equals(version, apiMinerResp.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addr, chainInfo, name, suspended, suspendedReason, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiMinerResp {\n");
    
    sb.append("    addr: ").append(toIndentedString(addr)).append("\n");
    sb.append("    chainInfo: ").append(toIndentedString(chainInfo)).append("\n");
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
