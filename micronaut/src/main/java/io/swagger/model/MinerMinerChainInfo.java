package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.AddressAddress;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import io.micronaut.validation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * MinerMinerChainInfo
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.MicronautCodegen", date = "2023-02-02T18:38:35.656Z[GMT]")
public class MinerMinerChainInfo   {
  @JsonProperty("addresses")
  @Valid
  private List<String> addresses = null;

  @JsonProperty("owner")
  private AddressAddress owner = null;

  @JsonProperty("peerId")
  private String peerId = null;

  @JsonProperty("worker")
  private AddressAddress worker = null;

  public MinerMinerChainInfo addresses(List<String> addresses) {
    this.addresses = addresses;
    return this;
  }

  public MinerMinerChainInfo addAddressesItem(String addressesItem) {
    if (this.addresses == null) {
      this.addresses = new ArrayList<String>();
    }
    this.addresses.add(addressesItem);
    return this;
  }

  /**
   * Get addresses
   * @return addresses
  **/
  @Schema(description = "")

  public List<String> getAddresses() {
    return addresses;
  }

  public void setAddresses(List<String> addresses) {
    this.addresses = addresses;
  }

  public MinerMinerChainInfo owner(AddressAddress owner) {
    this.owner = owner;
    return this;
  }

  /**
   * Get owner
   * @return owner
  **/
  @Schema(description = "")

  @Valid
  public AddressAddress getOwner() {
    return owner;
  }

  public void setOwner(AddressAddress owner) {
    this.owner = owner;
  }

  public MinerMinerChainInfo peerId(String peerId) {
    this.peerId = peerId;
    return this;
  }

  /**
   * Get peerId
   * @return peerId
  **/
  @Schema(description = "")

  public String getPeerId() {
    return peerId;
  }

  public void setPeerId(String peerId) {
    this.peerId = peerId;
  }

  public MinerMinerChainInfo worker(AddressAddress worker) {
    this.worker = worker;
    return this;
  }

  /**
   * Get worker
   * @return worker
  **/
  @Schema(description = "")

  @Valid
  public AddressAddress getWorker() {
    return worker;
  }

  public void setWorker(AddressAddress worker) {
    this.worker = worker;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MinerMinerChainInfo minerMinerChainInfo = (MinerMinerChainInfo) o;
    return Objects.equals(this.addresses, minerMinerChainInfo.addresses) &&
        Objects.equals(this.owner, minerMinerChainInfo.owner) &&
        Objects.equals(this.peerId, minerMinerChainInfo.peerId) &&
        Objects.equals(this.worker, minerMinerChainInfo.worker);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addresses, owner, peerId, worker);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MinerMinerChainInfo {\n");
    
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    peerId: ").append(toIndentedString(peerId)).append("\n");
    sb.append("    worker: ").append(toIndentedString(worker)).append("\n");
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
