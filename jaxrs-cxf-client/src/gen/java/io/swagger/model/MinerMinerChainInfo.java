package io.swagger.model;

import io.swagger.model.AddressAddress;
import java.util.ArrayList;
import java.util.List;

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

public class MinerMinerChainInfo   {
  
  @Schema(description = "")
  private List<String> addresses = null;
  
  @Schema(description = "")
  private AddressAddress owner = null;
  
  @Schema(description = "")
  private String peerId = null;
  
  @Schema(description = "")
  private AddressAddress worker = null;
 /**
   * Get addresses
   * @return addresses
  **/
  @JsonProperty("addresses")
  public List<String> getAddresses() {
    return addresses;
  }

  public void setAddresses(List<String> addresses) {
    this.addresses = addresses;
  }

  public MinerMinerChainInfo addresses(List<String> addresses) {
    this.addresses = addresses;
    return this;
  }

  public MinerMinerChainInfo addAddressesItem(String addressesItem) {
    this.addresses.add(addressesItem);
    return this;
  }

 /**
   * Get owner
   * @return owner
  **/
  @JsonProperty("owner")
  public AddressAddress getOwner() {
    return owner;
  }

  public void setOwner(AddressAddress owner) {
    this.owner = owner;
  }

  public MinerMinerChainInfo owner(AddressAddress owner) {
    this.owner = owner;
    return this;
  }

 /**
   * Get peerId
   * @return peerId
  **/
  @JsonProperty("peerId")
  public String getPeerId() {
    return peerId;
  }

  public void setPeerId(String peerId) {
    this.peerId = peerId;
  }

  public MinerMinerChainInfo peerId(String peerId) {
    this.peerId = peerId;
    return this;
  }

 /**
   * Get worker
   * @return worker
  **/
  @JsonProperty("worker")
  public AddressAddress getWorker() {
    return worker;
  }

  public void setWorker(AddressAddress worker) {
    this.worker = worker;
  }

  public MinerMinerChainInfo worker(AddressAddress worker) {
    this.worker = worker;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
