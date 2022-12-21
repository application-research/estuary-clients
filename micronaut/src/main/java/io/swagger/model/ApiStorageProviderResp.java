package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.AddressAddress;
import io.swagger.v3.oas.annotations.media.Schema;
import io.micronaut.validation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ApiStorageProviderResp
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.MicronautCodegen", date = "2022-12-21T01:22:09.878Z[GMT]")
public class ApiStorageProviderResp   {
  @JsonProperty("addr")
  private AddressAddress addr = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("suspended")
  private Boolean suspended = null;

  @JsonProperty("suspendedReason")
  private String suspendedReason = null;

  @JsonProperty("version")
  private String version = null;

  public ApiStorageProviderResp addr(AddressAddress addr) {
    this.addr = addr;
    return this;
  }

  /**
   * Get addr
   * @return addr
  **/
  @Schema(description = "")

  @Valid
  public AddressAddress getAddr() {
    return addr;
  }

  public void setAddr(AddressAddress addr) {
    this.addr = addr;
  }

  public ApiStorageProviderResp name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @Schema(description = "")

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ApiStorageProviderResp suspended(Boolean suspended) {
    this.suspended = suspended;
    return this;
  }

  /**
   * Get suspended
   * @return suspended
  **/
  @Schema(description = "")

  public Boolean isSuspended() {
    return suspended;
  }

  public void setSuspended(Boolean suspended) {
    this.suspended = suspended;
  }

  public ApiStorageProviderResp suspendedReason(String suspendedReason) {
    this.suspendedReason = suspendedReason;
    return this;
  }

  /**
   * Get suspendedReason
   * @return suspendedReason
  **/
  @Schema(description = "")

  public String getSuspendedReason() {
    return suspendedReason;
  }

  public void setSuspendedReason(String suspendedReason) {
    this.suspendedReason = suspendedReason;
  }

  public ApiStorageProviderResp version(String version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
  **/
  @Schema(description = "")

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
    return Objects.equals(this.addr, apiStorageProviderResp.addr) &&
        Objects.equals(this.name, apiStorageProviderResp.name) &&
        Objects.equals(this.suspended, apiStorageProviderResp.suspended) &&
        Objects.equals(this.suspendedReason, apiStorageProviderResp.suspendedReason) &&
        Objects.equals(this.version, apiStorageProviderResp.version);
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
