package io.swagger.model;

import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;

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

public class PeeringPeeringPeer   {
  
  @Schema(description = "")
  private List<String> addrs = null;
  
  @Schema(description = "")
  private Boolean connected = null;
  
  @Schema(description = "")
  private String ID = null;
 /**
   * Get addrs
   * @return addrs
  **/
  @JsonProperty("Addrs")
  public List<String> getAddrs() {
    return addrs;
  }

  public void setAddrs(List<String> addrs) {
    this.addrs = addrs;
  }

  public PeeringPeeringPeer addrs(List<String> addrs) {
    this.addrs = addrs;
    return this;
  }

  public PeeringPeeringPeer addAddrsItem(String addrsItem) {
    this.addrs.add(addrsItem);
    return this;
  }

 /**
   * Get connected
   * @return connected
  **/
  @JsonProperty("Connected")
  public Boolean isConnected() {
    return connected;
  }

  public void setConnected(Boolean connected) {
    this.connected = connected;
  }

  public PeeringPeeringPeer connected(Boolean connected) {
    this.connected = connected;
    return this;
  }

 /**
   * Get ID
   * @return ID
  **/
  @JsonProperty("ID")
  public String getID() {
    return ID;
  }

  public void setID(String ID) {
    this.ID = ID;
  }

  public PeeringPeeringPeer ID(String ID) {
    this.ID = ID;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
