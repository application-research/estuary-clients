package io.swagger.model;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.AddressAddress;
import io.swagger.v3.oas.annotations.media.Schema;



@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaInflectorServerCodegen", date = "2023-02-02T18:38:34.241Z[GMT]")
public class MinerClaimMinerBody   {
  @JsonProperty("claim")
  private String claim = null;
  @JsonProperty("miner")
  private AddressAddress miner = null;
  @JsonProperty("name")
  private String name = null;
  /**
   **/
  public MinerClaimMinerBody claim(String claim) {
    this.claim = claim;
    return this;
  }

  
  @Schema(description = "")
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

  
  @Schema(description = "")
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

  
  @Schema(description = "")
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
