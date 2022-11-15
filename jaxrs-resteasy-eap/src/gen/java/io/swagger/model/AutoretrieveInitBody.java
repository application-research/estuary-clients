package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyEapServerCodegen", date = "2022-11-15T21:05:26.247Z[GMT]")public class AutoretrieveInitBody   {
  private String addresses = null;
  private String pubKey = null;

  /**
   * Autoretrieve&#x27;s comma-separated list of addresses
   **/
  
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
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
