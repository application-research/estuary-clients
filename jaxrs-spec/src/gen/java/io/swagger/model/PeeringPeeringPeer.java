package io.swagger.model;

import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PeeringPeeringPeer   {

  private @Valid List<String> addrs = new ArrayList<String>();

  private @Valid Boolean connected = null;

  private @Valid String ID = null;

  /**
   **/
  public PeeringPeeringPeer addrs(List<String> addrs) {
    this.addrs = addrs;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("Addrs")

  public List<String> getAddrs() {
    return addrs;
  }
  public void setAddrs(List<String> addrs) {
    this.addrs = addrs;
  }

  /**
   **/
  public PeeringPeeringPeer connected(Boolean connected) {
    this.connected = connected;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("Connected")

  public Boolean isConnected() {
    return connected;
  }
  public void setConnected(Boolean connected) {
    this.connected = connected;
  }

  /**
   **/
  public PeeringPeeringPeer ID(String ID) {
    this.ID = ID;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("ID")

  public String getID() {
    return ID;
  }
  public void setID(String ID) {
    this.ID = ID;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PeeringPeeringPeer peeringPeeringPeer = (PeeringPeeringPeer) o;
    return Objects.equals(addrs, peeringPeeringPeer.addrs) &&
        Objects.equals(connected, peeringPeeringPeer.connected) &&
        Objects.equals(ID, peeringPeeringPeer.ID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addrs, connected, ID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PeeringPeeringPeer {\n");
    
    sb.append("    addrs: ").append(toIndentedString(addrs)).append("\n");
    sb.append("    connected: ").append(toIndentedString(connected)).append("\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
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
