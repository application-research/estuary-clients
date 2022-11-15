package io.swagger.model;


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

public class AutoretrieveInitBody   {
  
  @Schema(required = true, description = "Autoretrieve's comma-separated list of addresses")
 /**
   * Autoretrieve's comma-separated list of addresses  
  **/
  private String addresses = null;
  
  @Schema(required = true, description = "Autoretrieve's public key")
 /**
   * Autoretrieve's public key  
  **/
  private String pubKey = null;
 /**
   * Autoretrieve&#x27;s comma-separated list of addresses
   * @return addresses
  **/
  @JsonProperty("addresses")
  public String getAddresses() {
    return addresses;
  }

  public void setAddresses(String addresses) {
    this.addresses = addresses;
  }

  public AutoretrieveInitBody addresses(String addresses) {
    this.addresses = addresses;
    return this;
  }

 /**
   * Autoretrieve&#x27;s public key
   * @return pubKey
  **/
  @JsonProperty("pubKey")
  public String getPubKey() {
    return pubKey;
  }

  public void setPubKey(String pubKey) {
    this.pubKey = pubKey;
  }

  public AutoretrieveInitBody pubKey(String pubKey) {
    this.pubKey = pubKey;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
