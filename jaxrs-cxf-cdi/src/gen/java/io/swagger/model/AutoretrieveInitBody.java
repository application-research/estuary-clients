package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import javax.validation.constraints.*;

import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class AutoretrieveInitBody   {
  private String addresses = null;
  private String pubKey = null;

  /**
   * Autoretrieve&#x27;s comma-separated list of addresses
   **/
  public AutoretrieveInitBody addresses(String addresses) {
    this.addresses = addresses;
    return this;
  }

  
  
  @Schema(required = true, description = "Autoretrieve's comma-separated list of addresses")
  @JsonProperty("addresses")
  @NotNull
  public String getAddresses() {
    return addresses;
  }
  public void setAddresses(String addresses) {
    this.addresses = addresses;
  }

  /**
   * Autoretrieve&#x27;s public key
   **/
  public AutoretrieveInitBody pubKey(String pubKey) {
    this.pubKey = pubKey;
    return this;
  }

  
  
  @Schema(required = true, description = "Autoretrieve's public key")
  @JsonProperty("pubKey")
  @NotNull
  public String getPubKey() {
    return pubKey;
  }
  public void setPubKey(String pubKey) {
    this.pubKey = pubKey;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutoretrieveInitBody autoretrieveInitBody = (AutoretrieveInitBody) o;
    return Objects.equals(addresses, autoretrieveInitBody.addresses) &&
        Objects.equals(pubKey, autoretrieveInitBody.pubKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addresses, pubKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutoretrieveInitBody {\n");
    
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    pubKey: ").append(toIndentedString(pubKey)).append("\n");
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
