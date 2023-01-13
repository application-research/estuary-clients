package io.swagger.model;

import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class MinerMinerChainInfo   {

  private @Valid List<String> addresses = new ArrayList<String>();

  private @Valid String owner = null;

  private @Valid String peerId = null;

  private @Valid String worker = null;

  /**
   **/
  public MinerMinerChainInfo addresses(List<String> addresses) {
    this.addresses = addresses;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("addresses")

  public List<String> getAddresses() {
    return addresses;
  }
  public void setAddresses(List<String> addresses) {
    this.addresses = addresses;
  }

  /**
   **/
  public MinerMinerChainInfo owner(String owner) {
    this.owner = owner;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("owner")

  public String getOwner() {
    return owner;
  }
  public void setOwner(String owner) {
    this.owner = owner;
  }

  /**
   **/
  public MinerMinerChainInfo peerId(String peerId) {
    this.peerId = peerId;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("peerId")

  public String getPeerId() {
    return peerId;
  }
  public void setPeerId(String peerId) {
    this.peerId = peerId;
  }

  /**
   **/
  public MinerMinerChainInfo worker(String worker) {
    this.worker = worker;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("worker")

  public String getWorker() {
    return worker;
  }
  public void setWorker(String worker) {
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
    return Objects.equals(addresses, minerMinerChainInfo.addresses) &&
        Objects.equals(owner, minerMinerChainInfo.owner) &&
        Objects.equals(peerId, minerMinerChainInfo.peerId) &&
        Objects.equals(worker, minerMinerChainInfo.worker);
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
