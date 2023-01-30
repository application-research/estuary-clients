/*
 * Estuary API
 * This is the API for the Estuary application.
 *
 * OpenAPI spec version: 0.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * PeeringPeeringPeer
 */
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyDIServerCodegen", date = "2023-01-30T18:30:33.522Z[GMT]")public class PeeringPeeringPeer   {
  @JsonProperty("Addrs")
  private List<String> addrs = null;

  @JsonProperty("Connected")
  private Boolean connected = null;

  @JsonProperty("ID")
  private String ID = null;

  public PeeringPeeringPeer addrs(List<String> addrs) {
    this.addrs = addrs;
    return this;
  }

  public PeeringPeeringPeer addAddrsItem(String addrsItem) {
    if (this.addrs == null) {
      this.addrs = new ArrayList<String>();
    }
    this.addrs.add(addrsItem);
    return this;
  }

  /**
   * Get addrs
   * @return addrs
   **/
  @JsonProperty("Addrs")
  @Schema(description = "")
  public List<String> getAddrs() {
    return addrs;
  }

  public void setAddrs(List<String> addrs) {
    this.addrs = addrs;
  }

  public PeeringPeeringPeer connected(Boolean connected) {
    this.connected = connected;
    return this;
  }

  /**
   * Get connected
   * @return connected
   **/
  @JsonProperty("Connected")
  @Schema(description = "")
  public Boolean isConnected() {
    return connected;
  }

  public void setConnected(Boolean connected) {
    this.connected = connected;
  }

  public PeeringPeeringPeer ID(String ID) {
    this.ID = ID;
    return this;
  }

  /**
   * Get ID
   * @return ID
   **/
  @JsonProperty("ID")
  @Schema(description = "")
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
    return Objects.equals(this.addrs, peeringPeeringPeer.addrs) &&
        Objects.equals(this.connected, peeringPeeringPeer.connected) &&
        Objects.equals(this.ID, peeringPeeringPeer.ID);
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
