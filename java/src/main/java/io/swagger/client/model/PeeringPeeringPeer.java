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

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * PeeringPeeringPeer
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-01-19T16:29:58.195Z[GMT]")
public class PeeringPeeringPeer {
  @SerializedName("Addrs")
  private List<String> addrs = null;

  @SerializedName("Connected")
  private Boolean connected = null;

  @SerializedName("ID")
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
