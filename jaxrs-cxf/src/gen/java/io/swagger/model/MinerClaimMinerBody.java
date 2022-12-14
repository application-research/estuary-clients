package io.swagger.model;

import io.swagger.model.AddressAddress;
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

public class MinerClaimMinerBody   {
  
  @Schema(description = "")
  private String claim = null;
  
  @Schema(description = "")
  private AddressAddress miner = null;
  
  @Schema(description = "")
  private String name = null;
 /**
   * Get claim
   * @return claim
  **/
  @JsonProperty("claim")
  public String getClaim() {
    return claim;
  }

  public void setClaim(String claim) {
    this.claim = claim;
  }

  public MinerClaimMinerBody claim(String claim) {
    this.claim = claim;
    return this;
  }

 /**
   * Get miner
   * @return miner
  **/
  @JsonProperty("miner")
  public AddressAddress getMiner() {
    return miner;
  }

  public void setMiner(AddressAddress miner) {
    this.miner = miner;
  }

  public MinerClaimMinerBody miner(AddressAddress miner) {
    this.miner = miner;
    return this;
  }

 /**
   * Get name
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public MinerClaimMinerBody name(String name) {
    this.name = name;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MinerClaimMinerBody {\n");
    
    sb.append("    claim: ").append(toIndentedString(claim)).append("\n");
    sb.append("    miner: ").append(toIndentedString(miner)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
