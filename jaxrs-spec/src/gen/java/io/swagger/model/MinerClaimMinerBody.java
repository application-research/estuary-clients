package io.swagger.model;

import io.swagger.model.AddressAddress;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class MinerClaimMinerBody   {

  private @Valid String claim = null;

  private @Valid AddressAddress miner = null;

  private @Valid String name = null;

  /**
   **/
  public MinerClaimMinerBody claim(String claim) {
    this.claim = claim;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("claim")

  public String getClaim() {
    return claim;
  }
  public void setClaim(String claim) {
    this.claim = claim;
  }

  /**
   **/
  public MinerClaimMinerBody miner(AddressAddress miner) {
    this.miner = miner;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("miner")

  public AddressAddress getMiner() {
    return miner;
  }
  public void setMiner(AddressAddress miner) {
    this.miner = miner;
  }

  /**
   **/
  public MinerClaimMinerBody name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("name")

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MinerClaimMinerBody minerClaimMinerBody = (MinerClaimMinerBody) o;
    return Objects.equals(claim, minerClaimMinerBody.claim) &&
        Objects.equals(miner, minerClaimMinerBody.miner) &&
        Objects.equals(name, minerClaimMinerBody.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(claim, miner, name);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
