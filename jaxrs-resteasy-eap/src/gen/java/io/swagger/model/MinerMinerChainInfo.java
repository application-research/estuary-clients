package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.List;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyEapServerCodegen", date = "2023-01-30T18:30:34.034Z[GMT]")public class MinerMinerChainInfo   {
  private List<String> addresses = new ArrayList<String>();
  private String owner = null;
  private String peerId = null;
  private String worker = null;

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("addresses")
  public List<String> getAddresses() {
    return addresses;
  }
  public void setAddresses(List<String> addresses) {
    this.addresses = addresses;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("owner")
  public String getOwner() {
    return owner;
  }
  public void setOwner(String owner) {
    this.owner = owner;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("peerId")
  public String getPeerId() {
    return peerId;
  }
  public void setPeerId(String peerId) {
    this.peerId = peerId;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("worker")
  public String getWorker() {
    return worker;
  }
  public void setWorker(String worker) {
    this.worker = worker;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
